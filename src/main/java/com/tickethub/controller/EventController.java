package com.tickethub.controller;

import com.tickethub.dto.eventDto.EventResponse;
import com.tickethub.dto.eventDto.EventSummaryResponse;
import com.tickethub.enums.EventCategory;
import com.tickethub.enums.EventStatus;
import com.tickethub.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping
    public ResponseEntity<Page<EventSummaryResponse>> searchAndFilterEvents(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) EventCategory category,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate,
            @RequestParam(required = false) BigDecimal minPrice,
            @RequestParam(required = false) BigDecimal maxPrice,
            @PageableDefault(size = 20, sort = "eventDateTime") Pageable pageable) {
        
        // If no filters provided, use the simple getAllPublishedEvents method
        if (q == null && category == null && city == null && startDate == null && 
            endDate == null && minPrice == null && maxPrice == null) {
            return ResponseEntity.ok(eventService.getAllPublishedEvents(pageable));
        }
        
        // Otherwise use the search and filter method
        Page<EventSummaryResponse> events = eventService.searchAndFilterEvents(
                q, category, city, startDate, endDate, minPrice, maxPrice, pageable);
        return ResponseEntity.ok(events);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponse> getEventById(@PathVariable Long id) {
        EventResponse event = eventService.getEventById(id);
        if (event.getStatus() != EventStatus.PUBLISHED) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(event);
    }
}


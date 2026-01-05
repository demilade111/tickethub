package com.tickethub.controller;

import com.tickethub.dto.eventDto.EventResponse;
import com.tickethub.dto.eventDto.EventSummaryResponse;
import com.tickethub.enums.EventStatus;
import com.tickethub.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping
    public ResponseEntity<Page<EventSummaryResponse>> getAllPublishedEvents(
            @PageableDefault(size = 20, sort = "eventDateTime") Pageable pageable) {
        Page<EventSummaryResponse> events = eventService.getAllPublishedEvents(pageable);
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


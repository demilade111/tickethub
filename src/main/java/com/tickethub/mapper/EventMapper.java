package com.tickethub.mapper;

import com.tickethub.dto.eventDto.CreateEventRequest;
import com.tickethub.dto.eventDto.EventResponse;
import com.tickethub.dto.eventDto.EventSummaryResponse;
import com.tickethub.dto.eventDto.UpdateEventRequest;
import com.tickethub.dto.eventDto.VenueSummaryResponse;
import com.tickethub.entity.Event;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventResponse toResponse(Event event) {
        if (event == null) {
            return null;
        }

        VenueSummaryResponse venueSummary = null;
        if (event.getVenue() != null) {
            venueSummary = VenueSummaryResponse.builder()
                    .id(event.getVenue().getId())
                    .name(event.getVenue().getName())
                    .address(event.getVenue().getAddress())
                    .city(event.getVenue().getCity())
                    .state(event.getVenue().getState())
                    .build();
        }

        String createdByName = null;
        if (event.getCreatedBy() != null) {
            createdByName = event.getCreatedBy().getName();
        }

        return EventResponse.builder()
                .id(event.getId())
                .name(event.getName())
                .description(event.getDescription())
                .artistName(event.getArtistName())
                .eventDateTime(event.getEventDateTime())
                .endDateTime(event.getEndDateTime())
                .price(event.getPrice())
                .totalTickets(event.getTotalTickets())
                .availableTickets(event.getAvailableTickets())
                .imageUrl(event.getImageUrl())
                .status(event.getStatus())
                .category(event.getCategory())
                .venue(venueSummary)
                .createdByName(createdByName)
                .createdAt(event.getCreatedAt())
                .updatedAt(event.getUpdatedAt())
                .build();
    }

    public EventSummaryResponse toSummaryResponse(Event event) {
        if (event == null) {
            return null;
        }

        String venueName = null;
        String venueCity = null;
        if (event.getVenue() != null) {
            venueName = event.getVenue().getName();
            venueCity = event.getVenue().getCity();
        }

        return EventSummaryResponse.builder()
                .id(event.getId())
                .name(event.getName())
                .artistName(event.getArtistName())
                .eventDateTime(event.getEventDateTime())
                .price(event.getPrice())
                .availableTickets(event.getAvailableTickets())
                .imageUrl(event.getImageUrl())
                .status(event.getStatus())
                .category(event.getCategory())
                .venueName(venueName)
                .venueCity(venueCity)
                .build();
    }

    public Event toEntity(CreateEventRequest request) {
        if (request == null) {
            return null;
        }

        return Event.builder()
                .name(request.getName())
                .description(request.getDescription())
                .artistName(request.getArtistName())
                .eventDateTime(request.getEventDateTime())
                .endDateTime(request.getEndDateTime())
                .price(request.getPrice())
                .totalTickets(request.getTotalTickets())
                .availableTickets(request.getTotalTickets())
                .imageUrl(request.getImageUrl())
                .category(request.getCategory())
                .build();
    }

    public void updateEntity(UpdateEventRequest request, Event event) {
        if (request == null || event == null) {
            return;
        }

        if (request.getName() != null) {
            event.setName(request.getName());
        }
        if (request.getDescription() != null) {
            event.setDescription(request.getDescription());
        }
        if (request.getArtistName() != null) {
            event.setArtistName(request.getArtistName());
        }
        if (request.getEventDateTime() != null) {
            event.setEventDateTime(request.getEventDateTime());
        }
        if (request.getEndDateTime() != null) {
            event.setEndDateTime(request.getEndDateTime());
        }
        if (request.getPrice() != null) {
            event.setPrice(request.getPrice());
        }
        if (request.getTotalTickets() != null) {
            event.setTotalTickets(request.getTotalTickets());
        }
        if (request.getImageUrl() != null) {
            event.setImageUrl(request.getImageUrl());
        }
        if (request.getCategory() != null) {
            event.setCategory(request.getCategory());
        }
    }
}


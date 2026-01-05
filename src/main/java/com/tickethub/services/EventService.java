package com.tickethub.services;

import com.tickethub.dto.eventDto.CreateEventRequest;
import com.tickethub.dto.eventDto.EventResponse;
import com.tickethub.dto.eventDto.EventSummaryResponse;
import com.tickethub.dto.eventDto.UpdateEventRequest;
import com.tickethub.entity.Event;
import com.tickethub.entity.User;
import com.tickethub.entity.Venue;
import com.tickethub.enums.EventStatus;
import com.tickethub.exception.ResourceNotFoundException;
import com.tickethub.mapper.EventMapper;
import com.tickethub.repository.EventRepository;
import com.tickethub.repository.UserRepository;
import com.tickethub.repository.venueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventService {

    private final EventRepository eventRepository;
    private final venueRepository venueRepository;
    private final UserRepository userRepository;
    private final EventMapper eventMapper;

    @Transactional
    public EventResponse createEvent(CreateEventRequest request) {
        Objects.requireNonNull(request, "Request cannot be null");
        
        Long venueId = Objects.requireNonNull(request.getVenueId(), "Venue ID cannot be null");
        Venue venue = venueRepository.findById(venueId)
                .orElseThrow(() -> {
                    log.warn("Venue not found with id: {}", venueId);
                    return new ResourceNotFoundException("Venue not found with id: " + venueId);
                });

        if (request.getTotalTickets() > venue.getCapacity()) {
            log.warn("Total tickets {} exceeds venue capacity {}", request.getTotalTickets(), venue.getCapacity());
            throw new IllegalArgumentException("Total tickets cannot exceed venue capacity");
        }

        User currentUser = getCurrentUser();
        Event event = eventMapper.toEntity(request);
        event.setVenue(venue);
        event.setCreatedBy(currentUser);
        event.setStatus(EventStatus.DRAFT);
        event.setAvailableTickets(request.getTotalTickets());

        Event savedEvent = eventRepository.save(Objects.requireNonNull(event, "Event cannot be null"));
        log.info("Event created successfully: {} by user: {}", savedEvent.getId(), currentUser.getEmail());
        return eventMapper.toResponse(savedEvent);
    }

    @Transactional(readOnly = true)
    public EventResponse getEventById(Long id) {
        Objects.requireNonNull(id, "Id cannot be null");
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Event not found with id: {}", id);
                    return new ResourceNotFoundException("Event not found with id: " + id);
                });
        return eventMapper.toResponse(event);
    }

    @Transactional(readOnly = true)
    public Page<EventSummaryResponse> getAllPublishedEvents(Pageable pageable) {
        return eventRepository.findByStatus(EventStatus.PUBLISHED, pageable)
                .map(eventMapper::toSummaryResponse);
    }

    @Transactional
    public EventResponse updateEvent(Long id, UpdateEventRequest request) {
        Objects.requireNonNull(id, "Id cannot be null");
        Objects.requireNonNull(request, "Request cannot be null");
        
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Event not found with id: {}", id);
                    return new ResourceNotFoundException("Event not found with id: " + id);
                });

        if (event.getStatus() != EventStatus.DRAFT) {
            log.warn("Cannot update event {} with status {}", id, event.getStatus());
            throw new IllegalStateException("Can only update events with DRAFT status");
        }

        if (request.getVenueId() != null) {
            Long venueId = Objects.requireNonNull(request.getVenueId(), "Venue ID cannot be null");
            Venue venue = venueRepository.findById(venueId)
                    .orElseThrow(() -> {
                        log.warn("Venue not found with id: {}", venueId);
                        return new ResourceNotFoundException("Venue not found with id: " + venueId);
                    });
            event.setVenue(venue);
        }

        if (request.getTotalTickets() != null) {
            Venue venue = event.getVenue();
            if (request.getTotalTickets() > venue.getCapacity()) {
                log.warn("Total tickets {} exceeds venue capacity {}", request.getTotalTickets(), venue.getCapacity());
                throw new IllegalArgumentException("Total tickets cannot exceed venue capacity");
            }
            int ticketsDifference = request.getTotalTickets() - event.getTotalTickets();
            event.setAvailableTickets(event.getAvailableTickets() + ticketsDifference);
        }

        eventMapper.updateEntity(request, event);
        Event updatedEvent = eventRepository.save(Objects.requireNonNull(event, "Event cannot be null"));
        log.info("Event updated successfully: {}", updatedEvent.getId());
        return eventMapper.toResponse(updatedEvent);
    }

    @Transactional
    public EventResponse publishEvent(Long id) {
        Objects.requireNonNull(id, "Id cannot be null");
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Event not found with id: {}", id);
                    return new ResourceNotFoundException("Event not found with id: " + id);
                });

        if (event.getStatus() != EventStatus.DRAFT) {
            log.warn("Cannot publish event {} with status {}", id, event.getStatus());
            throw new IllegalStateException("Can only publish events with DRAFT status");
        }

        event.setStatus(EventStatus.PUBLISHED);
        Event publishedEvent = eventRepository.save(Objects.requireNonNull(event, "Event cannot be null"));
        log.info("Event published successfully: {}", publishedEvent.getId());
        return eventMapper.toResponse(publishedEvent);
    }

    @Transactional
    public EventResponse cancelEvent(Long id) {
        Objects.requireNonNull(id, "Id cannot be null");
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Event not found with id: {}", id);
                    return new ResourceNotFoundException("Event not found with id: " + id);
                });

        if (event.getStatus() == EventStatus.CANCELLED || event.getStatus() == EventStatus.COMPLETED) {
            log.warn("Cannot cancel event {} with status {}", id, event.getStatus());
            throw new IllegalStateException("Event is already " + event.getStatus());
        }

        event.setStatus(EventStatus.CANCELLED);
        Event cancelledEvent = eventRepository.save(Objects.requireNonNull(event, "Event cannot be null"));
        log.info("Event cancelled successfully: {}", cancelledEvent.getId());
        return eventMapper.toResponse(cancelledEvent);
    }

    @Transactional
    public void deleteEvent(Long id) {
        Objects.requireNonNull(id, "Id cannot be null");
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Event not found with id: {}", id);
                    return new ResourceNotFoundException("Event not found with id: " + id);
                });

        if (event.getStatus() != EventStatus.DRAFT) {
            log.warn("Cannot delete event {} with status {}", id, event.getStatus());
            throw new IllegalStateException("Can only delete events with DRAFT status");
        }

        eventRepository.deleteById(id);
        log.info("Event deleted successfully: {}", id);
    }

    private User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            throw new IllegalStateException("No authenticated user found");
        }

        String email = authentication.getName();
        return userRepository.findByEmail(email)
                .orElseThrow(() -> {
                    log.error("User not found with email: {}", email);
                    return new ResourceNotFoundException("User not found with email: " + email);
                });
    }
}


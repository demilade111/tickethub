package com.tickethub.repository;

import com.tickethub.entity.Event;
import com.tickethub.enums.EventCategory;
import com.tickethub.enums.EventStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByStatus(EventStatus status);
    Page<Event> findByStatus(EventStatus status, Pageable pageable);
    List<Event> findByCategory(EventCategory category);
    List<Event> findByVenueId(Long venueId);
    List<Event> findByCreatedBy_Id(Long userId);
}


package com.tickethub.dto.eventDto;

import com.tickethub.enums.EventCategory;
import com.tickethub.enums.EventStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventResponse {
    private Long id;
    private String name;
    private String description;
    private String artistName;
    private LocalDateTime eventDateTime;
    private LocalDateTime endDateTime;
    private BigDecimal price;
    private Integer totalTickets;
    private Integer availableTickets;
    private String imageUrl;
    private EventStatus status;
    private EventCategory category;
    private VenueSummaryResponse venue;
    private String createdByName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}


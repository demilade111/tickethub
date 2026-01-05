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
public class EventSummaryResponse {
    private Long id;
    private String name;
    private String artistName;
    private LocalDateTime eventDateTime;
    private BigDecimal price;
    private Integer availableTickets;
    private String imageUrl;
    private EventStatus status;
    private EventCategory category;
    private String venueName;
    private String venueCity;
}


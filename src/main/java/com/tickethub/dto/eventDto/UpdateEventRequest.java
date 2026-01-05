package com.tickethub.dto.eventDto;

import com.tickethub.enums.EventCategory;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateEventRequest {

    @Size(min = 1, max = 300, message = "Name must be between 1 and 300 characters")
    private String name;

    @Size(min = 1, max = 5000, message = "Description must be between 1 and 5000 characters")
    private String description;

    @Size(max = 200, message = "Artist name cannot exceed 200 characters")
    private String artistName;

    @Future(message = "Event date and time must be in the future")
    private LocalDateTime eventDateTime;

    private LocalDateTime endDateTime;

    @DecimalMin(value = "0.0", inclusive = true, message = "Price must be 0 or greater")
    @DecimalMax(value = "99999.99", message = "Price cannot exceed 99999.99")
    @Digits(integer = 5, fraction = 2, message = "Price must have at most 5 integer digits and 2 decimal places")
    private BigDecimal price;

    @Min(value = 1, message = "Total tickets must be at least 1")
    private Integer totalTickets;

    @Size(max = 500, message = "Image URL cannot exceed 500 characters")
    @Pattern(regexp = "^$|^https?://.*", message = "Image URL must be a valid URL or empty")
    private String imageUrl;

    private EventCategory category;

    private Long venueId;
}


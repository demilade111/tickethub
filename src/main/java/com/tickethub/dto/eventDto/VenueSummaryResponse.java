package com.tickethub.dto.eventDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VenueSummaryResponse {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
}


package com.tickethub.mapper;

import com.tickethub.dto.venueDto.CreateVenueRequest;
import com.tickethub.dto.venueDto.UpdateVenueRequest;
import com.tickethub.dto.venueDto.VenueResponse;
import com.tickethub.entity.Venue;
import org.springframework.stereotype.Component;

@Component
public class VenueMapper {

    public VenueResponse toResponse(Venue venue) {
        if (venue == null) {
            return null;
        }

        return VenueResponse.builder()
                .id(venue.getId())
                .name(venue.getName())
                .address(venue.getAddress())
                .city(venue.getCity())
                .state(venue.getState())
                .zipCode(venue.getZipCode())
                .country(venue.getCountry())
                .capacity(venue.getCapacity())
                .description(venue.getDescription())
                .imageUrl(venue.getImageUrl())
                .contactEmail(venue.getContactEmail())
                .contactPhone(venue.getContactPhone())
                .createdAt(venue.getCreatedAt())
                .updatedAt(venue.getUpdatedAt())
                .build();
    }

    public Venue toEntity(CreateVenueRequest request) {
        if (request == null) {
            return null;
        }

        return Venue.builder()
                .name(request.getName())
                .address(request.getAddress())
                .city(request.getCity())
                .state(request.getState())
                .zipCode(request.getZipCode())
                .country(request.getCountry() != null ? request.getCountry() : "USA")
                .capacity(request.getCapacity())
                .description(request.getDescription())
                .imageUrl(request.getImageUrl())
                .contactEmail(request.getContactEmail())
                .contactPhone(request.getContactPhone())
                .build();
    }

    public void updateEntity(UpdateVenueRequest request, Venue venue) {
        if (request == null || venue == null) {
            return;
        }

        if (request.getName() != null) {
            venue.setName(request.getName());
        }
        if (request.getAddress() != null) {
            venue.setAddress(request.getAddress());
        }
        if (request.getCity() != null) {
            venue.setCity(request.getCity());
        }
        if (request.getState() != null) {
            venue.setState(request.getState());
        }
        if (request.getZipCode() != null) {
            venue.setZipCode(request.getZipCode());
        }
        if (request.getCountry() != null) {
            venue.setCountry(request.getCountry());
        }
        if (request.getCapacity() != null) {
            venue.setCapacity(request.getCapacity());
        }
        if (request.getDescription() != null) {
            venue.setDescription(request.getDescription());
        }
        if (request.getImageUrl() != null) {
            venue.setImageUrl(request.getImageUrl());
        }
        if (request.getContactEmail() != null) {
            venue.setContactEmail(request.getContactEmail());
        }
        if (request.getContactPhone() != null) {
            venue.setContactPhone(request.getContactPhone());
        }
    }
}


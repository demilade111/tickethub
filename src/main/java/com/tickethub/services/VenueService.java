package com.tickethub.services;

import com.tickethub.dto.venueDto.CreateVenueRequest;
import com.tickethub.dto.venueDto.UpdateVenueRequest;
import com.tickethub.dto.venueDto.VenueResponse;
import com.tickethub.entity.Venue;
import com.tickethub.exception.ResourceNotFoundException;
import com.tickethub.mapper.VenueMapper;
import com.tickethub.repository.venueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class VenueService {
    
    private final venueRepository venueRepository;
    private final VenueMapper venueMapper;

    @Transactional
    public VenueResponse createVenue(CreateVenueRequest request) {
        Objects.requireNonNull(request, "Request cannot be null");
        Venue venue = venueMapper.toEntity(request);
        Venue savedVenue = venueRepository.save(Objects.requireNonNull(venue, "Venue cannot be null"));
        log.info("Venue created successfully: {}", savedVenue.getId());
        return venueMapper.toResponse(savedVenue);
    }

    @Transactional(readOnly = true)
    public List<VenueResponse> getAllVenues() {
        List<Venue> venues = venueRepository.findAll();
        return venues.stream()
                .map(venueMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public VenueResponse getVenueById(Long id) {
        Objects.requireNonNull(id, "Id cannot be null");
        Venue venue = venueRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Venue not found with id: {}", id);
                    return new ResourceNotFoundException("Venue not found with id: " + id);
                });
        return venueMapper.toResponse(venue);
    }

    @Transactional
    public VenueResponse updateVenue(Long id, UpdateVenueRequest request) {
        Objects.requireNonNull(id, "Id cannot be null");
        Objects.requireNonNull(request, "Request cannot be null");
        Venue venue = venueRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Venue not found with id: {}", id);
                    return new ResourceNotFoundException("Venue not found with id: " + id);
                });
        
        venueMapper.updateEntity(request, venue);
        Venue updatedVenue = venueRepository.save(Objects.requireNonNull(venue, "Venue cannot be null"));
        log.info("Venue updated successfully: {}", updatedVenue.getId());
        return venueMapper.toResponse(updatedVenue);
    }

    @Transactional
    public void deleteVenue(Long id) {
        Objects.requireNonNull(id, "Id cannot be null");
        if (!venueRepository.existsById(id)) {
            log.warn("Venue not found with id: {}", id);
            throw new ResourceNotFoundException("Venue not found with id: " + id);
        }
        venueRepository.deleteById(id);
        log.info("Venue deleted successfully: {}", id);
    }
}

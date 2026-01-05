package com.tickethub.specification;

import com.tickethub.entity.Event;
import com.tickethub.enums.EventCategory;
import com.tickethub.enums.EventStatus;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventSpecification {

  
    public static Specification<Event> isPublished() {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("status"), EventStatus.PUBLISHED);
    }

    public static Specification<Event> searchByNameOrArtist(String searchQuery) {
        if (searchQuery == null || searchQuery.trim().isEmpty()) {
            return Specification.where(null); 
        }
        
        String pattern = "%" + searchQuery.toLowerCase() + "%";
        return (root, query, criteriaBuilder) -> {
            Predicate namePredicate = criteriaBuilder.like(
                    criteriaBuilder.lower(root.get("name")), pattern);
            Predicate artistPredicate = criteriaBuilder.like(
                    criteriaBuilder.lower(root.get("artistName")), pattern);
            return criteriaBuilder.or(namePredicate, artistPredicate);
        };
    }

    /**
     * Filter by category
     */
    public static Specification<Event> hasCategory(EventCategory category) {
        if (category == null) {
            return Specification.where(null);
        }
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("category"), category);
    }

    /**
     * Filter by city (from venue)
     */
    public static Specification<Event> hasCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            return Specification.where(null);
        }
        return (root, query, criteriaBuilder) -> {
            String pattern = "%" + city.toLowerCase() + "%";
            return criteriaBuilder.like(
                    criteriaBuilder.lower(root.join("venue", JoinType.INNER).get("city")), pattern);
        };
    }

    /**
     * Filter by start date (events on or after this date)
     */
    public static Specification<Event> eventDateOnOrAfter(LocalDateTime startDate) {
        if (startDate == null) {
            return Specification.where(null);
        }
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThanOrEqualTo(root.get("eventDateTime"), startDate);
    }

    /**
     * Filter by end date (events on or before this date)
     */
    public static Specification<Event> eventDateOnOrBefore(LocalDateTime endDate) {
        if (endDate == null) {
            return Specification.where(null);
        }
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThanOrEqualTo(root.get("eventDateTime"), endDate);
    }

    /**
     * Filter by minimum price
     */
    public static Specification<Event> priceGreaterThanOrEqual(BigDecimal minPrice) {
        if (minPrice == null) {
            return Specification.where(null);
        }
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThanOrEqualTo(root.get("price"), minPrice);
    }

    /**
     * Filter by maximum price
     */
    public static Specification<Event> priceLessThanOrEqual(BigDecimal maxPrice) {
        if (maxPrice == null) {
            return Specification.where(null);
        }
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThanOrEqualTo(root.get("price"), maxPrice);
    }

    /**
     * Combines all specifications with AND logic
     */
    public static Specification<Event> combineSpecifications(
            String searchQuery,
            EventCategory category,
            String city,
            LocalDateTime startDate,
            LocalDateTime endDate,
            BigDecimal minPrice,
            BigDecimal maxPrice) {
        
        Specification<Event> spec = isPublished(); // Base: only published events
        
        spec = spec.and(searchByNameOrArtist(searchQuery));
        spec = spec.and(hasCategory(category));
        spec = spec.and(hasCity(city));
        spec = spec.and(eventDateOnOrAfter(startDate));
        spec = spec.and(eventDateOnOrBefore(endDate));
        spec = spec.and(priceGreaterThanOrEqual(minPrice));
        spec = spec.and(priceLessThanOrEqual(maxPrice));
        
        return spec;
    }
}


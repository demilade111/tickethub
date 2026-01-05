package com.tickethub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickethub.entity.Venue;
@Repository
public interface venueRepository extends JpaRepository<Venue, Long>

{
     List<Venue> findByName(String name);

     List<Venue> findBycity(String city);
}

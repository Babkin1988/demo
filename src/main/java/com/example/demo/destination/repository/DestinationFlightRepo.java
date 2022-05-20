package com.example.demo.destination.repository;

import com.example.demo.destination.domain.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationFlightRepo extends CrudRepository<Flight, Long> {
}

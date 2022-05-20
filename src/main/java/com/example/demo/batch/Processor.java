package com.example.demo.batch;

import com.example.demo.domain.Flight;
import lombok.NonNull;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Flight, com.example.demo.destination.domain.Flight> {


    @Override
    public com.example.demo.destination.domain.Flight process(@NonNull Flight flight) throws Exception {
        return com.example.demo.destination.domain.Flight.builder()
                .flight_id(flight.getFlight_id())
                .actual_arrival(flight.getActual_arrival())
                .actual_departure(flight.getActual_departure())
                .aircraft_code(flight.getAircraft_code())
                .arrival_airport(flight.getArrival_airport())
                .departure_airport(flight.getDeparture_airport())
                .flight_no(flight.getFlight_no())
                .scheduled_arrival(flight.getScheduled_arrival())
                .scheduled_departure(flight.getScheduled_departure())
                .status(flight.getStatus())
                .build();
    }
}

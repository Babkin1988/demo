package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(schema = "bookings", name = "flights")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Flight {
    @Id
    private int flight_id;
    private String flight_no;
    private OffsetDateTime scheduled_departure;
    private OffsetDateTime scheduled_arrival;
    private String departure_airport;
    private String arrival_airport;
    private String status;
    private String aircraft_code;
    private OffsetDateTime actual_departure;
    private OffsetDateTime actual_arrival;
}

package com.example.AirlineFlight;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

	List<Flight> findByFromPlaceOrToPlaceOrStartDateTimeOrEndDateTimeOrTrip(String fromPlace,String toPlace,String startDateTime,String endDateTime,Trip trip);

}

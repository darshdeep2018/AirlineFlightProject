package com.example.AirlineFlight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository flightRepository;

	public void save(Flight flight) {
		flightRepository.save(flight);
		System.out.println(flight);
	}


	public List<Flight> getFlights(Flight flight) {
		return flightRepository.findByFromPlaceOrToPlaceOrStartDateTimeOrEndDateTimeOrTrip(flight.getFromPlace(),flight.getToPlace(),flight.getStartDateTime(),flight.getEndDateTime(),flight.getTrip());
	}
}

package com.example.AirlineFlight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight")
public class FlightController {
	@Autowired
	FlightService flightService;

	// Add Inventory/Schedule of an existing Airline
	@PostMapping(value = "/airline/inventory/add")
	Integer addSchedule(@RequestBody Flight flight) {
		flightService.save(flight);
		System.out.println("schedule added successfully");
		return flight.getFlightId();
	}

	// Search on flights
	@PostMapping(value = "/search")
	List<Flight> searchFlight() {
		System.out.println("Flights found");
		return flightService.getFlights();
	}
}

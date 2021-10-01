package com.example.AirlineFlight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight")
public class TicketController {
	@Autowired
	TicketService ticketService;

	@PostMapping(value = "/booking/{flightId}")
	int bookTicket(@PathVariable Integer flightId,@RequestBody Ticket ticket) {
		ticket.setFlightId(flightId);
		System.out.println("Flight Ticket booked called");
		return ticketService.saveTicket(ticket);
	}

	@GetMapping(value = "/ticket/{pnr}")
	void getBookedTicket(@PathVariable int pnr) {
		Ticket ticket=ticketService.getTicketByPnr(pnr);
		System.out.println(ticket);
	}

	@GetMapping(value = "/ticket/{pnr}")
	void getHistoryOfBookedTicket() {
		System.out.println("called History of Booked Ticket...");
	}

	@DeleteMapping(value = "/booking/cancel/{pnr}")
	void deleteTicket() {
		System.out.println("Ticket Deleted...");
	}
}

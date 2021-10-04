package com.example.AirlineFlight;

import java.util.List;

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
		int pnr=(int) (Math.random()*1000);
		ticket.setPnr(pnr);
		System.out.println("Flight Ticket booked called");
		return ticketService.saveTicket(ticket);
	}

	@GetMapping(value = "/ticket/{pnr}")
	Ticket getBookedTicket(@PathVariable int pnr) {
		System.out.println("called get TIcket by PNR");
		Ticket ticket=ticketService.getTicketByPnr(pnr);
		System.out.println(ticket);
		return ticket;
	}

	@GetMapping(value = "/ticket/history/{email}")
	List<Ticket> getHistoryOfBookedTicket(@PathVariable String email) {
		System.out.println("called History of Booked Ticket...");
		return ticketService.getTicketDetails(email);
	}

	@DeleteMapping(value = "/booking/cancel/{pnr}")
	String deleteTicket(@PathVariable int pnr) {
		ticketService.deleteByPnr(pnr);
		return "Ticket Deleted...";
	}
}

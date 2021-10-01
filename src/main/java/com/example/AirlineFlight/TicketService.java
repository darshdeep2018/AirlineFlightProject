package com.example.AirlineFlight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepository;

	public int saveTicket(Ticket ticket) {
		int pnr=(int) Math.random();
		ticket.setPnr(pnr);
		ticketRepository.save(ticket);
		System.out.println(ticket);
		return pnr;
	}

	public List<Ticket> ticketDetails() {
		return ticketRepository.findAll();
	}

	public Ticket getTicketByPnr(int pnr) {
		ticketRepository.findByPnr(pnr);
		return null;
	}

}

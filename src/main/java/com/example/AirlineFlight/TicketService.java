package com.example.AirlineFlight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepository;

	public int saveTicket(Ticket ticket) {
		ticketRepository.save(ticket);
		System.out.println(ticket);
		return ticket.getPnr();
	}

	public List<Ticket> getTicketDetails(String email) {
		return ticketRepository.findByEmail(email);
	}

	public Ticket getTicketByPnr(int pnr) {
		return ticketRepository.findByPnr(pnr);
	}

	public void deleteByPnr(int pnr) {
		Ticket ticket=ticketRepository.findByPnr(pnr);
		ticketRepository.delete(ticket);
	}

}

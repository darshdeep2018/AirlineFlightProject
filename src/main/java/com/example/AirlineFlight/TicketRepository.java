package com.example.AirlineFlight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	void findByPnr(int pnr);

}

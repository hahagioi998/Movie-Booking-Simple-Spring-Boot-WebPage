package com.service;

import org.springframework.stereotype.Service;
import com.model.Ticket;;


@Service
public class TicketService {
	
	public double calculateTotalCost(Ticket ticket)
	{
		double amt = 0.0;
		if(ticket.getCircleType().equalsIgnoreCase("King")) {
			amt = ticket.getNoOfTickets()*150;
		}
		else {
			amt = ticket.getNoOfTickets()*250;
		}
		return amt;
	}
}
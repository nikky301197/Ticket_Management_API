package com.ticket_management_tool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Ticket;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.TicketRepo;
import com.ticket_management_tool.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepo ticketrepo;

	@Override
	public List<Ticket> getAllTicket() throws ResourceNotFoundException {
		int len = ticketrepo.findAll().size();
		if (len == 0) {
			throw new ResourceNotFoundException("Fetch operation failed : Zero record present in category table ");

		}

		List<Ticket> list = ticketrepo.findAll();
		return list;
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		Ticket t1 = ticketrepo.save(ticket);
		return t1;
	}

	@Override
	public Ticket updateTicketStatus(Integer ticket_id, String status) throws ResourceNotFoundException {
		Ticket ticket = ticketrepo.findById(ticket_id).orElseThrow(() -> new ResourceNotFoundException(
				"Update operation failed :  no ticket present with this ticket id " + ticket_id));

		ticket.setTicketStatus(status);
		ticketrepo.save(ticket);
		return ticket;
	}

	@Override
	public List<Ticket> getTicketById(Integer id) {
		// TODO Auto-generated method stub
//		ticketrepo.getById(id)
		return null;
	}

}

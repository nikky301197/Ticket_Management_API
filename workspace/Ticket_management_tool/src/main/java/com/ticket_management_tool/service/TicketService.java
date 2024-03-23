package com.ticket_management_tool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Ticket;
import com.ticket_management_tool.exception.ResourceNotFoundException;

@Service
public interface TicketService {
	
	List<Ticket> getAllTicket( ) throws ResourceNotFoundException;
	Ticket createTicket(Ticket ticket);
	Ticket updateTicketStatus(Integer ticket_id , String status) throws ResourceNotFoundException;
	List<Ticket> getTicketById(Integer id );
	

}

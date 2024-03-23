package com.ticket_management_tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket_management_tool.entity.Ticket;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.TicketRepo;
import com.ticket_management_tool.service.TicketService;

@RestController
@RequestMapping("/ticket_management_tool/tickets")
public class TicketController {
	@Autowired
	TicketService ticketservice;
	
	@Autowired
	TicketRepo repo;

	@GetMapping("/")
	ResponseEntity<List<Ticket>> getAllTicket() throws ResourceNotFoundException {
		List<Ticket> list = ticketservice.getAllTicket();
		return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
	}

	@PutMapping("/id/{id}/status/{status}")
	ResponseEntity<Ticket> updateTicketStatus(@PathVariable Integer id, @PathVariable String status)
			throws ResourceNotFoundException {
		Ticket t1 = ticketservice.updateTicketStatus(id, status);
		return new ResponseEntity<Ticket>(t1, HttpStatus.OK);
	}

	@PostMapping("/")
	ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
		Ticket t1 = ticketservice.createTicket(ticket);
		return new ResponseEntity<Ticket>(t1, HttpStatus.CREATED);
	}

	@GetMapping("/id/{id}")
	List<Ticket> getTicketById(@PathVariable String email_id)
	{
		return repo.findByEmailId(email_id);
		
		
	}
}

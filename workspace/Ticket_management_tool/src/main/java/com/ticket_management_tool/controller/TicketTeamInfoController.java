package com.ticket_management_tool.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket_management_tool.entity.Ticket_Team_Info;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.service.TicketTeamInfoService;

@RestController
@RequestMapping("/ticket_management_tool/ticketteams")
public class TicketTeamInfoController {

	@Autowired
	TicketTeamInfoService ticketteamservice;

	@GetMapping("/")
	ResponseEntity<List<Ticket_Team_Info>> getAllTicketTeam() throws ResourceNotFoundException {
		List<Ticket_Team_Info> list = ticketteamservice.getAllTicketTeamInfo();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	String deleteById(@PathVariable Integer id) throws ResourceNotFoundException {
		String msg = ticketteamservice.deleteTicketTeamInfoById(id);
		return msg;
	}
	
	@PostMapping("/")
	ResponseEntity<Ticket_Team_Info > createTicketTeam(@RequestBody Ticket_Team_Info ticketteam) throws  SQLIntegrityConstraintViolationException
	{
		Ticket_Team_Info t1= 	ticketteamservice.createTicketTeamInfo(ticketteam);
	 System.out.println(t1.toString());
	 return new ResponseEntity(t1 , HttpStatus.OK);
	}

}

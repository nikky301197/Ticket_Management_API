package com.ticket_management_tool.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Ticket_Team_Info;
import com.ticket_management_tool.exception.ResourceNotFoundException;

@Service 
public interface TicketTeamInfoService {
	
	List<Ticket_Team_Info> getAllTicketTeamInfo() throws ResourceNotFoundException;
	Ticket_Team_Info createTicketTeamInfo(Ticket_Team_Info ticketteaminfo) throws  SQLIntegrityConstraintViolationException;
	String deleteTicketTeamInfoById(Integer id ) throws ResourceNotFoundException;

}

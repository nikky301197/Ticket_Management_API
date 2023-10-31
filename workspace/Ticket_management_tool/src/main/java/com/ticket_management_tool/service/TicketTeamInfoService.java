package com.ticket_management_tool.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.TicketTeamInfo;
import com.ticket_management_tool.exception.ResourceNotFoundException;

@Service 
public interface TicketTeamInfoService {
	
	List<TicketTeamInfo> getAllTicketTeamInfo() throws ResourceNotFoundException;
	TicketTeamInfo createTicketTeamInfo(TicketTeamInfo ticketteaminfo) throws  SQLIntegrityConstraintViolationException;
	String deleteTicketTeamInfoById(Integer id ) throws ResourceNotFoundException;

}

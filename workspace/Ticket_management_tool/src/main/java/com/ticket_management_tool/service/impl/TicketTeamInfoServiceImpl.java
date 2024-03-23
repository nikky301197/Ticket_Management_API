package com.ticket_management_tool.service.impl;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket_management_tool.entity.Ticket_Team_Info;
import com.ticket_management_tool.exception.ResourceNotFoundException;
import com.ticket_management_tool.repository.RoleRepo;
import com.ticket_management_tool.repository.TicketTeamInfoRepo;
import com.ticket_management_tool.service.TicketTeamInfoService;

@Service
public class TicketTeamInfoServiceImpl implements TicketTeamInfoService {

	@Autowired
	TicketTeamInfoRepo ticketteaminforepo;
	@Autowired
	RoleRepo rolerepo;

	@Override
	public List<Ticket_Team_Info> getAllTicketTeamInfo() throws ResourceNotFoundException {
		int len = ticketteaminforepo.findAll().size();
		if (len == 0) {
			throw new ResourceNotFoundException(
					"Fetch Operation failed : Zero records present in ticket team info table");
		}
		List<Ticket_Team_Info> list = ticketteaminforepo.findAll();
		return list;
	}

	@Override
	public Ticket_Team_Info createTicketTeamInfo(Ticket_Team_Info ticketteaminfo)
			throws SQLIntegrityConstraintViolationException {

		return ticketteaminforepo.save(ticketteaminfo);
	}

	@Override
	public String deleteTicketTeamInfoById(Integer id) throws ResourceNotFoundException {
		ticketteaminforepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(
				"Delete operation  failed : Entered resolver id " + id + " not present in ticket team info table"));
		ticketteaminforepo.deleteById(id);
		String msg = "Resolver id : " + id + " deleted successfully";
		return msg;
	}

}

package com.ticket_management_tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket_management_tool.entity.Ticket_Team_Info;


public interface TicketTeamInfoRepo extends JpaRepository<Ticket_Team_Info, Integer> {

}

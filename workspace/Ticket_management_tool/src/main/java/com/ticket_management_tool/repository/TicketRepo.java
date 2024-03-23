package com.ticket_management_tool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket_management_tool.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

	List<Ticket> findByEmailId(String email_id);
}

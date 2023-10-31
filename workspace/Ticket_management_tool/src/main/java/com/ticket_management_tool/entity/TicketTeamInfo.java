package com.ticket_management_tool.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class TicketTeamInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer resolver_id;
	String resolver_name;
	Date last_update_date;

	@ManyToOne
	@JoinColumn(name = "role_id")
	Role role;

	public TicketTeamInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketTeamInfo(Integer resolver_id, String resolver_name, Date last_update_date, Role role) {
		super();
		this.resolver_id = resolver_id;
		this.resolver_name = resolver_name;
		this.last_update_date = last_update_date;
		this.role = role;
	}

	public Integer getResolver_id() {
		return resolver_id;
	}

	public void setResolver_id(Integer resolver_id) {
		this.resolver_id = resolver_id;
	}

	public String getResolver_name() {
		return resolver_name;
	}

	public void setResolver_name(String resolver_name) {
		this.resolver_name = resolver_name;
	}

	public Date getLast_update_date() {
		return last_update_date;
	}

	public void setLast_update_date(Date last_update_date) {
		this.last_update_date = last_update_date;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TicketTeamInfo [resolver_id=" + resolver_id + ", resolver_name=" + resolver_name + ", last_update_date="
				+ last_update_date + ", role=" + role.getRole_id() + "]";

	}

}
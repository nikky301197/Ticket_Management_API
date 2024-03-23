  package com.ticket_management_tool.entity;

import java.util.Date;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Ticket_Team_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer resolverId;
	String resolverName;
	Date lastUpdateDate;
 
	
	@ManyToOne
	@JoinColumn(name = "roleId")
	Role role;

	public Ticket_Team_Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket_Team_Info(Integer resolverId, String resolverName, Date lastUpdateDate, Role role) {
		super();
		this.resolverId = resolverId;
		this.resolverName = resolverName;
		this.lastUpdateDate = lastUpdateDate;
		this.role = role;
	}

	public Integer getResolverId() {
		return resolverId;
	}

	public void setResolverId(Integer resolverId) {
		this.resolverId = resolverId;
	}

	public String getResolverName() {
		return resolverName;
	}

	public void setResolverName(String resolverName) {
		this.resolverName = resolverName;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	

}
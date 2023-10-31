package com.ticket_management_tool.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer role_id;
	private String role_name;
	
//	@OneToMany(mappedBy = "role" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
//	
//	List<TicketTeamInfo> ticketteaminfo ; 
	
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Role(Integer role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		
	}



	public Integer getRole_id() {
		return role_id;
	}



	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}



	public String getRole_name() {
		return role_name;
	}



	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}



	


	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + "]";
	}



}

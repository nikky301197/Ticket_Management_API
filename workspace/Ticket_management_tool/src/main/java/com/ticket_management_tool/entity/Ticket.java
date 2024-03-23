package com.ticket_management_tool.entity;

import java.util.Date;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.boot.context.properties.bind.DefaultValue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer ticketId;
	String ticketTitle;
	String description;
	@Column(columnDefinition = "varchar(20) default 'open'")
	String ticketStatus;
//	@Column(columnDefinition =  "date default CURRENT_DATE")
	Date dateOfGeneration;
	String comment;
	Date lastUpdateDate;
	Long phoneNo;
	String emailId;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	Category ticketCategory;

	@ManyToOne
	@JoinColumn(name = "userId")
	User user;

	@ManyToOne
	@JoinColumn(name = "resolverId")
	@Cascade(CascadeType.PERSIST)
	Ticket_Team_Info ticketTeamInfo;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(Integer ticketId, String ticketTitle, String description, String ticketStatus, Date dateOfGeneration,
			String comment, Date lastUpdateDate, Long phoneNo, String emailId, Category ticketCategory, User user,
			Ticket_Team_Info ticketTeamInfo) {
		super();
		this.ticketId = ticketId;
		this.ticketTitle = ticketTitle;
		this.description = description;
		this.ticketStatus = ticketStatus;
		this.dateOfGeneration = dateOfGeneration;
		this.comment = comment;
		this.lastUpdateDate = lastUpdateDate;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.ticketCategory = ticketCategory;
		this.user = user;
		this.ticketTeamInfo = ticketTeamInfo;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Date getDateOfGeneration() {
		return dateOfGeneration;
	}

	public void setDateOfGeneration(Date dateOfGeneration) {
		this.dateOfGeneration = dateOfGeneration;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Category getTicketCategory() {
		return ticketCategory;
	}

	public void setTicketCategory(Category ticketCategory) {
		this.ticketCategory = ticketCategory;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Ticket_Team_Info getTicketTeamInfo() {
		return ticketTeamInfo;
	}

	public void setTicketTeamInfo(Ticket_Team_Info ticketTeamInfo) {
		this.ticketTeamInfo = ticketTeamInfo;
	}

	
	
}

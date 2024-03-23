package com.ticket_management_tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication 
public class TicketManagementToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketManagementToolApplication.class, args);
	}

}

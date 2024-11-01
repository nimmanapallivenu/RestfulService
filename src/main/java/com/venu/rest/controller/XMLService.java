package com.venu.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.venu.rest.dto.Customer;

@Path("/xml")
public class XMLService {

	@GET
	@Path("/{pin}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {
		Customer customer = new Customer();
		customer.setName("mkyong");
		customer.setPin(pin);
		customer.setAge("12");
		return customer;
	}

}

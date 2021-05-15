package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import com.javasampleapproach.jqueryajax.model.Customer2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class RestWebController {

	List<Customer> cust = new ArrayList<Customer>();
	List<Customer2> cust2 = new ArrayList<Customer2>();
	@GetMapping(value = "/all")
	public Response getResource() {
		Response response = new Response("Done", cust);
		return response;
	}

	@PostMapping(value = "/save")
	public Response postCustomer(@RequestBody Customer customer) {
		cust.add(customer);
		
		// Create Response Object
		Response response = new Response("Done", customer);
		return response;
	}

	@PostMapping(value = "/save2")
	public Response postCustomer2(@RequestBody List<Customer2> cust3) {
		cust2.add(cust3.get(0));
		cust2.add(cust3.get(1));
		cust2.add(cust3.get(2));

		// Create Response Object
		Response response = new Response("Done", cust3.get(0));
		return response;
	}


}
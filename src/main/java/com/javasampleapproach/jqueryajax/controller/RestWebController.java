package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class RestWebController {

	List<Customer> cust = new ArrayList<Customer>();

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

	@PostMapping(value = "/yourUrl")
	public Response yourUrl(@RequestParam String data) {
		System.out.println(data);
		return new Response("Done", data);
	}


}
package com.javasampleapproach.jqueryajax.controller;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/second/api/customer")
public class RestWebSecondController {

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
		Response response = new Response("Done", cust);
		return response;
	}

}
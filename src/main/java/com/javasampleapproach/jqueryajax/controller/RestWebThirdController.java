package com.javasampleapproach.jqueryajax.controller;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/third/api/customer")
public class RestWebThirdController {

	List<Customer> cust = new ArrayList<Customer>();

	@GetMapping(value = "/all")
	public Response getResource() {
		Response response = new Response("Done", cust);
		return response;
	}

	@GetMapping(value = "/all2")
	public ResponseEntity getResource2() {
		Response response = new Response("Done", cust);
		return new ResponseEntity(response, HttpStatus.OK);
	}

	@PostMapping(value = "/save")
	public Response postCustomer(@RequestBody Customer customer) {
		cust.add(customer);
		
		// Create Response Object
		Response response = new Response("Done", cust);
		return response;
	}
}
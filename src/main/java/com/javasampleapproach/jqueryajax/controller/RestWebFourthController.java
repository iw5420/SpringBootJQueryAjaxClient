package com.javasampleapproach.jqueryajax.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.*;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fourth/api/customer")
public class RestWebFourthController {

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

	@PostMapping(value = "/save3", headers = "Content-Type=application/json")
	public Response postCustomer3(@RequestBody String jsonString) {

			Gson gson = new Gson();
			Smartphone smartphone = gson.fromJson(jsonString, Smartphone.class);

		// Create Response Object
		Response response = new Response("Done", "1");
		return response;
	}
}
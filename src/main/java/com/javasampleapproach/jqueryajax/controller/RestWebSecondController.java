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

		// 回傳List
		Response response = new Response("Done", generate(10));
		return response;
	}

	//生假資料
	public List<Customer> generate(int i){
		List<Customer> custList = new ArrayList<>();
		for(int j = 0; j<i; j++ ){
			Customer customer= new Customer("number_"+j,"Ian_"+j);
			custList.add(customer);
		}
		return custList;
	}
}
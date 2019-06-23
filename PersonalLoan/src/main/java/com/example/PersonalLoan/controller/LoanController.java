package com.example.PersonalLoan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PersonalLoan.entity.Customer;

@RestController
@RequestMapping("/personalLoan")
public class LoanController {
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
		
	}

}

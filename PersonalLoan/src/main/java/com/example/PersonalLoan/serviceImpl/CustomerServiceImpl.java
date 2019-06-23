package com.example.PersonalLoan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PersonalLoan.entity.Customer;
import com.example.PersonalLoan.repository.CustomerRepo;
import com.example.PersonalLoan.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	@Override
	public Customer addCustomer(Customer customer) {
		Customer newCustomer=null;
		if(customer!=null)
		{
			newCustomer=customerRepo.save(customer);
		}
		return newCustomer;
	}

}

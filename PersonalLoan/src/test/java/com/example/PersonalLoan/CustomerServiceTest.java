package com.example.PersonalLoan;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.PersonalLoan.entity.Customer;
import com.example.PersonalLoan.repository.CustomerRepo;
import com.example.PersonalLoan.serviceImpl.CustomerServiceImpl;

@RunWith(SpringRunner.class)
public class CustomerServiceTest {
	@MockBean
	private CustomerServiceImpl custServiceImpl;
	@InjectMocks
	private CustomerRepo custRepo;
	
	@Test
	public void testAddCustomer()
	{
		Customer newCustomer= new Customer();
		newCustomer.setCustomerId(1);
		newCustomer.setName("ram");
		newCustomer.setCreditScore(234);
		//newCustomer.setDOB(9999-10-12);
		newCustomer.setExpense(600);
		newCustomer.setMaritalStatus("married");
		newCustomer.setMobile(90234569);
		newCustomer.setSalary(90000);
		newCustomer.setGender("male");
		when(custRepo.save(newCustomer)).thenReturn(newCustomer);
		Customer custm= custServiceImpl.addCustomer(newCustomer);
		assertEquals(newCustomer, custm);
		
	}
	
	/*
	 * @Test(InternalErrorException.class) public void
	 * testAddCustomerForInternalServerError() {
	 * 
	 * }
	 */
	

}

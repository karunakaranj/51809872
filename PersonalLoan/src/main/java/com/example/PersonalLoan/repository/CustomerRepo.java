package com.example.PersonalLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PersonalLoan.entity.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}

package com.test.mockito.mockito.repo;

import org.springframework.data.repository.CrudRepository;

import com.test.mockito.mockito.bean.Customer;

 
public interface CustomerRepository extends CrudRepository<Customer, Long>{
}

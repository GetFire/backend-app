package com.angularspring.getfire.repository;

import com.angularspring.getfire.domain.customer.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Customer findByName(String name);
}
package com.home.springbootwebtest.repository;

import com.home.springbootwebtest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

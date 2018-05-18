package com.home.springbootwebtest.service;

import com.home.springbootwebtest.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    boolean save(CustomerDTO customerDTO);

    boolean update(CustomerDTO customerDTO);

    boolean delete(int id);

    List<CustomerDTO> findAll();

    CustomerDTO findById(int id);
}

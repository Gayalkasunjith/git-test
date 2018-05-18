package com.home.springbootwebtest.service;

import com.home.springbootwebtest.dto.CustomerDTO;
import com.home.springbootwebtest.dto.OrderDTO;

public interface CustomerService extends SuperService<CustomerDTO> {

    boolean save(CustomerDTO customerDTO, OrderDTO orderDTO);
}

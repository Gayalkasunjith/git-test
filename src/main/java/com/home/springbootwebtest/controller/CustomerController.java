package com.home.springbootwebtest.controller;

import com.home.springbootwebtest.dto.CustomerDTO;
import com.home.springbootwebtest.dto.OrderDTO;
import com.home.springbootwebtest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "save")
    public boolean save(@RequestBody CustomerDTO customerDTO) {
        OrderDTO orderDTO = customerDTO.getOrderDTO();
        boolean saved = customerService.save(customerDTO, orderDTO);
        return saved;
    }
}

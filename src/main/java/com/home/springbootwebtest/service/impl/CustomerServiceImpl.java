package com.home.springbootwebtest.service.impl;

import com.home.springbootwebtest.domain.Customer;
import com.home.springbootwebtest.domain.Order;
import com.home.springbootwebtest.dto.CustomerDTO;
import com.home.springbootwebtest.dto.OrderDTO;
import com.home.springbootwebtest.repository.CustomerRepository;
import com.home.springbootwebtest.repository.OrderRepository;
import com.home.springbootwebtest.service.CustomerService;
import com.home.springbootwebtest.service.OrderService;
import com.home.springbootwebtest.service.SuperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public boolean save(CustomerDTO customerDTO, OrderDTO orderDTO) {
        boolean flag = false;

        Customer customer = new Customer(customerDTO.getName(), customerDTO.getAddress(), customerDTO.getTele());
        Order order = new Order(orderDTO.getDate(), customer);

        Customer customerSave = customerRepository.save(customer);
        Order orderSave = orderRepository.save(order);

        flag = customerSave != null;
        flag = orderSave != null;
        return flag;
    }

    @Override
    public boolean save(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean update(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<CustomerDTO> findAll() {
        return null;
    }

    @Override
    public CustomerDTO findById(int id) {
        return null;
    }
}

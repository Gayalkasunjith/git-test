package com.home.springbootwebtest.service.impl;

import com.home.springbootwebtest.dto.CustomerDTO;
import com.home.springbootwebtest.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    @Transactional
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

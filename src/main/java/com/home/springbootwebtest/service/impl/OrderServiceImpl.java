package com.home.springbootwebtest.service.impl;

import com.home.springbootwebtest.dto.OrderDTO;
import com.home.springbootwebtest.service.OrderService;
import com.home.springbootwebtest.service.SuperService;

import java.util.List;

public class OrderServiceImpl implements SuperService<OrderDTO> {

    @Override
    public boolean save(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean update(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<OrderDTO> findAll() {
        return null;
    }

    @Override
    public OrderDTO findById(int id) {
        return null;
    }
}

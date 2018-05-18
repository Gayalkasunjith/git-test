package com.home.springbootwebtest.service.impl;

import com.home.springbootwebtest.dto.OrderDTO;
import com.home.springbootwebtest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderService orderService;

    @Override
    @Transactional
    public boolean save(OrderDTO orderDTO) {
        boolean saveOrder = orderService.save(orderDTO);
        return saveOrder;
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

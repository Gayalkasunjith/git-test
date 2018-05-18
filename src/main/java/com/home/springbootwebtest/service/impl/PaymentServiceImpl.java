package com.home.springbootwebtest.service.impl;

import com.home.springbootwebtest.dto.PaymentDTO;
import com.home.springbootwebtest.service.PaymentService;
import com.home.springbootwebtest.service.SuperService;

import java.util.List;

public class PaymentServiceImpl implements SuperService<PaymentDTO> {

    @Override
    public boolean save(PaymentDTO paymentDTO) {
        return false;
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<PaymentDTO> findAll() {
        return null;
    }

    @Override
    public PaymentDTO findById(int id) {
        return null;
    }
}

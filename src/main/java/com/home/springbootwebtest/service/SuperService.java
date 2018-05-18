package com.home.springbootwebtest.service;

import com.home.springbootwebtest.dto.CustomerDTO;

import java.io.Serializable;
import java.util.List;

public interface SuperService<T extends Serializable> {

    boolean save(T t);

    boolean update(T t);

    boolean delete(int id);

    List<T> findAll();

    T findById(int id);
}

package com.home.springbootwebtest.service;

import com.home.springbootwebtest.dto.SuperDTO;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Resource
public interface SuperService<T extends SuperDTO> {

    boolean save(T t);

    boolean update(T t);

    boolean delete(int id);

    List<T> findAll();

    T findById(int id);
}

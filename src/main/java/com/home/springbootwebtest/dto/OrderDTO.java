package com.home.springbootwebtest.dto;

import java.io.Serializable;

public class OrderDTO extends SuperDTO {

    private int id;
    private String date;

    public OrderDTO() {
    }

    public OrderDTO(int id, String date) {
        this.setId(id);
        this.setDate(date);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", date='" + date + '\'' +
                '}';
    }
}

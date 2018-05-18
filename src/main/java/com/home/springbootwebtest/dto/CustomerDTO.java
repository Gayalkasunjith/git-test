package com.home.springbootwebtest.dto;


import java.io.Serializable;

/**
 * Customer DTO
 * Use for travel customer details
 */
public class CustomerDTO implements Serializable {

    private int id;
    private String name;
    private String address;
    private String tele;

    public CustomerDTO() {
    }

    public CustomerDTO(int id, String name, String address, String tele) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setTele(tele);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tele='" + tele + '\'' +
                '}';
    }
}

package com.home.springbootwebtest.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;


/**
 * customer model
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private int id;
    private String name;
    private String address;
    private String tele;

    public Customer() {
    }

    public Customer(int id, String name, String address, String tele) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tele = tele;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(tele, customer.tele);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address, tele);
    }
}

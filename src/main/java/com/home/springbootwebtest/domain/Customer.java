package com.home.springbootwebtest.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


/**
 * customer model
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "tele")
    private String tele;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orderList;

    public Customer() {
    }

    public Customer(String name, String address, String tele) {
        this.name = name;
        this.address = address;
        this.tele = tele;
    }

    public Customer(int id, String name, String address, String tele, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tele = tele;
        this.orderList = orderList;
    }

    public Customer(String name, String address, String tele, List<Order> orderList) {
        this.name = name;
        this.address = address;
        this.tele = tele;
        this.orderList = orderList;
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

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(tele, customer.tele) &&
                Objects.equals(orderList, customer.orderList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address, tele, orderList);
    }
}

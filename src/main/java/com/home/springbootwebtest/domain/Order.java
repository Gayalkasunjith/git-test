package com.home.springbootwebtest.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "dates")
    private String date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_id")
    private Customer customer;

    public Order() {
    }

    public Order(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public Order(int id, String date, Customer customer) {
        this.setId(id);
        this.setDate(date);
        this.setCustomer(customer);
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Objects.equals(date, order.date) &&
                Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, customer);
    }
}

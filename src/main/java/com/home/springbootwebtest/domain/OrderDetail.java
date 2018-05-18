package com.home.springbootwebtest.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "order_detail")
@AssociationOverrides({@AssociationOverride(name = "orderDetailId.order", joinColumns = @JoinColumn(name = "order_id")),
        @AssociationOverride(name = "orderDetailId.item", joinColumns = @JoinColumn(name = "item_id"))})
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private OrderDetailId orderDetailId = new OrderDetailId();
    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailId orderDetailId, int qty) {
        this.orderDetailId = orderDetailId;
        this.qty = qty;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @EmbeddedId
    public OrderDetailId getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(OrderDetailId orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Transient
    public Order getOrder() {
        return orderDetailId.getOrder();
    }

    public void setOrder(Order order) {
        getOrderDetailId().setOrder(order);
    }

    @Transient
    public Item getItem() {
        return orderDetailId.getItem();
    }

    public void setItem(Item item) {
        getOrderDetailId().setItem(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return qty == that.qty &&
                Objects.equals(orderDetailId, that.orderDetailId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderDetailId, qty);
    }
}

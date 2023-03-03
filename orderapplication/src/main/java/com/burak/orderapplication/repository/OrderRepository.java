package com.burak.orderapplication.repository;

import com.burak.orderapplication.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orderList= new ArrayList<>();

    public void add(Order order) {
        orderList.add(order);
    }

    public void delete(Order order) {
        orderList.remove(order);
    }
    public List<Order> getAll() {
        return orderList;
    }
}

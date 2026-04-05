package br.edu.ufvjm.delivery.repository;

import br.edu.ufvjm.delivery.model.entities.Order;

import java.util.ArrayList;

public class OrderRepository {

    private ArrayList<Order> orders = new ArrayList();

    public void createOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }


}

package br.edu.ufvjm.delivery.model.entities;

import br.edu.ufvjm.delivery.model.enums.OrderStatus;
import br.edu.ufvjm.delivery.model.entities.OrderItem;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.List;
import java.util.ArrayList;

import java.math.BigDecimal;

public class Order {

    private String id;
    private LocalDate orderDate;
    private LocalTime orderTime;
    private LocalTime deliveryTime;
    private OrderStatus status;
    private Customer customer;
    private Employee employee;
    private List<OrderItem> items;

    public BigDecimal calculateTotal() {}
    public void addItem(OrderItem item) {}
    public void removeItem(String itemId) {}
}
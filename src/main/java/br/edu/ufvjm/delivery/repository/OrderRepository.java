package br.edu.ufvjm.delivery.repository;

import br.edu.ufvjm.delivery.model.entities.Order;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderRepository implements Repository<Order, String> {

    private final Map<String, Order> storage = new LinkedHashMap<>();

    public List<Order> findByDateRange(LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime) {}

    public List<Order> findByCustomer(String customerId) {}

    public List<Order> findByDate(LocalDate date) {}
}
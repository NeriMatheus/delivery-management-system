package br.edu.ufvjm.delivery.model.entities;

import java.util.List;
import java.util.ArrayList;

import java.time.LocalDateTime;

public class Customer {

    private String id;
    private String name;
    private Phone phone;
    private Address address;
    private List<Order> orderHistory;
    private LocalDateTime registrationDate;
}
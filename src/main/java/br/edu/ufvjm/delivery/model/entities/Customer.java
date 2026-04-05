package br.edu.ufvjm.delivery.model.entities;

import java.util.ArrayList;

public class Customer {

    private int idCustomer;
    private String name;
    private Phone phone;
    private Address address;

    private ArrayList<Order> order;

    // Constructors
    public Customer(int id, Phone phone, String name, Address address, ArrayList<Order> order) {
        this.idCustomer = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.order = order;
    }

    //Getters and setters
    public int getIdCustomer() {
        return idCustomer;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

package br.edu.ufvjm.delivery.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Customer implements Comparator<Customer> {

    // Access modifier private
    private static int privateCounter = 0;

    // Access modifier protected
    protected static int protectedCounter = 0;

    private int customerId;
    private String name;
    private Phone phone;
    private Address address;
    private List<Order> order;
    private int lastOrderId;

    // Constructors
    public Customer(int id, Phone phone, String name, Address address) {
        privateCounter++;
        protectedCounter++;
        this.customerId = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    //Getters and setters
    public static int getPrivateCounter() {
        return   privateCounter;
    }

    public static void setPrivateCounter(int v){
        privateCounter = v;
    }

    public int getCustomerId() {
        return customerId;
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

    @Override
    public String toString() {
    }
}

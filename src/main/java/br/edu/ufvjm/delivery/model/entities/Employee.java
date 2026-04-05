package br.edu.ufvjm.delivery.model.entities;

import java.util.ArrayList;

public class Employee extends User {

    private int idEmployee;
    private String name;

    private User user;
    private ArrayList<Order> order;

    // Constructors
    public Employee(String login, String password, int idEmployee, String name) {
        super(login, password);
        this.idEmployee = idEmployee;
        this.name = name;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void changePassword() {
        user.setPassword(password);
    }
}

package br.edu.ufvjm.delivery.model.entities;

public class Admin extends User {

    private String name;
    private String email;

    @Override
    public boolean hasPermission(String action) {
        return true;
    }
}
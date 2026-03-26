package br.edu.ufvjm.delivery.model.entities;

public abstract class User {

    protected String id;
    protected String login;
    protected String password;
    protected boolean active;

    public abstract boolean hasPermission(String action);
    
    public void changePassword(String newPassword) {}
}
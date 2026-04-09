package br.edu.ufvjm.delivery.model.entities;

public class Administrator extends User {

    private String name;
    private String email;

    //  Constructors
    public Administrator(String login, String password, String name, String email) {
        super(login, password);
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void manageEmployee(Employee e, String action) {}
    public void inventoryAlert(Inventory inventory) {}

    @Override
    public boolean authenticate(String login, String password) {}

    @Override
    public String toString()  {}
}
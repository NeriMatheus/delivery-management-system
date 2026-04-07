package br.edu.ufvjm.delivery.model.entities;

public abstract class User {

    protected String login;
    protected String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Getter and setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract boolean autenticate(String login, String password);

    @Override
    public String toString() {
        return "...";
    }
}
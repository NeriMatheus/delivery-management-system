package br.edu.ufvjm.delivery.model.entities;

public class Address {

    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;

    // Constructors
    public Address(String street, String number, String neighborhood, String state, String city, String zipCode) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }

    //  Getters and setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFullAddress() {
        return getStreet() + ", " + getNumber() + " - " + getNeighborhood() + " - " + getCity() + "/" + getState() + " - " + getZipCode();
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}

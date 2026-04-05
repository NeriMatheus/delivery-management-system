package br.edu.ufvjm.delivery.model.entities;

public class Phone {

    private String ddi;
    private String ddd;
    private String number;

    // Constructors
    public Phone(String ddi, String ddd, String number) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Full number
    public String getFullNumber() {
        return "+" + getDdi() + " (" + getDdd() + ") " + getNumber();
    }

    @Override
    public String toString() {
        return getFullNumber();
    }
}

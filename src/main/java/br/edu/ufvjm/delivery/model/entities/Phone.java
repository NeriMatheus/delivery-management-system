package br.edu.ufvjm.delivery.model.entities;

public record Phone(String ddi, String ddd, String number) {

    public Phone {
        if (ddi == null || ddi.isBlank() || ddd == null || ddd.isBlank() || number = null || number.isBlank())   {

            throw new IllegalArgumentException("No field can be empty.");
        }
    }

    public String getFullPhone() {
        return ddi + "(" + ddd + ")" + number;
    }

    @Override
    public String toString() {
        return getFullPhone();
    }
}
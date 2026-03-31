package br.edu.ufvjm.delivery.model.entities;

/**
 *  Classe record pois possui dados imutáveis de forma simples e concisa
 *  Classe record serve para modelar dados, evitando boilerplate
 *  Classe record automaticamente gera getters, construtores, toString, equals() e hashCode()
 */

public record Address(String street, String number, String neighborhood, String city, String zipCode) {

    public Address {
        if (street == null || street.isBlank() || number == null || number.isBlank() || neighborhood == null || neighborhood.isBlank() || city == null || city.isBlank() || zipCode == null || zipCode.isBlank()) {

            throw new IllegalArgumentException("No field can be empty.");
        }
    }

    public String getFullAddress() {
        return street + " - " + number + " - " + neighborhood + " - " + city + " - " + zipCode;
    }

    @Override
    public String toString() {
        return getFullAddress();
    }

}
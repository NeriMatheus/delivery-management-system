package br.edu.ufvjm.delivery.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {

    private LocalDateTime date;
    private LocalDateTime time;
    private int idDescription;
    private int idAddOn;

    // Constructors
    public Order(LocalDateTime date, LocalDateTime time, int idAddOn, int idDescription) {
        this.date = date;
        this.time = time;
        this.idAddOn = idAddOn;
        this.idDescription = idDescription;
    }

    // Getters and setters
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getIdDescription() {
        return idDescription;
    }

    public int getIdAddOn() {
        return idAddOn;
    }
}

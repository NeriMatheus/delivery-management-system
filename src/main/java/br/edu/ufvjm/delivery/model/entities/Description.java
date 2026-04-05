package br.edu.ufvjm.delivery.model.entities;

import java.math.BigDecimal;

public class Description {

    private int idDescription;
    private String detailedDescription;
    private BigDecimal value;

    //Constructors

    public Description(int idDescription, String detailedDescription, BigDecimal value) {
        this.idDescription = idDescription;
        this.detailedDescription = detailedDescription;
        this.value = value;
    }

    // Getters and setters
    public int getIdDescription() {
        return idDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
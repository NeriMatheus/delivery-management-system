package br.edu.ufvjm.delivery.model.entities;

import br.edu.ufvjm.delivery.model.entities.Product;
import br.edu.ufvjm.delivery.model.entities.Extra;

import java.util.List;
import java.util.ArrayList;

import java.math.BigDecimal;

public class OrderItem {

    private String id;
    private Product product;
    private int quantity;
    private List<Extra> selectedExtras;
    private BigDecimal unitPrice;

    public BigDecimal calculateSubtotal() {}
}
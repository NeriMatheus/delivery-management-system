package br.edu.ufvjm.delivery.model.entities;

import br.edu.ufvjm.delivery.model.entities.Description;
import br.edu.ufvjm.delivery.model.entities.Extra;

import java.util.List;
import java.util.ArrayList;

public class Product {

    private String id;
    private String name;
    private boolean available;
    private Description description;
    private List<Extra> availableExtras;
}
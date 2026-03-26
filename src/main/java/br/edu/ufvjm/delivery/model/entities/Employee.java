package br.edu.ufvjm.delivery.model.entities;

import br.edu.ufvjm.delivery.model.enums.EmployeePermission;

import java.time.LocalDateTime;

public class Employee extends User {

    private String name;
    private String cpf;
    private LocalDateTime registration;

    @Override
    public boolean hasPermission(String action) {
        return EmployeePermission.ALLOWED_ACTIONS.contains(action);
    }
}
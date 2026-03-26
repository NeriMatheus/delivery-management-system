package br.edu.ufvjm.delivery.service;

import br.edu.ufvjm.delivery.model.entities.User;
import br.edu.ufvjm.delivery.repository.UserRepository;

public class AuthService {

    private final UserRepository userRepository;
    private User loggedUser;

    public User authenticate(String login, String password) throws AuthException {}

    public void logout() {}

    public User getLoggedUser()  {}

    public boolean checkPermission(String action) {}
}
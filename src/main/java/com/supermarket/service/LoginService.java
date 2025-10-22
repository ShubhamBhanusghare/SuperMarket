package com.supermarket.service;

import com.supermarket.model.User;
import com.supermarket.repository.UserRepository;


public class LoginService {

    private final UserRepository userRepository = new UserRepository(); // reuse repository

    public User validateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null) return null;
        return password.equals(user.getPassword()) ? user : null;
    }

}

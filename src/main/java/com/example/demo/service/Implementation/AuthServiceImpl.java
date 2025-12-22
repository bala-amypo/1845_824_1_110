package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        // basic registration (can add password encoding later)
        return userRepository.save(user);
    }

    @Override
    public String login(User user) {
        // minimal login logic for compilation + testing
        User existingUser = userRepository.findByEmail(user.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));

        return "LOGIN_SUCCESS"; // JWT can be added later
    }
}

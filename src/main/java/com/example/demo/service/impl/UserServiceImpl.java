package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User registerUser(User user) {

        if (repository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User already exists");
        }

        user.setPassword(encoder.encode(user.getPassword()));
        return repository.save(user);
    }

    // ✅ REQUIRED FOR UserController
    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}

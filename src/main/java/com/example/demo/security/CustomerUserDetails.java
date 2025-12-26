package com.example.demo.security;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserDetails {

    private final UserRepository userRepository;

    public CustomerUserDetails(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User loadUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

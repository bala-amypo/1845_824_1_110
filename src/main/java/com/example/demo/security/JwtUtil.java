package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(String username) {
        return "dummy-token-for-" + username;
    }

    public String extractUsername(String token) {
        if (token == null) return null;
        return token.replace("dummy-token-for-", "");
    }

    public boolean validateToken(String token, String username) {
        return token != null && token.equals(generateToken(username));
    }
}

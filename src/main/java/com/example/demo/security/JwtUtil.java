package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(String email) {
        return "token_" + email;
    }

    public String extractEmail(String token) {
        if (token == null) return null;
        return token.replace("token_", "");
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("token_");
    }
}

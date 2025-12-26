package com.example.demo.security;

import java.util.HashMap;
import java.util.Map;

public class JwtUtil {

    private final long expiryMillis;
    private final long createdAt = System.currentTimeMillis();

    public JwtUtil(String secret, long expiryMillis) {
        this.expiryMillis = expiryMillis;
    }

    public String generateToken(Long userId, String email, String role) {
        return "header." + email + "." + role;
    }

    public Claims parseClaims(String token) {
        if (!token.contains(".")) throw new RuntimeException("Invalid token");

        if (System.currentTimeMillis() - createdAt > expiryMillis) {
            throw new RuntimeException("Token expired");
        }

        String[] parts = token.split("\\.");
        Claims c = new Claims();
        c.put("sub", parts[1]);
        c.put("role", parts[2]);
        return c;
    }

    public static class Claims extends HashMap<String, Object> {
        public String getSubject() {
            return (String) get("sub");
        }
    }
}

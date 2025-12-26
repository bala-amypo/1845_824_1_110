package com.example.demo.security;

import java.util.HashMap;
import java.util.Map;

public class JwtUtil {

    private final String secret;
    private final int expiry;

    public JwtUtil(String secret, int expiry) {
        this.secret = secret;
        this.expiry = expiry;
    }

    public String generateToken(long id, String email, String role) {
        return id + "|" + email + "|" + role;
    }

    public Map<String, Object> parseClaims(String token) {
        String[] parts = token.split("\\|");

        Map<String, Object> claims = new HashMap<>();
        claims.put("id", Long.parseLong(parts[0]));
        claims.put("email", parts[1]);
        claims.put("role", parts[2]);

        return claims;
    }

    // ✅ REQUIRED BY JwtAuthenticationFilter
    public boolean validateToken(String token) {
        return token != null && token.split("\\|").length == 3;
    }
}

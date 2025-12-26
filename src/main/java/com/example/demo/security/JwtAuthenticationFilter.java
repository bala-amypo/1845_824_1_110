package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationFilter {

    private final JwtUtil jwtUtil;

    public JwtAuthenticationFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public boolean authenticate(String token) {
        return jwtUtil.validateToken(token);
    }
}

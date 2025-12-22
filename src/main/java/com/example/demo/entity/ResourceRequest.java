package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;
    private String status;

    // ✅ User relationship (REQUIRED for setUser)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public ResourceRequest() {}

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    // ✅ This fixes ERROR #1
    public void setUser(User user) {
        this.user = user;
    }
}

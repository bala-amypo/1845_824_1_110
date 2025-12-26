package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;
    private String status;

    @ManyToOne
    private User user;

    public ResourceRequest() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; } // ✅ REQUIRED

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}

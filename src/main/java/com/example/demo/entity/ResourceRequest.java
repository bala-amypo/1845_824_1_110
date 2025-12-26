package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;

    @ManyToOne
    private User user;

    public ResourceRequest() {}

    public Long getId() { return id; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}

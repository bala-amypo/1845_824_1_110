package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;
    private String status;
    private LocalDateTime startTime;

    @ManyToOne
    private User user;

    public ResourceRequest() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    // ✅ REQUIRED BY TEST
    public User getRequestedBy() { return user; }
    public void setRequestedBy(User user) { this.user = user; }
}


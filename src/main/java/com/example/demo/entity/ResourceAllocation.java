package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ResourceRequest resource; // TEST EXPECTS "resource"

    private LocalDateTime allocatedAt;
    private String notes;

    public ResourceAllocation() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public ResourceRequest getResource() { return resource; } // ✅ REQUIRED
    public void setResource(ResourceRequest resource) {
        this.resource = resource;
    }

    public LocalDateTime getAllocatedAt() { return allocatedAt; }
    public void setAllocatedAt(LocalDateTime allocatedAt) {
        this.allocatedAt = allocatedAt;
    }

    public String getNotes() { return notes; }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}

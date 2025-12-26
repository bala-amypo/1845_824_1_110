package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ResourceRequest resource;

    private String notes;
    private LocalDateTime allocatedAt;

    public ResourceAllocation() {}

    public Long getId() { return id; }

    public ResourceRequest getResource() {
        return resource;
    }

    public void setResource(ResourceRequest resource) {
        this.resource = resource;
    }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public LocalDateTime getAllocatedAt() { return allocatedAt; }
    public void setAllocatedAt(LocalDateTime allocatedAt) {
        this.allocatedAt = allocatedAt;
    }
}

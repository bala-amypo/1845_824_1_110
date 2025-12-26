package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ResourceRequest request;

    private LocalDateTime allocatedAt;
    private String notes;

    // ✅ REQUIRED SETTERS / GETTERS

    public void setRequest(ResourceRequest request) {
        this.request = request;
    }

    public ResourceRequest getRequest() {
        return request;
    }

    public void setAllocatedAt(LocalDateTime allocatedAt) {
        this.allocatedAt = allocatedAt;
    }

    public LocalDateTime getAllocatedAt() {
        return allocatedAt;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public Long getId() {
        return id;
    }
}

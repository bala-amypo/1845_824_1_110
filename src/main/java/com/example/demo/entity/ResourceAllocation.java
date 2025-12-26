package com.example.demo.entity;

import java.time.LocalDateTime;

public class ResourceAllocation {

    private Resource resource;
    private String notes;
    private LocalDateTime allocatedAt = LocalDateTime.now();

    public Resource getResource() { return resource; }
    public void setResource(Resource resource) { this.resource = resource; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public LocalDateTime getAllocatedAt() { return allocatedAt; }
}

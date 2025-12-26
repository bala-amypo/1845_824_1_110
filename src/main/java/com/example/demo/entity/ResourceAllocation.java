package com.example.demo.entity;

import java.time.LocalDateTime;

public class ResourceAllocation {

    private Resource resource;
    private ResourceRequest request;     // ✅ ADD
    private String status;               // ✅ ADD
    private String notes;
    private LocalDateTime allocatedAt = LocalDateTime.now();

    public Resource getResource() {
        return resource;
    }
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    // ✅ REQUIRED BY SERVICE
    public ResourceRequest getRequest() {
        return request;
    }
    public void setRequest(ResourceRequest request) {
        this.request = request;
    }

    // ✅ REQUIRED BY SERVICE
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getAllocatedAt() {
        return allocatedAt;
    }
}

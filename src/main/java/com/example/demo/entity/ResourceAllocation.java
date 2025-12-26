package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Resource resource;

    @OneToOne
    private ResourceRequest request;

    private LocalDateTime allocatedAt;

    private Boolean conflictFlag = false;

    private String notes;

    public ResourceAllocation() {}

    @PrePersist
    public void onCreate() {
        allocatedAt = LocalDateTime.now();
    }

    public Resource getResource() { return resource; }
    public LocalDateTime getAllocatedAt() { return allocatedAt; }
    public String getNotes() { return notes; }

    public void setResource(Resource resource) { this.resource = resource; }
    public void setRequest(ResourceRequest request) { this.request = request; }
    public void setNotes(String notes) { this.notes = notes; }
}

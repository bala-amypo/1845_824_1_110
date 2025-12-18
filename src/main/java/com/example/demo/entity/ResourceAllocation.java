package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resource;

    private String request;

    private String allocatedAt;
    private Boolean conflictFlag;
    private String notes;



    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getResource() { return resource; }
    public void setResource(String resource) { this.resource = resource; }
    public String getRequest() { return request; }
    public void setRequest(String request) { this.request = request; }
    public String getAllocatedAt() { return allocatedAt; }
    public void setAllocatedAt(String allocatedAt) { this.allocatedAt = allocatedAt; }
    public Boolean getConflictFlag() { return conflictFlag; }
    public void setConflictFlag(Boolean conflictFlag) { this.conflictFlag = conflictFlag; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public ResourceAllocation(Long id,)
}
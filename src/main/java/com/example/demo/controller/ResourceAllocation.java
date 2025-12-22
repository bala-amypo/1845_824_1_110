package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resource;

    // ✅ Correct relationship
    @OneToOne
    @JoinColumn(name = "request_id")
    private ResourceRequest request;

    // ✅ Correct type + name
    private LocalDate allocationDate;

    private Boolean conflictFlag;
    private String notes;

    // 🔹 Constructors
    public ResourceAllocation() {}

    public ResourceAllocation(Long id, String resource, ResourceRequest request,
                              LocalDate allocationDate, Boolean conflictFlag, String notes) {
        this.id = id;
        this.resource = resource;
        this.request = request;
        this.allocationDate = allocationDate;
        this.conflictFlag = conflictFlag;
        this.notes = notes;
    }

    // 🔹 Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getResource() { return resource; }
    public void setResource(String resource) { this.resource = resource; }

    public ResourceRequest getRequest() { return request; }
    public void setRequest(ResourceRequest request) { this.request = request; }

    public LocalDate getAllocationDate() { return allocationDate; }
    public void setAllocationDate(LocalDate allocationDate) {
        this.allocationDate = allocationDate;
    }

    public Boolean getConflictFlag() { return conflictFlag; }
    public void setConflictFlag(Boolean conflictFlag) {
        this.conflictFlag = conflictFlag;
    }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}

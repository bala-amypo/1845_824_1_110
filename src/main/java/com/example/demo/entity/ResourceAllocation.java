package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ResourceAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ResourceRequest request;

    private String status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public ResourceRequest getRequest() { return request; }
    public void setRequest(ResourceRequest request) { this.request = request; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

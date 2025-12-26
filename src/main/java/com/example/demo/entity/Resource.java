package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String resourceName;

    private String resourceType;

    private Integer capacity;

    private String location;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Resource() {}

    public String getResourceName() { return resourceName; }
    public String getResourceType() { return resourceType; }
    public Integer getCapacity() { return capacity; }

    public void setResourceName(String resourceName) { this.resourceName = resourceName; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }
}

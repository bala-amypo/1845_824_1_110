package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;
    private Integer quantity;
    private Boolean active;

    // ===== GETTERS =====
    public Long getId() {
        return id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getActive() {
        return active;
    }

    // ===== SETTERS =====
    public void setId(Long id) {
        this.id = id;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}

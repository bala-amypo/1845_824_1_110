package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Resource {

    @Id
    private Long id;
    private String resourceName;
    private String resourceType;
    private int capacity;
    private Boolean active;

    public Resource() {
    }

    // ✅ TEST EXPECTED METHODS
    public String getName() { return resourceName; }
    public void setName(String name) { this.resourceName = name; }

    public String getType() { return resourceType; }
    public void setType(String type) { this.resourceType = type; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}

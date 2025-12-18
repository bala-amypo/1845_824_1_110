// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.PrePersist;
// import java.time.LocalDateTime;

// @Entity
// public class ResourceAllocation {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "resource_id")
//     private Resource resource;

//     @OneToOne
//     @JoinColumn(name = "request_id")
//     private ResourceRequest request;

//     private LocalDateTime allocatedAt;
//     private Boolean conflictFlag;
//     private String notes;

//     @PrePersist
//     protected void onAllocate() {
//         this.allocatedAt = LocalDateTime.now();
//     }

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }
//     public Resource getResource() { return resource; }
//     public void setResource(Resource resource) { this.resource = resource; }
//     public ResourceRequest getRequest() { return request; }
//     public void setRequest(ResourceRequest request) { this.request = request; }
//     public LocalDateTime getAllocatedAt() { return allocatedAt; }
//     public void setAllocatedAt(LocalDateTime allocatedAt) { this.allocatedAt = allocatedAt; }
//     public Boolean getConflictFlag() { return conflictFlag; }
//     public void setConflictFlag(Boolean conflictFlag) { this.conflictFlag = conflictFlag; }
//     public String getNotes() { return notes; }
//     public void setNotes(String notes) { this.notes = notes; }
// }
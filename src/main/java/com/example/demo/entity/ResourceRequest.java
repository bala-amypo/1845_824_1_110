package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDateTime;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceType;
    private String requestedBy;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String purpose;
    private String status = "PENDING"; 
    public Long getId() { return id; }
    public void setId(Long id) {
         this.id = id;
          }
    public String getResourceType() { 
        return resourceType;
         }
    public void setResourceType(String resourceType) { 
        this.resourceType = resourceType;
         }
    public String getRequestedBy() {
         return requestedBy; 
         }
    public void setRequestedBy(String requestedBy) { this.requestedBy = requestedBy; }
    public LocalDateTime getStartTime() {
         return startTime; 
         }
    public void setStartTime(LocalDateTime startTime) {
         this.startTime = startTime;
          }
    public LocalDateTime getEndTime() {
         return endTime; 
         }
    public void setEndTime(LocalDateTime endTime) { 
        this.endTime = endTime;
         }
    public String getPurpose() { 
        return purpose;
         }
    public void setPurpose(String purpose) { 
        this.purpose = purpose; 
        }
    public String getStatus() {
         return status;
          }
    public void setStatus(String status) { 
        this.status = status;
        }
    public ResourceRequest(Long id,String resourceType,String requestedBy,LocalDateTime startTime,LocalDateTime endTime,String purpose,String status){

        this.id = id;
        this.resourceType=resourceType;
        this.requestedBy=requestedBy;
        this.startTime=startTime;
        this.endTime=endTime;
        this.purpose=purpose;
        this.status=status;
    }
    public ResourceRequest(){
        
    }
}

package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purpose;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private User requestedBy;

    // ===== GETTERS =====
    public Long getId() { return id; }
    public String getPurpose() { return purpose; }
    public String getStatus() { return status; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public User getRequestedBy() { return requestedBy; }

    // ===== SETTERS =====
    public void setId(Long id) { this.id = id; }
    public void setPurpose(String purpose) { this.purpose = purpose; }
    public void setStatus(String status) { this.status = status; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }
    public void setRequestedBy(User requestedBy) { this.requestedBy = requestedBy; }
}

package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class AllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String ruleName;

    private String ruleType; 
    private int priorityWeight;
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRuleName() { return ruleName; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }
    public String getRuleType() { return ruleType; }
    public void setRuleType(String ruleType) { this.ruleType = ruleType; }
    public Integer getPriorityWeight() { return priorityWeight; }
    public void setPriorityWeight(Integer priorityWeight) { this.priorityWeight = priorityWeight; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }


public AllocationRule(Long id,String ruleName,String ruleType,int priorityWeight,LocalDateTime createdAt)
{
    this.id=id;
    this.ruleName=ruleName;
    this.ruleType=ruleType;
    this.priorityWeight=priorityWeight;
    this.createdAt=createdAt;
}
public AllocationRule()
{
   
}
}
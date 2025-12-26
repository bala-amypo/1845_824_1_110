package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String ruleName;

    private String ruleType;

    private Integer priorityWeight = 0;

    private LocalDateTime createdAt = LocalDateTime.now();

    public AllocationRule() {}

    public Long getId() { return id; }
    public String getRuleName() { return ruleName; }
    public String getRuleType() { return ruleType; }
    public Integer getPriorityWeight() { return priorityWeight; }

    public void setId(Long id) { this.id = id; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }
    public void setRuleType(String ruleType) { this.ruleType = ruleType; }
    public void setPriorityWeight(Integer priorityWeight) { this.priorityWeight = priorityWeight; }
}

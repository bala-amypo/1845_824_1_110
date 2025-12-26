package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AllocationRule {

    @Id
    @GeneratedValue
    private Long id;

    private String ruleName;
    private String ruleType;
    private Integer priorityWeight;
    private String description;
    private Boolean active = true;

    public AllocationRule() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRuleName() { return ruleName; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }

    public String getRuleType() { return ruleType; }
    public void setRuleType(String ruleType) { this.ruleType = ruleType; }

    public Integer getPriorityWeight() { return priorityWeight; }
    public void setPriorityWeight(Integer priorityWeight) {
        this.priorityWeight = priorityWeight;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}

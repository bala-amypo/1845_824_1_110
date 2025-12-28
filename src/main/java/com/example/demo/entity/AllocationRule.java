// package com.example.demo.entity;

// import jakarta.persistence.*;

// @Entity
// public class AllocationRule {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String ruleName;
//     private String ruleType;
//     private Integer priorityWeight;
//     private Boolean active = true;
//     private String description;

//     public AllocationRule() {}

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public String getRuleName() { return ruleName; }
//     public void setRuleName(String ruleName) { this.ruleName = ruleName; }

//     public String getRuleType() { return ruleType; }
//     public void setRuleType(String ruleType) { this.ruleType = ruleType; }

//     public Integer getPriorityWeight() { return priorityWeight; }
//     public void setPriorityWeight(Integer priorityWeight) { this.priorityWeight = priorityWeight; }

//     public Boolean getActive() { return active; }
//     public void setActive(Boolean active) { this.active = active; }

//     public String getDescription() { return description; }
//     public void setDescription(String description) { this.description = description; }
// }
package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "allocation_rules")
public class AllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String ruleName;

    private String ruleType;

    private Integer priorityWeight = 0;

    private LocalDateTime createdAt = LocalDateTime.now();

    public AllocationRule() {
    }

    public AllocationRule(String ruleName, String ruleType, Integer priorityWeight) {
        this.ruleName = ruleName;
        this.ruleType = ruleType;
        this.priorityWeight = priorityWeight;
    }

    // ✅ ADD THESE (THIS FIXES THE ERROR)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getPriorityWeight() {
        return priorityWeight;
    }

    public void setPriorityWeight(Integer priorityWeight) {
        this.priorityWeight = priorityWeight;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}

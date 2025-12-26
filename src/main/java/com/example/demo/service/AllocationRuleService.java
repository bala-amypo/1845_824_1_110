package com.example.demo.service;

import com.example.demo.entity.AllocationRule;
import java.util.List;

public interface AllocationRuleService {

    AllocationRule createRule(AllocationRule rule);

    AllocationRule updateRule(Long id, AllocationRule rule);

    AllocationRule getRuleById(Long id);

    List<AllocationRule> getAllRules();

    void deleteRule(Long id);
}

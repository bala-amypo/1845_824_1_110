package com.example.demo.service.impl;

import com.example.demo.entity.AllocationRule;
import com.example.demo.repository.AllocationRuleRepository;
import com.example.demo.service.AllocationRuleService;
import org.springframework.stereotype.Service;

@Service
public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AllocationRuleRepository repository;

    public AllocationRuleServiceImpl(AllocationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AllocationRule create(AllocationRule rule) {

        if (repository.existsByRuleName(rule.getRuleName())) {
            throw new RuntimeException("Duplicate rule");
        }

        return repository.save(rule);
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.AllocationRule;
import com.example.demo.repository.AllocationRuleRepository;
import com.example.demo.service.AllocationRuleService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllocationRuleServiceImpl implements AllocationRuleService {

    private final AllocationRuleRepository repository;

    @Autowired
    public AllocationRuleServiceImpl(AllocationRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public AllocationRule createRule(AllocationRule rule) {
        return repository.save(rule);
    }

    @Override
    public AllocationRule updateRule(Long id, AllocationRule rule) {
        Optional<AllocationRule> existing = repository.findById(id);
        if (existing.isPresent()) {
            AllocationRule ex = existing.get();
            ex.setRuleName(rule.getRuleName());
            ex.setDescription(rule.getDescription());
            ex.setActive(rule.getActive());
            return repository.save(ex);
        }
        return null;
    }

    @Override
    public AllocationRule getRuleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<AllocationRule> getAllRules() {
        return repository.findAll();
    }

    @Override
    public void deleteRule(Long id) {
        repository.deleteById(id);
    }
}

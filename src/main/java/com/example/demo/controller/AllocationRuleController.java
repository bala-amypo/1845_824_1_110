package com.example.demo.controller;

import com.example.demo.entity.AllocationRule;
import com.example.demo.service.AllocationRuleService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rules")
public class AllocationRuleController {

    private final AllocationRuleService ruleService;

    public AllocationRuleController(AllocationRuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    public AllocationRule create(@RequestBody AllocationRule rule) {
        return ruleService.createRule(rule);
    }

    @GetMapping
    public List<AllocationRule> getAll() {
        return ruleService.getAllRules();
    }

    @GetMapping("/{id}")
    public AllocationRule getById(@PathVariable Long id) {
        return ruleService.getRule(id);
    }
}

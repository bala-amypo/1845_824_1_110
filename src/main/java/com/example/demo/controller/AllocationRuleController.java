package com.example.demo.controller;

import com.example.demo.entity.AllocationRule;
import com.example.demo.service.AllocationRuleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/allocation-rules")
public class AllocationRuleController {

    private final AllocationRuleService service;

    @Autowired
    public AllocationRuleController(AllocationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public AllocationRule create(@RequestBody AllocationRule rule) {
        return service.createRule(rule);
    }

    @GetMapping
    public List<AllocationRule> getAll() {
        return service.getAllRules();
    }
}

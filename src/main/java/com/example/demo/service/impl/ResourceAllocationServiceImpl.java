package com.example.demo.service.impl;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ⭐ REQUIRED — THIS CREATES THE BEAN
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceAllocationRepository repository;

    public ResourceAllocationServiceImpl(ResourceAllocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResourceAllocation createAllocation(ResourceAllocation allocation) {
        return repository.save(allocation);
    }

    @Override
    public List<ResourceAllocation> getAllAllocations() {
        return repository.findAll();
    }

    @Override
    public ResourceAllocation getAllocationById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceAllocationRepository allocationRepo;
    private final ResourceRequestRepository requestRepo;

    public ResourceAllocationServiceImpl(ResourceAllocationRepository allocationRepo,
                                         ResourceRequestRepository requestRepo) {
        this.allocationRepo = allocationRepo;
        this.requestRepo = requestRepo;
    }

    @Override
    public ResourceAllocation autoAllocate(Long requestId) {
        ResourceRequest request = requestRepo.findById(requestId).orElseThrow();

        ResourceAllocation allocation = new ResourceAllocation();
        allocation.setRequest(request);   // ✅ FIXED METHOD
        allocation.setStatus("ALLOCATED");

        return allocationRepo.save(allocation);
    }

    @Override
    public ResourceAllocation getAllocation(Long id) {
        return allocationRepo.findById(id).orElse(null);
    }

    @Override
    public List<ResourceAllocation> getAllAllocations() {
        return allocationRepo.findAll();
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.*;
import com.example.demo.service.ResourceAllocationService;

import java.time.LocalDateTime;

public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceRequestRepository requestRepository;
    private final ResourceRepository resourceRepository;
    private final ResourceAllocationRepository allocationRepository;

    // ✅ EXACT constructor expected by test
    public ResourceAllocationServiceImpl(
            ResourceRequestRepository requestRepository,
            ResourceRepository resourceRepository,
            ResourceAllocationRepository allocationRepository
    ) {
        this.requestRepository = requestRepository;
        this.resourceRepository = resourceRepository;
        this.allocationRepository = allocationRepository;
    }

    @Override
    public ResourceAllocation autoAllocate(Long requestId) {

        ResourceRequest request = requestRepository.findById(requestId).orElse(null);
        if (request == null) return null;

        ResourceAllocation allocation = new ResourceAllocation();
        allocation.setResource(request);
        allocation.setAllocatedAt(LocalDateTime.now());
        allocation.setNotes("Auto allocated");

        return allocationRepository.save(allocation);
    }

    @Override
    public ResourceAllocation getAllocation(Long id) {
        return allocationRepository.findById(id).orElse(null);
    }
}

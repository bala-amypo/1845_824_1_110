package com.example.demo.service.impl;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceAllocationRepository allocationRepository;
    private final ResourceRequestRepository requestRepository;

    public ResourceAllocationServiceImpl(
            ResourceAllocationRepository allocationRepository,
            ResourceRequestRepository requestRepository
    ) {
        this.allocationRepository = allocationRepository;
        this.requestRepository = requestRepository;
    }

    // ✅ FIX 1
    @Override
    public List<ResourceAllocation> getAllAllocations() {
        return allocationRepository.findAll();
    }

    // ✅ FIX 2
    @Override
    public ResourceAllocation getAllocation(Long id) {
        return allocationRepository.findById(id).orElse(null);
    }
}

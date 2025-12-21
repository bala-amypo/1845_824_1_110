package com.example.demo.service.impl;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceAllocationRepository allocationRepository;
    private final ResourceRequestRepository requestRepository;

    public ResourceAllocationServiceImpl(ResourceAllocationRepository allocationRepository,
                                         ResourceRequestRepository requestRepository) {
        this.allocationRepository = allocationRepository;
        this.requestRepository = requestRepository;
    }

    @Override
    public ResourceAllocation autoAllocate(Long requestId) {
        ResourceRequest request = requestRepository.findById(requestId)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        ResourceAllocation allocation = new ResourceAllocation();
        allocation.setRequest(request);
        allocation.setAllocationDate(LocalDate.now());

        request.setStatus("APPROVED");

        return allocationRepository.save(allocation);
    }

    @Override
    public ResourceAllocation getAllocation(Long id) {
        return allocationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Allocation not found"));
    }

    @Override
    public List<ResourceAllocation> getAllAllocations() {
        return allocationRepository.findAll();
    }
}

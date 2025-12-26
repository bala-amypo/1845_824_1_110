package com.example.demo.service.Implementation;

import com.example.demo.entity.ResourceAllocation;
import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceAllocationRepository allocationRepository;
    private final ResourceRequestRepository requestRepository;

    public ResourceAllocationServiceImpl(
            ResourceAllocationRepository allocationRepository,
            ResourceRequestRepository requestRepository) {

        this.allocationRepository = allocationRepository;
        this.requestRepository = requestRepository;
    }

    @Override
    public List<ResourceAllocation> getAllAllocations() {
        return allocationRepository.findAll();
    }

    @Override
    public ResourceAllocation getAllocation(Long id) {
        return allocationRepository.findById(id).orElse(null);
    }

    @Override
    public ResourceAllocation autoAllocate(Long requestId) {

        ResourceRequest request = requestRepository.findById(requestId)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        ResourceAllocation allocation = new ResourceAllocation();
        allocation.setRequest(request);
        allocation.setAllocatedAt(LocalDateTime.now());

        return allocationRepository.save(allocation);
    }
}

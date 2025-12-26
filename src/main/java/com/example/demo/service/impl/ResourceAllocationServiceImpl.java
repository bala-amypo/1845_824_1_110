package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.entity.ResourceAllocation;
import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceAllocationService;

import java.util.List;

public class ResourceAllocationServiceImpl implements ResourceAllocationService {

    private final ResourceRequestRepository reqRepo;
    private final ResourceRepository resRepo;
    private final ResourceAllocationRepository allocRepo;

    // OLD constructor (keep if exists)
    public ResourceAllocationServiceImpl(ResourceAllocationRepository allocRepo,
                                         ResourceRequestRepository reqRepo) {
        this.allocRepo = allocRepo;
        this.reqRepo = reqRepo;
        this.resRepo = null;
    }

    // ✅ REQUIRED BY TEST
    public ResourceAllocationServiceImpl(ResourceRequestRepository reqRepo,
                                         ResourceRepository resRepo,
                                         ResourceAllocationRepository allocRepo) {
        this.reqRepo = reqRepo;
        this.resRepo = resRepo;
        this.allocRepo = allocRepo;
    }

    @Override
    public ResourceAllocation autoAllocate(Long requestId) {
        ResourceRequest req = reqRepo.findById(requestId).orElseThrow();

        List<Resource> resources = resRepo.findByResourceType(req.getResourceType());
        if (resources.isEmpty()) {
            throw new RuntimeException("No resource available");
        }

        ResourceAllocation a = new ResourceAllocation();
        a.setResource(resources.get(0));
        a.setRequest(req);
        a.setStatus("ALLOCATED");

        return allocRepo.save(a);
    }

    @Override
    public List<ResourceAllocation> getAllAllocations() {
        return allocRepo.findAll();
    }
}

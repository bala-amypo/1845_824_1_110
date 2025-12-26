package com.example.demo.service.impl;

import com.example.demo.repository.*;
import org.springframework.stereotype.Service;

@Service
public class ResourceAllocationServiceImpl {

    private final ResourceRequestRepository requestRepo;
    private final ResourceRepository resourceRepo;
    private final ResourceAllocationRepository allocationRepo;

    // ✅ REQUIRED BY TEST
    public ResourceAllocationServiceImpl(
            ResourceRequestRepository requestRepo,
            ResourceRepository resourceRepo,
            ResourceAllocationRepository allocationRepo
    ) {
        this.requestRepo = requestRepo;
        this.resourceRepo = resourceRepo;
        this.allocationRepo = allocationRepo;
    }
}

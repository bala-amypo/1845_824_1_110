package com.example.demo.service.impl;

import com.example.demo.repository.ResourceAllocationRepository;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceAllocationService;
import org.springframework.stereotype.Service;

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
}

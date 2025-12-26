package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceRequestService;

@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository requestRepository;

    public ResourceRequestServiceImpl(ResourceRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public ResourceRequest createRequest(ResourceRequest request) {
        return requestRepository.save(request);
    }

    // ✅ IMPLEMENT METHOD
    @Override
    public List<ResourceRequest> getAllRequests() {
        return requestRepository.findAll();
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.service.ResourceRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ✅ THIS IS WHAT CREATES THE BEAN
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository repository;

    public ResourceRequestServiceImpl(ResourceRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResourceRequest createRequest(ResourceRequest request) {
        return repository.save(request);
    }

    @Override
    public ResourceRequest getRequest(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ResourceRequest> getAllRequests() {
        return repository.findAll();
    }
}

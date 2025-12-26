package com.example.demo.service.impl;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ResourceRequestService;

import java.util.List;

public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository repo;
    private UserRepository userRepo;

    // EXISTING
    public ResourceRequestServiceImpl(ResourceRequestRepository repo) {
        this.repo = repo;
    }

    // ✅ REQUIRED BY TEST
    public ResourceRequestServiceImpl(ResourceRequestRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @Override
    public ResourceRequest createRequest(ResourceRequest request) {
        request.setStatus("PENDING");
        return repo.save(request);
    }

    // ✅ REQUIRED
    @Override
    public ResourceRequest createRequest(Long userId, ResourceRequest request) {
        User u = userRepo.findById(userId).orElseThrow();
        request.setRequestedBy(u);
        request.setStatus("PENDING");
        return repo.save(request);
    }

    @Override
    public List<ResourceRequest> getAllRequests() {
        return repo.findAll();
    }

    // ✅ REQUIRED
    @Override
    public List<ResourceRequest> getRequestsByUser(Long userId) {
        return repo.findByRequestedBy_Id(userId);
    }

    // ✅ REQUIRED
    @Override
    public ResourceRequest updateRequestStatus(Long requestId, String status) {
        ResourceRequest r = repo.findById(requestId).orElseThrow();
        r.setStatus(status);
        return repo.save(r);
    }
}

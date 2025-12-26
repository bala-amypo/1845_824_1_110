package com.example.demo.service.impl;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.ResourceRequestRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ResourceRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceRequestServiceImpl implements ResourceRequestService {

    private final ResourceRequestRepository repo;
    private final UserRepository userRepo;

    public ResourceRequestServiceImpl(ResourceRequestRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @Override
    public ResourceRequest createRequest(Long userId, ResourceRequest request) {
        User u = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        request.setRequestedBy(u);
        request.setStatus("PENDING");
        return repo.save(request);
    }

    @Override
    public ResourceRequest getRequest(Long requestId) {
        return repo.findById(requestId)
                .orElseThrow(() -> new RuntimeException("Request not found"));
    }

    @Override
    public List<ResourceRequest> getAllRequests() {
        return repo.findAll();
    }

    @Override
    public List<ResourceRequest> getRequestsByUser(Long userId) {
        return repo.findByRequestedBy_Id(userId);
    }

    @Override
    public ResourceRequest updateRequestStatus(Long requestId, String status) {
        ResourceRequest r = getRequest(requestId);
        r.setStatus(status);
        return repo.save(r);
    }
}

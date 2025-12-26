package com.example.demo.service;

import com.example.demo.entity.ResourceRequest;
import java.util.List;

public interface ResourceRequestService {

    ResourceRequest createRequest(ResourceRequest request);

    // ✅ ADD (required by tests)
    ResourceRequest createRequest(Long userId, ResourceRequest request);

    List<ResourceRequest> getAllRequests();

    // ✅ ADD
    List<ResourceRequest> getRequestsByUser(Long userId);

    // ✅ ADD
    ResourceRequest updateRequestStatus(Long requestId, String status);
}

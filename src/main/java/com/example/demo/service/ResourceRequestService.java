package com.example.demo.service;

import com.example.demo.entity.ResourceRequest;
import java.util.List;

public interface ResourceRequestService {

    ResourceRequest createRequest(ResourceRequest request, Long userId);

    List<ResourceRequest> getRequestsByUser(Long userId);

    // ✅ This method MUST be implemented
    ResourceRequest updateRequestStatus(Long requestId, String status);
}

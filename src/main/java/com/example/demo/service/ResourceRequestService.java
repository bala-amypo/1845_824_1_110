package com.example.demo.service;

import com.example.demo.entity.ResourceRequest;
import java.util.List;

public interface ResourceRequestService {

    ResourceRequest createRequest(ResourceRequest request, Long userId);

    List<ResourceRequest> getRequestsByUser(Long userId);

    ResourceRequest updateRequestStatus(Long requestId, String status);

    // ✅ REQUIRED by controller
    ResourceRequest getRequestById(Long id);
}

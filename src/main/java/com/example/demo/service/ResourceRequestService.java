package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ResourceRequest;

public interface ResourceRequestService {

    ResourceRequest createRequest(ResourceRequest request);

    // ✅ ADD THIS
    List<ResourceRequest> getAllRequests();
}

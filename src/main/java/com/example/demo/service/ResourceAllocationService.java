package com.example.demo.service;

import com.example.demo.entity.ResourceAllocation;
import java.util.List;

public interface ResourceAllocationService {

    ResourceAllocation autoAllocate(Long requestId);

    ResourceAllocation getAllocation(Long id);

    // ✅ REQUIRED BY CONTROLLER
    List<ResourceAllocation> getAllAllocations();
}

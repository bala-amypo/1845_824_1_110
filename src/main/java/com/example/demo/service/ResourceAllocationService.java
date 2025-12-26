package com.example.demo.service;

import com.example.demo.entity.ResourceAllocation;
import java.util.List;

public interface ResourceAllocationService {

    List<ResourceAllocation> getAllAllocations();

    ResourceAllocation getAllocation(Long id);

    // ✅ ADD THIS EXACT METHOD
    ResourceAllocation autoAllocate(Long requestId);
}

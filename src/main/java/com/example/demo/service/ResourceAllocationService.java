package com.example.demo.service;

import com.example.demo.entity.ResourceAllocation;
import java.util.List;

public interface ResourceAllocationService {

    List<ResourceAllocation> getAllAllocations();

    ResourceAllocation getAllocation(Long id);

    ResourceAllocation autoAllocate(Long requestId); // ✅ REQUIRED
}

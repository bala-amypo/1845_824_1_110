package com.example.demo.service;

import com.example.demo.entity.ResourceAllocation;
import java.util.List;

public interface ResourceAllocationService {

    ResourceAllocation createAllocation(ResourceAllocation allocation);

    List<ResourceAllocation> getAllAllocations();

    ResourceAllocation getAllocationById(Long id);
}

package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import java.util.List;
import java.util.Optional;

public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public Resource createResource(Resource resource) {

        if (resource.getResourceType() == null || resource.getCapacity() == null) {
            throw new IllegalArgumentException("Invalid resource");
        }

        if (resource.getCapacity() < 1) {
            throw new IllegalArgumentException("Invalid capacity");
        }

        if (resourceRepository.existsByResourceName(resource.getResourceName())) {
            throw new IllegalArgumentException("Resource already exists");
        }

        return resourceRepository.save(resource);
    }

    @Override
    public Resource getResource(Long id) {
        Optional<Resource> r = resourceRepository.findById(id);
        if (r.isEmpty()) {
            throw new RuntimeException("Resource not found");
        }
        return r.get();
    }

    @Override
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repo;

    public ResourceServiceImpl(ResourceRepository repo) {
        this.repo = repo;
    }

    @Override
    public Resource createResource(Resource resource) {

        if (resource.getResourceName() == null ||
            resource.getResourceType() == null ||
            resource.getCapacity() == null) {
            throw new RuntimeException("Invalid resource");
        }

        if (repo.existsByResourceName(resource.getResourceName())) {
            throw new RuntimeException("Resource already exists");
        }

        return repo.save(resource);
    }

    @Override
    public List<Resource> getAllResources() {
        return repo.findAll();
    }

    // ✅ REQUIRED METHOD — SIMPLE IMPLEMENTATION
    @Override
    public void deleteResource(Long id) {
        repo.deleteById(id);
    }
}

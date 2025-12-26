package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repository;

    public ResourceServiceImpl(ResourceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Resource create(Resource resource) {

        if (resource.getName() == null || resource.getName().trim().isEmpty()) {
            throw new RuntimeException("Invalid resource");
        }

        if (resource.getCapacity() == null || resource.getCapacity() <= 0) {
            throw new RuntimeException("Invalid resource");
        }

        if (repository.existsByName(resource.getName())) {
            throw new RuntimeException("Duplicate resource");
        }

        return repository.save(resource);
    }
}

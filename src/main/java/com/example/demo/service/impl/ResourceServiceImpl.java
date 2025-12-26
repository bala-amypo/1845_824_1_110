package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;
import com.example.demo.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ⭐ THIS CREATES THE BEAN
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository repository;

    public ResourceServiceImpl(ResourceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Resource createResource(Resource resource) {
        return repository.save(resource);
    }

    @Override
    public List<Resource> getAllResources() {
        return repository.findAll();
    }

    @Override
    public Resource getResourceById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Resource updateResource(Long id, Resource resource) {
        Resource existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(resource.getName());
            existing.setType(resource.getType());
            existing.setActive(resource.getActive());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteResource(Long id) {
        repository.deleteById(id);
    }
}

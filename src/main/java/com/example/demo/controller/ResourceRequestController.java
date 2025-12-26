package com.example.demo.controller;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.service.ResourceRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resource-requests")
public class ResourceRequestController {

    private final ResourceRequestService service;

    public ResourceRequestController(ResourceRequestService service) {
        this.service = service;
    }

    @PostMapping
    public ResourceRequest create(@RequestBody ResourceRequest request) {
        return service.createRequest(request);
    }

    @GetMapping("/{id}")
    public ResourceRequest getById(@PathVariable Long id) {
        return service.getRequest(id);
    }

    @GetMapping
    public List<ResourceRequest> getAll() {
        return service.getAllRequests();
    }
}

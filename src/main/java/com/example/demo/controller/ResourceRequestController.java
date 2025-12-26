package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.service.ResourceRequestService;

@RestController
@RequestMapping("/requests")
public class ResourceRequestController {

    private final ResourceRequestService requestService;

    public ResourceRequestController(ResourceRequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<ResourceRequest> getAllRequests() {
        return requestService.getAllRequests();
    }
}

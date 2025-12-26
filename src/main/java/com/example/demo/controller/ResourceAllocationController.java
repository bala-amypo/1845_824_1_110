package com.example.demo.controller;

import com.example.demo.service.ResourceAllocationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceAllocationController {

    private final ResourceAllocationService service;

    public ResourceAllocationController(ResourceAllocationService service) {
        this.service = service;
    }
}

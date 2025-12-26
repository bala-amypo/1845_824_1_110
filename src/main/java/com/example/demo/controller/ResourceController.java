package com.example.demo.controller;

import com.example.demo.service.ResourceService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }
}

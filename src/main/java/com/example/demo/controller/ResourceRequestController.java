package com.example.demo.controller;

import com.example.demo.entity.ResourceRequest;
import com.example.demo.service.ResourceRequestService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/requests")
public class ResourceRequestController {

    private final ResourceRequestService requestService;

    public ResourceRequestController(ResourceRequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/{userId}")
    public ResourceRequest create(@PathVariable Long userId,
                                  @RequestBody ResourceRequest request) {
        return requestService.createRequest(userId, request);
    }

    @GetMapping("/user/{userId}")
    public List<ResourceRequest> getByUser(@PathVariable Long userId) {
        return requestService.getRequestsByUser(userId);
    }

    @GetMapping("/{id}")
    public ResourceRequest getById(@PathVariable Long id) {
        return requestService.getRequest(id);
    }

    @PutMapping("/status/{id}")
    public ResourceRequest updateStatus(@PathVariable Long id,
                                        @RequestBody String status) {
        return requestService.updateRequestStatus(id, status);
    }
}

package com.example.demo.repository;

import com.example.demo.entity.ResourceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceAllocationRepository
        extends JpaRepository<ResourceRequest, Long> {
}

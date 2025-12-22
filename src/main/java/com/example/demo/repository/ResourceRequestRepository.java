package com.example.demo.repository;

import com.example.demo.entity.ResourceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResourceRequestRepository extends JpaRepository<ResourceRequest, Long> {

    // ✅ This fixes ERROR #2
    List<ResourceRequest> findByUserId(Long userId);
}

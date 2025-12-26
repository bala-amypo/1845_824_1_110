package com.example.demo.repository;

import com.example.demo.entity.ResourceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ResourceRequestRepository
        extends JpaRepository<ResourceRequest, Long> {

    // ✅ Already required by tests
    List<ResourceRequest> findByRequestedBy_Id(long id);

    List<ResourceRequest> findByStartTimeBetween(
            LocalDateTime start,
            LocalDateTime end
    );

    // ✅ REQUIRED BY ResourceRequestServiceImpl
    List<ResourceRequest> findByUserId(Long userId);
}

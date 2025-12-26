package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
public interface ResourceAllocationRepository extends JpaRepository<ResourceAllocation, Long> { 
 
    List<ResourceRequest> findByRequestedBy_Id(Long id);
    List<ResourceRequest> findByStartTimeBetween(LocalDateTime a, LocalDateTime b);
}

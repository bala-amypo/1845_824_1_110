package com.example.demo.repository;

import com.example.demo.entity.ResourceRequest;
import java.lang.Long;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRequestRepository extends JpaRepository<ResourceRequest, Long> {

    List<ResourceRequest> findByRequestedById(Long userId);

    List<ResourceRequest> findByStartTimeBetween(LocalDateTime start,
                                                 LocalDateTime end);
}

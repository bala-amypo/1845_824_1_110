package com.example.demo.repository;

import com.example.demo.entity.Resource;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

    boolean existsByResourceName(String resourceName);

    List<Resource> findByResourceType(String resourceType);
}

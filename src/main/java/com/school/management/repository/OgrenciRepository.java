package com.school.management.repository;

import com.school.management.model.entity.OgrenciEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepository extends JpaRepository<OgrenciEntity, Long> {
    OgrenciEntity findByOgrenciNo(String ogrenciNo);
}

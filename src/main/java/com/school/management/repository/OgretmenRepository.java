package com.school.management.repository;

import com.school.management.model.entity.OgretmenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgretmenRepository extends JpaRepository<OgretmenEntity, Long> {

    OgretmenEntity findBySicil(String sicilNo);
}

package com.example.job_application_scoring.repository;

import com.example.job_application_scoring.entity.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPosition, Long> {
}

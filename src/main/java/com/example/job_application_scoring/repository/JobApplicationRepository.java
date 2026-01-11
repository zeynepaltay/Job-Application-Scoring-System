package com.example.job_application_scoring.repository;

import com.example.job_application_scoring.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}

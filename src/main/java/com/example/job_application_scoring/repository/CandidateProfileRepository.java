package com.example.job_application_scoring.repository;

import com.example.job_application_scoring.entity.CandidateProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateProfileRepository extends JpaRepository<CandidateProfile, Long> {
}

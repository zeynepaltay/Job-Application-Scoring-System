package com.example.job_application_scoring.service;

import com.example.job_application_scoring.dto.responses.JobPositionResponse;
import com.example.job_application_scoring.dto.ruquests.JobPositionRequest;

public interface JobPositionService {
    JobPositionResponse createJobPosition(JobPositionRequest request);
    JobPositionResponse updateJobPosition(JobPositionRequest request, Long id);
    void deleteJobPosition(Long id);
}
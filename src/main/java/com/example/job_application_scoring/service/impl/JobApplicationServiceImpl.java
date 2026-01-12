package com.example.job_application_scoring.service.impl;

import com.example.job_application_scoring.repository.JobApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobApplicationServiceImpl {
    private final JobApplicationRepository jobApplicationRepository;
}

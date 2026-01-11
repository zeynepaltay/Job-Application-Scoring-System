package com.example.job_application_scoring.service.impl;

import com.example.job_application_scoring.repository.JobPositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobPositionServiceImpl {
    private final JobPositionRepository jobPositionRepository;

}

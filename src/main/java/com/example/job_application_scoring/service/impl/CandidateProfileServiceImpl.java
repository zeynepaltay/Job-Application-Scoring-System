package com.example.job_application_scoring.service.impl;

import com.example.job_application_scoring.repository.CandidateProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateProfileServiceImpl {
    private final CandidateProfileRepository candidateProfileRepository;
}

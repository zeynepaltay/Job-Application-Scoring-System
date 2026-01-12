package com.example.job_application_scoring.service.impl;

import com.example.job_application_scoring.dto.responses.CandidateProfileResponse;
import com.example.job_application_scoring.dto.ruquests.CandidateProfileRequest;
import com.example.job_application_scoring.entity.CandidateProfile;
import com.example.job_application_scoring.mapper.CandidateProfileMapper;
import com.example.job_application_scoring.repository.CandidateProfileRepository;
import com.example.job_application_scoring.service.CandidateProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateProfileServiceImpl implements CandidateProfileService {
    private final CandidateProfileRepository candidateProfileRepository;
    private final CandidateProfileMapper candidateProfileMapper;

    //@Transactional olmalı mı?
    @Override
    public CandidateProfileResponse createProfile(CandidateProfileRequest candidateProfileRequest) {
        CandidateProfile entity = candidateProfileMapper.toEntity(candidateProfileRequest);
        CandidateProfile saved = candidateProfileRepository.save(entity);
        return candidateProfileMapper.toResponse(saved);
    }
}

package com.example.job_application_scoring.service;

import com.example.job_application_scoring.dto.responses.CandidateProfileResponse;
import com.example.job_application_scoring.dto.ruquests.CandidateProfileRequest;

public interface CandidateProfileService {
    CandidateProfileResponse createProfile(CandidateProfileRequest candidateProfileRequest);
    CandidateProfileResponse updateProfile(CandidateProfileRequest request, Long id);
    void deleteProfile(Long id);
}

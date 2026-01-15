package com.example.job_application_scoring.controller;

import com.example.job_application_scoring.dto.responses.CandidateProfileResponse;
import com.example.job_application_scoring.dto.ruquests.CandidateProfileRequest;
import com.example.job_application_scoring.service.CandidateProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidate-profiles")
@RequiredArgsConstructor
public class CandidateProfileController {
 private final CandidateProfileService candidateProfileService;

    @PostMapping
    public CandidateProfileResponse create(@Valid @RequestBody CandidateProfileRequest request
    ) {
        return candidateProfileService.createProfile(request);
    }
}

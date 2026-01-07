package com.example.job_application_scoring.dto.ruquests;

import jakarta.validation.constraints.NotNull;

public class JobApplicationRequest {
    @NotNull(message = "Candidate id is required")
    private Long candidateId;
    @NotNull(message = "Position id is required")
    private Long positionId;
}
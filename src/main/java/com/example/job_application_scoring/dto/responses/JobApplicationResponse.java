package com.example.job_application_scoring.dto.responses;

import com.example.job_application_scoring.enums.JobApplicationStatus;
import java.time.LocalDateTime;

public class JobApplicationResponse {
    private Long id;
    private Long candidateId;
    private Long positionId;
    private LocalDateTime appliedAt;
    private Double score;
    private JobApplicationStatus status;
}
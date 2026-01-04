package com.example.job_application_scoring.entity;

import com.example.job_application_scoring.enums.JobApplicationStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long candidateId;
    private Long jobApplicationId;
    private LocalDateTime appliedAt;
    private Double score;
    @Enumerated(EnumType.STRING)
    private JobApplicationStatus status;
}

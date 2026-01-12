package com.example.job_application_scoring.dto.ruquests;

import com.example.job_application_scoring.enums.EducationLevel;
import com.example.job_application_scoring.enums.SkillName;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
public class CandidateProfileRequest {
    @NotNull(message = "Experience year is required")
    @Min(value = 0, message = "Experience year cannot be negative")
    private Integer yearsOfExperience;
    @NotEmpty(message = "Skills cannot be empty")
    private Set<SkillName> skills;
    @NotBlank(message = "Can't pass without choosing an education level")
    private EducationLevel educationLevel;
    private Set<String> certificates;
}
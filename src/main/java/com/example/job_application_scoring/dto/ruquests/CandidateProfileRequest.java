package com.example.job_application_scoring.dto.ruquests;

import com.example.job_application_scoring.enums.EducationLevel;
import com.example.job_application_scoring.enums.SkillName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.Set;
public class CandidateProfileRequest {
    @NotBlank(message = "Experience year is a required field")
    private Integer yearsOfExperience;
    @NotEmpty(message = "Skills cannot be empty")
    private Set<SkillName> skills;
    @NotBlank(message = "Can't pass without choosing an education level")
    private EducationLevel educationLevel;
    private Set<String> certificates;
}
package com.example.job_application_scoring.dto.ruquests;

import com.example.job_application_scoring.enums.SkillName;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public class JobPositionRequest {
    @NotBlank(message = "Title is required")
    private String title;
    @NotEmpty(message = "At least one required skill must be provided")
    private Set<SkillName> requiredSkills;
    private Set<SkillName> niceToHaveSkills;
    @NotNull(message = "Minimum experience year is required")
    @Min(value = 0, message = "Experience year cannot be negative")
    private Integer minExperienceYear;
}
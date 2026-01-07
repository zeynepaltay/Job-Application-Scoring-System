package com.example.job_application_scoring.dto.responses;

import com.example.job_application_scoring.enums.SkillName;

import java.util.Set;

public class JobPositionResponse {
    private Long id;
    private String title;
    private Set<SkillName> requiredSkills;
    private Set<SkillName> niceToHaveSkills;
    private Integer minExperienceYear;
}
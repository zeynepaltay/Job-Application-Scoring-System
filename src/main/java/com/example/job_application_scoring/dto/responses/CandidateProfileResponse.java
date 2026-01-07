package com.example.job_application_scoring.dto.responses;

import com.example.job_application_scoring.enums.EducationLevel;
import com.example.job_application_scoring.enums.SkillName;
import java.util.Set;

public class CandidateProfileResponse {
    private Integer yearsOfExperience;
    private Set<SkillName> skills;
    private EducationLevel educationLevel;
    private Set<String> certificates;
}
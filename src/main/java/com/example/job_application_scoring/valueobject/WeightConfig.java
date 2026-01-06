package com.example.job_application_scoring.valueobject;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WeightConfig {
    private int requiredSkillScore;      // 40
    private int niceToHaveSkillScore;     // 10
    private int minExperienceScore;       // 30
    private int extraExperiencePerYear;   // 5
    private int certificationScore;       //10
}

package com.example.job_application_scoring.valueobject;

import jakarta.persistence.Embeddable;

@Embeddable
public class WeightConfig {
    double skill;
    double experience;
    double education;
}

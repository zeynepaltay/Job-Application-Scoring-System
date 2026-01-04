package com.example.job_application_scoring.entity;

import com.example.job_application_scoring.enums.EducationLevel;
import com.example.job_application_scoring.enums.SkillName;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CandidateProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "years_of_experinece")
    private Integer yearsOfExperience;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SkillName> skills;
    @Enumerated(EnumType.STRING)
    private EducationLevel educationLevel;
    @ElementCollection//bak bi emin değilim
    @Column(name = "certificates")
    private Set<String> certificates;
}

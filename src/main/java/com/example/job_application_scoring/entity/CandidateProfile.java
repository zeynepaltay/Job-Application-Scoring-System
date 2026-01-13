package com.example.job_application_scoring.entity;

import com.example.job_application_scoring.enums.EducationLevel;
import com.example.job_application_scoring.enums.SkillName;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)//neden??
@AllArgsConstructor
public class CandidateProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "years_of_experience")
    private Integer yearsOfExperience;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SkillName> skills;
    @Enumerated(EnumType.STRING)
    private EducationLevel educationLevel;
    @ElementCollection//bak bi emin değilim
    private Set<String> certificates;
    @OneToMany(mappedBy = "candidate")
    private List<JobApplication> applications = new ArrayList<>();
}

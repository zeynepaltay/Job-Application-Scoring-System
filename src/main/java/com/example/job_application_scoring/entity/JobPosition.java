package com.example.job_application_scoring.entity;

import com.example.job_application_scoring.enums.SkillName;
import com.example.job_application_scoring.valueobject.WeightConfig;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SkillName> requiredSkills; //enum mu yapmalıyım ayrı bir obje mi?
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<SkillName> niceToHaveSkills;
    @Column(name = "min_experience_year")
    private Integer minExperienceYear;
    @Embedded
    private WeightConfig weights;
}

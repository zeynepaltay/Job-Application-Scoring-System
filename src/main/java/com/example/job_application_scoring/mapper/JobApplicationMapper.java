package com.example.job_application_scoring.mapper;

import com.example.job_application_scoring.dto.responses.JobApplicationResponse;
import com.example.job_application_scoring.dto.ruquests.JobApplicationRequest;
import com.example.job_application_scoring.entity.JobApplication;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface JobApplicationMapper {
    @Mapping(target = "candidate", ignore = true)
    @Mapping(target = "position", ignore =true)
    @Mapping(target = "appliedAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "status", constant = "APPLIED")
    JobApplication toEntity(JobApplicationRequest request);
    @Mapping(target = "candidateId", source = "candidate.id")
    @Mapping(target = "positionId", source = "position.id")
    JobApplicationResponse toResponse(JobApplicationRequest entity);
}

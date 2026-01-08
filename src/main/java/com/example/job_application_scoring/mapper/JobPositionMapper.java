package com.example.job_application_scoring.mapper;

import com.example.job_application_scoring.dto.responses.JobPositionResponse;
import com.example.job_application_scoring.dto.ruquests.JobPositionRequest;
import com.example.job_application_scoring.entity.JobPosition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobPositionMapper {
    JobPosition toEntity(JobPositionRequest request);
    JobPositionResponse toResponse(JobPosition entity);
}

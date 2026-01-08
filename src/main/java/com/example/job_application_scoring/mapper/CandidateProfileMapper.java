package com.example.job_application_scoring.mapper;

import com.example.job_application_scoring.dto.responses.CandidateProfileResponse;
import com.example.job_application_scoring.dto.ruquests.CandidateProfileRequest;
import com.example.job_application_scoring.entity.CandidateProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidateProfileMapper {
    CandidateProfile toEntity(CandidateProfileRequest request);
    CandidateProfileResponse toResponse(CandidateProfile entity);
}

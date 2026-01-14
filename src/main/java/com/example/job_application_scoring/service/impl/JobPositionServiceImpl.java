package com.example.job_application_scoring.service.impl;

import com.example.job_application_scoring.dto.responses.JobPositionResponse;
import com.example.job_application_scoring.dto.ruquests.JobPositionRequest;
import com.example.job_application_scoring.entity.JobPosition;
import com.example.job_application_scoring.mapper.JobPositionMapper;
import com.example.job_application_scoring.repository.JobPositionRepository;
import com.example.job_application_scoring.service.JobPositionService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobPositionServiceImpl implements JobPositionService {
    private final JobPositionRepository jobPositionRepository;
    private final JobPositionMapper jobPositionMapper;

    @Override
    public JobPositionResponse createJobPosition(JobPositionRequest request) {
        JobPosition entity = jobPositionMapper.toEntity(request);
        JobPosition saved = jobPositionRepository.save(entity);
        return jobPositionMapper.toResponse(saved);
    }

    @Transactional
    @Override
    public JobPositionResponse updateJobPosition(JobPositionRequest request, Long id) {
        JobPosition jobPosition = jobPositionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Job position with id " + id + " not found"));
        jobPosition.setTitle(request.getTitle());
        jobPosition.setRequiredSkills(request.getRequiredSkills());
        jobPosition.setNiceToHaveSkills(request.getNiceToHaveSkills());
        jobPosition.setMinExperienceYear(request.getMinExperienceYear());
        jobPositionRepository.save(jobPosition);
        return jobPositionMapper.toResponse(jobPosition);
    }

    @Transactional
    @Override
    public void deleteJobPosition(Long id) {
        JobPosition jobPosition = jobPositionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Position not found"));

        jobPositionRepository.delete(jobPosition);
    }
}

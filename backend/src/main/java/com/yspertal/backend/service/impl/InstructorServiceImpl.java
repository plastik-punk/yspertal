package com.yspertal.backend.service.impl;

import com.yspertal.backend.endpoint.dtos.InstructorCreateDto;
import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;
import com.yspertal.backend.entity.Instructor;
import com.yspertal.backend.repository.InstructorRepository;
import com.yspertal.backend.service.InstructorService;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

@Service
public class InstructorServiceImpl implements InstructorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public InstructorDetailDto login(InstructorCreateDto instructorCreateDto) throws Exception {
        Instructor instructor;
        try {
            instructor = instructorRepository.findByFirstNameAndLastName(instructorCreateDto.getFirstName(), instructorCreateDto.getLastName());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new Exception("Error while logging in: " + e.getMessage());
        }
        if (instructor == null) {
            throw new Exception("Instructor not found");
        }
        return new InstructorDetailDto(instructor);
    }

    @Override
    public InstructorDetailDto getInstructorById(Integer id) {
        Instructor instructor = instructorRepository.findById(id).orElse(null);
        if (instructor == null) {
            throw new EntityNotFoundException("Instructor not found");
        }
        return new InstructorDetailDto(instructor);
    }

}

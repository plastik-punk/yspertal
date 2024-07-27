package com.yspertal.backend.service.impl;

import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;
import com.yspertal.backend.endpoint.dtos.InstructorLoginDto;
import com.yspertal.backend.entity.Instructor;
import com.yspertal.backend.repository.InstructorRepository;
import com.yspertal.backend.service.InstructorService;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public InstructorDetailDto login(InstructorLoginDto instructorLoginDto) throws Exception {
        Instructor instructor;
        try {
            instructor = instructorRepository.findByFirstNameAndLastName(instructorLoginDto.getFirstName(), instructorLoginDto.getLastName());
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
        LOGGER.info("Instructor found: {}", instructor);
        return new InstructorDetailDto(instructor);
    }

    @Override
    public List<InstructorDetailDto> getAllInstructors() throws Exception {
        List<Instructor> instructors;
        try {
            LOGGER.info("Getting all instructors");
            instructors = instructorRepository.findAll();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new Exception("Error while getting all instructors: " + e.getMessage());
        }

        List<InstructorDetailDto> instructorDetailDtos = new ArrayList<>();
        for (Instructor instructor : instructors) {
            instructorDetailDtos.add(new InstructorDetailDto(instructor));
        }
        return instructorDetailDtos;
    }

    @Override
    public List<InstructorDetailDto> updateInstructors(List<InstructorDetailDto> instructorDetailDto) {
        List<Instructor> instructors = new ArrayList<>();
        for (InstructorDetailDto instructorDetail : instructorDetailDto) {
            Instructor instructor = instructorRepository.findById(instructorDetail.getId()).orElse(null);
            if (instructor == null) {
                throw new EntityNotFoundException("Instructor not found");
            }
            instructor.setFirstName(instructorDetail.getFirstName());
            instructor.setLastName(instructorDetail.getLastName());
            instructor.setIsAdmin(instructorDetail.getIsAdmin());
            instructors.add(instructor);
        }
        instructorRepository.saveAll(instructors);
        return instructorDetailDto;
    }

}

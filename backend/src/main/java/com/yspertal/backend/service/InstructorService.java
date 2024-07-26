package com.yspertal.backend.service;

import com.yspertal.backend.endpoint.dtos.InstructorCreateDto;
import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;

public interface InstructorService {
    InstructorDetailDto login(InstructorCreateDto instructorCreateDto) throws Exception;

    InstructorDetailDto getInstructorById(Integer id);
}

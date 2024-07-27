package com.yspertal.backend.service;

import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;
import com.yspertal.backend.endpoint.dtos.InstructorLoginDto;

import java.util.List;

public interface InstructorService {

    InstructorDetailDto login(InstructorLoginDto instructorLoginDto) throws Exception;

    InstructorDetailDto getInstructorById(Integer id);

    List<InstructorDetailDto> getAllInstructors() throws Exception;

    List<InstructorDetailDto> updateInstructors(List<InstructorDetailDto> instructorDetailDto);
}

package com.yspertal.backend.endpoint.endpoints;

import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;
import com.yspertal.backend.service.InstructorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/instructor")
public class InstructorEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final InstructorService instructorService;

    public InstructorEndpoint(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("{id}")
    public InstructorDetailDto getInstructorById(@PathVariable Integer id) {
        LOGGER.info("GET /instructor/{}", id);
        return this.instructorService.getInstructorById(id);
    }
}


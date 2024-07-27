package com.yspertal.backend.endpoint.endpoints;

import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;
import com.yspertal.backend.service.InstructorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.util.List;

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

    @GetMapping()
    public List<InstructorDetailDto> getAllInstructors() throws Exception {
        LOGGER.info("GET /instructor");
        return this.instructorService.getAllInstructors();
    }

    @PutMapping()
    public List<InstructorDetailDto> updateInstructors(@RequestBody List<InstructorDetailDto> instructorDetailDto) {
        LOGGER.info("PUT /instructor body: {}", instructorDetailDto);
        return this.instructorService.updateInstructors(instructorDetailDto);
    }

}


package com.yspertal.backend.endpoint.endpoints;

import com.yspertal.backend.endpoint.dtos.InstructorCreateDto;
import com.yspertal.backend.endpoint.dtos.InstructorDetailDto;
import com.yspertal.backend.service.InstructorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/login")
public class LoginEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final InstructorService instructorService;

    public LoginEndpoint(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping()
    public InstructorDetailDto login(@RequestBody InstructorCreateDto instructorCreateDto) throws Exception {
        LOGGER.info("POST /login body: {}", instructorCreateDto);
        return this.instructorService.login(instructorCreateDto);
    }
}

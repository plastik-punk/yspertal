package com.yspertal.backend.endpoint.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/hello")
public class HelloEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping()
    public String getHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        LOGGER.info("GET /hello?name={}", name);
        return String.format("Hello %s!", name);
    }
}

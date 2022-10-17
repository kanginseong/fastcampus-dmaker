package com.fastcampus.programming.dmaker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class DMakerController {

    @GetMapping("/developers")
    public List<String> ListDevelopers() {
        log.info("GET /developers HTTP/1.1");

        return Arrays.asList("A", "B", "C");
    }
}

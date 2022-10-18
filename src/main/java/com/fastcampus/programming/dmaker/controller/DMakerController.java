package com.fastcampus.programming.dmaker.controller;

import com.fastcampus.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public void register() {
        dMakerService.createDeveloper();
    }
}

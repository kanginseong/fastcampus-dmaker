package com.fastcampus.programming.dmaker.controller;

import com.fastcampus.programming.dmaker.dto.*;
import com.fastcampus.programming.dmaker.exception.DMakerException;
import com.fastcampus.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;

    @PostMapping("/developers")
    public CreateDeveloper.Response register(@Valid @RequestBody CreateDeveloper.Request request) {
        return dMakerService.createDeveloper(request);
    }

    @GetMapping("/developers")
    public List<DeveloperDto> getList() {
        return dMakerService.getAllEmployedDevelopers();
    }

    @GetMapping("/developer/{memberId}")
    public DeveloperDetailDto getDeveloper(@PathVariable String memberId) {
        return dMakerService.getDeveloper(memberId);
    }

    @PutMapping("/developer/{memberId}")
    public DeveloperDetailDto updateDeveloper(@PathVariable String memberId, @Valid @RequestBody EditDeveloper.Request request
    ) {
        return dMakerService.editDeveloper(memberId, request);
    }

    @DeleteMapping("/developer/{memberId}")
    public DeveloperDetailDto deleteDeveloper(@PathVariable String memberId) {
        return dMakerService.deleteDeveloper(memberId);
    }
}

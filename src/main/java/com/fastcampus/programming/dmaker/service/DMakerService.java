package com.fastcampus.programming.dmaker.service;

import com.fastcampus.programming.dmaker.entity.Developer;
import com.fastcampus.programming.dmaker.repository.DevelopRepository;
import com.fastcampus.programming.dmaker.type.DeveloperLever;
import com.fastcampus.programming.dmaker.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DevelopRepository developRepository;

    /*
     * ACID
     * Atomic
     * consistency
     * Isolation
     * Durability
     */
    @Transactional
    public void createDeveloper() {
        Developer developer = Developer.builder()
                .developerLever(DeveloperLever.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();

        developRepository.save(developer);
    }
}

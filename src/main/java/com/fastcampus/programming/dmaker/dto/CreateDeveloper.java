package com.fastcampus.programming.dmaker.dto;

import com.fastcampus.programming.dmaker.type.DeveloperLevel;
import com.fastcampus.programming.dmaker.type.DeveloperSkillType;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateDeveloper {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class Request {
        @NotNull
        private DeveloperLevel developerLevel;

        @NotNull
        private DeveloperSkillType developerSkillType;

        @NotNull
        @Min(0)
        private Integer experienceYears;

        @NotNull
        @Size(min = 3, max = 50, message = "invalid memberId")
        private String memberId;

        @NotNull
        @Size(min = 2, max = 50, message = "invalid name")
        private String name;

        @NotNull
        @Min(18)
        private Integer age;
    }
}

package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
public class PersonRequestDto {
    private String name;
    private String job;
    private int age;
    private String address;
}
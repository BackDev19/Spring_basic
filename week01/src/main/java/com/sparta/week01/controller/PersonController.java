package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import com.sparta.week01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person person() {
        Person person = new Person();
        person.setName("황인권");
        person.setAddress("신도림");
        person.setJob("학생");
        person.setAge("26");

        return person;
    }
}

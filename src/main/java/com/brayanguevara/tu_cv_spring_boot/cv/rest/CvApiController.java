package com.brayanguevara.tu_cv_spring_boot.cv.rest;

import com.brayanguevara.tu_cv_spring_boot.cv.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CvApiController {

    @GetMapping("/cv")
    public Person getPerson(){
        return new Person("Brayan", "Guevara", "Java Dev");
    }
}

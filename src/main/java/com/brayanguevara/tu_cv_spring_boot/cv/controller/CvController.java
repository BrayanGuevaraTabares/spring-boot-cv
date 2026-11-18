package com.brayanguevara.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CvController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }

    @GetMapping("/ruta2")
    public String ruta2(){
        return "ruta2";
    }
}

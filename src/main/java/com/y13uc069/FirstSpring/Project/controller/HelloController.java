package com.y13uc069.FirstSpring.Project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String helloWorld() {
        return "welcome to my first spring project sfgd";
    }
}

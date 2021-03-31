package com.sky.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/application")
public class ApplicationController {

    @GetMapping("/service")
    public String service(){
        return "application-1 service";
    }
}

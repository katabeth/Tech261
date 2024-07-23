package com.sparta.kch.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringWebController {

    @GetMapping
    public String welcome(){
        return "welcome";
    }





}

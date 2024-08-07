package com.sparta.kch.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class SpringWebController {

    @GetMapping
    public String welcome(Model model){
        model.addAttribute("date", LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMM")));
        model.addAttribute("time", LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        return "welcome";
    }




}

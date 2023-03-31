package com.example.PortFolio_Board_Java17.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root(){
        return "forward:/articles";
    }
}

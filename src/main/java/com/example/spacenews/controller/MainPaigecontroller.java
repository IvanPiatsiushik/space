package com.example.spacenews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPaigecontroller {

    @GetMapping("/")
    public String mainPaige(){
        return "mainPaige";
    }
}

package com.practice.systemmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SystemController {

    @GetMapping("/")
    public String displaySystemHomePage(Model model) {
        model.addAttribute("headingText", "Welcome");
        return "index";
    }


}

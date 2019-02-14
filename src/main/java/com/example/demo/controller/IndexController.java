package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "index";
    }
    @GetMapping({"/hellosec"})
    public String greeting( Model model) {
        model.addAttribute("name", "SPRING Security");
        return "hello";
    }
    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
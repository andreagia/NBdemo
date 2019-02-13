package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Ciao sei nella pagina index di NBdemo il servizio REST è su " +
                "/api/notes invia un richiesta POST su /api/notes per aggiungere un campo";
    }
}
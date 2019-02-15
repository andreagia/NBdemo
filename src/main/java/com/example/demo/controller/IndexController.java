package com.example.demo.controller;

import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    NoteRepository noteRepository;

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

    @GetMapping("/addnote")
    public String greetingForm(Model model) {
        model.addAttribute("note", new Note());
        List<Note> findallnote = noteRepository.findAll();
        model.addAttribute("listanote",findallnote);
        return "addnote";
    }

    @PostMapping("/addnote")
    public String greetingSubmit(@ModelAttribute Note note) {
        noteRepository.save(note);
        return "addnote";
    }
    @GetMapping("/listnote")
    public String listnote(Model model) {
        model.addAttribute("listanote",noteRepository.findAll());
        return "listnote";
    }


    @GetMapping("/updatenote")
    public String updatenote(Model model) {
        model.addAttribute("listanote",noteRepository.findAll());
        return "listnote";
    }

}
package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.models.User;
import com.greenfoxacademy.eventregister.repositories.EventRepository;
import com.greenfoxacademy.eventregister.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  EventRepository eventRepository;

  @Autowired
  UserRepository userRepository;

  @GetMapping("/")
  public String showMain(Model model) {
    model.addAttribute("events", eventRepository.findAll());
    return "main";
  }

  @GetMapping("/register")
  public String showRegister(Model model) {
    model.addAttribute("user", new User());
    return "register";
  }
}

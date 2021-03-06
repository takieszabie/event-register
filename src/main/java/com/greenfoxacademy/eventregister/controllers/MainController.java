package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.models.Registrants;
import com.greenfoxacademy.eventregister.services.EventServiceIpml;
import com.greenfoxacademy.eventregister.services.RegistrantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  RegistrantServiceImpl userService;

  @Autowired
  EventServiceIpml eventService;

  @GetMapping("/")
  public String showMain(Model model) {
    model.addAttribute("events", eventService.findAll());
    return "main";
  }

  @GetMapping("/register")
  public String showRegister(Model model) {
    model.addAttribute("registrants", new Registrants());
    return "register";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/register")
  public String registerNewUser(@ModelAttribute Registrants filledRegistrants) {
    userService.save(filledRegistrants);
    return "redirect:/";
  }
}

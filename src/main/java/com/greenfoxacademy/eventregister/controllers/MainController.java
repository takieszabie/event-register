package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.models.User;
import com.greenfoxacademy.eventregister.repositories.EventRepository;
import com.greenfoxacademy.eventregister.repositories.UserRepository;
import com.greenfoxacademy.eventregister.services.EventServiceIml;
import com.greenfoxacademy.eventregister.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  UserServiceImpl userService;

  @Autowired
  EventServiceIml eventService;

  @GetMapping("/")
  public String showMain(Model model) {
    model.addAttribute("events", eventService.findAll());
    return "main";
  }

  @GetMapping("/register")
  public String showRegister(Model model) {
    model.addAttribute("user", new User());
    return "register";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/register")
  public String registerNewUser(@ModelAttribute User filledUser) {
    userService.save(filledUser);
    return "redirect:/";
  }
}

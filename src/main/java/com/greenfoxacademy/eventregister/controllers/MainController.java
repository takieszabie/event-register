package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.repositories.EventRepository;
import com.greenfoxacademy.eventregister.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  EventRepository eventRepository;

  @Autowired
  UserRepository userRepository;

@GetMapping("/")
public String showMain(){
  return "main";
}
}

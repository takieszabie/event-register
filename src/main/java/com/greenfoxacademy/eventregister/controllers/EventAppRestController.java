package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.models.Registrants;
import com.greenfoxacademy.eventregister.services.RegistrantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventAppRestController {
  @Autowired
  RegistrantServiceImpl userService;

  @PostMapping("/registeradmin")
  public Registrants user(@RequestBody(required = false) Registrants registrants){
    if (registrants == null){
      return null;
    } else {
      userService.save(registrants);
      return registrants;
    }
  }
}

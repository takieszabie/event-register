package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.models.User;
import com.greenfoxacademy.eventregister.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventAppRestController {
  @Autowired
  UserServiceImpl userService;

  @PostMapping("/registeradmin")
  public User user(@RequestBody(required = false) User user ){
    if (user == null){
      return null;
    } else {
      userService.save(user);
      return user;
    }
  }
}

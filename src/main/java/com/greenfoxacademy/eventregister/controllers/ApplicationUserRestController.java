package com.greenfoxacademy.eventregister.controllers;

import com.greenfoxacademy.eventregister.models.ApplicationUser;
import com.greenfoxacademy.eventregister.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationUserRestController {

  @Autowired
  ApplicationUserRepository applicationUserRepository;

  @PostMapping("/sign_up")
  public ApplicationUser signUp(@RequestBody(required = true) ApplicationUser applicationUser){
    applicationUserRepository.save(applicationUser);
    return applicationUser;
  }

}

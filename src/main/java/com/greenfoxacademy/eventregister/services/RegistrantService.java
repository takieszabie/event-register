package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.Registrants;

public interface RegistrantService {
  void save(Registrants registrants);

  Registrants findByUserName(String userName);
}

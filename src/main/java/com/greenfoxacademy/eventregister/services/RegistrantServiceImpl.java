package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.Registrants;
import com.greenfoxacademy.eventregister.repositories.RegistrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrantServiceImpl implements RegistrantService {
  @Autowired
  RegistrantRepository registrantRepository;

  @Override
  public void save(Registrants registrants) {
    registrantRepository.save(registrants);
  }

  @Override
  public Registrants findByUserName(String userName) {
    return null;
  }
}

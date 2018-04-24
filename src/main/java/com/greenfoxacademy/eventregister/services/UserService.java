package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.User;

public interface UserService {
  void save(User user);

  User findByUserName(String userName);
}

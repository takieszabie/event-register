package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.User;
import com.greenfoxacademy.eventregister.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserRepository userRepository;

  @Override
  public void save(User user) {
    userRepository.save(user);
  }

  @Override
  public User findByUserName(String userName) {
    return null;
  }
}

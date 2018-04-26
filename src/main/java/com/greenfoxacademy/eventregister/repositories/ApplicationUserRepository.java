package com.greenfoxacademy.eventregister.repositories;

import com.greenfoxacademy.eventregister.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {
  public ApplicationUser findByUsername(String username);
}

package com.greenfoxacademy.eventregister.repositories;

import com.greenfoxacademy.eventregister.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

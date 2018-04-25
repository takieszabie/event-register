package com.greenfoxacademy.eventregister.repositories;

import com.greenfoxacademy.eventregister.models.Registrants;
import org.springframework.data.repository.CrudRepository;

public interface RegistrantRepository extends CrudRepository<Registrants, Long> {
}

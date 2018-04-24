package com.greenfoxacademy.eventregister.repositories;

import com.greenfoxacademy.eventregister.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}

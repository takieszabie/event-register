package com.greenfoxacademy.eventregister.repositories;

import com.greenfoxacademy.eventregister.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EventRepository extends CrudRepository<Event, Long> {
  List<Event> findAll();
}

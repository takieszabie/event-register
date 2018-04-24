package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.Event;
import com.greenfoxacademy.eventregister.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface EventService {

  void save(Event event);

  Event findByEventName(String eventName);
}

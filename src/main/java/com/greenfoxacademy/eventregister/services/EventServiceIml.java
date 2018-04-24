package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.Event;
import org.springframework.beans.factory.annotation.Autowired;

public class EventServiceIml implements EventService {
  @Autowired
  EventService eventService;

  @Override
  public void save(Event event) {
  }

  @Override
  public Event findByEventName(String eventName) {
    return null;
  }
}

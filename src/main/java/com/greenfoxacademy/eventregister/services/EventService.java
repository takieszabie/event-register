package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.Event;

public interface EventService {
  void save(Event event);

  Event findByEventName(String eventName);
}

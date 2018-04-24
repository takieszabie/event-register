package com.greenfoxacademy.eventregister.services;

import com.greenfoxacademy.eventregister.models.Event;
import com.greenfoxacademy.eventregister.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceIpml implements EventService {
  @Autowired
  EventRepository eventRepository;

  @Override
  public void save(Event event) {
    eventRepository.save(event);
  }

  public List<Event> findAll(){
    return eventRepository.findAll();
  }

  @Override
  public Event findByEventName(String eventName) {
    return null;
  }
}

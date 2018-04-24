package com.greenfoxacademy.eventregister;

import com.greenfoxacademy.eventregister.models.Event;
import com.greenfoxacademy.eventregister.models.User;
import com.greenfoxacademy.eventregister.repositories.EventRepository;
import com.greenfoxacademy.eventregister.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventregisterApplication implements CommandLineRunner{
  @Autowired
  EventRepository eventRepository;

  @Autowired
  UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EventregisterApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
  }
}

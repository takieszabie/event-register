package com.greenfoxacademy.eventregister.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationUser {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long userId;
  private String username;
  private String password;

  public ApplicationUser(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public ApplicationUser() {
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

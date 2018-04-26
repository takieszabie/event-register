package com.greenfoxacademy.eventregister.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "user")
public class Registrants {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String registrantName;
  private String familyName;
  private String givenName;
  private String emailAddress;
  private boolean isAdmin;

  public Registrants(String registrantName, String familyName, String givenName, String emailAddress, boolean isAdmin) {
    this.registrantName = registrantName;
    this.familyName = familyName;
    this.givenName = givenName;
    this.emailAddress = emailAddress;
    this.isAdmin = isAdmin;
  }

  public Registrants() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRegistrantName() {
    return registrantName;
  }

  public void setRegistrantName(String registrantName) {
    this.registrantName = registrantName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public boolean getIsAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }
}

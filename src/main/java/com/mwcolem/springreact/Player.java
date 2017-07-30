package com.mwcolem.springreact;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Player {
  private @Id @GeneratedValue Long id;
  private String firstName;
  private String lastName;

  public Player() {}
  public Player(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }
}

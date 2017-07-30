package com.mwcolem.springreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
  private final com.mwcolem.springreact.PlayerRepository repo;

  @Autowired
  public DatabaseLoader(PlayerRepository repo) {
    this.repo = repo;
  }

  @Override
  public void run(String... strings) throws Exception {
    this.repo.save(new Player("Test", "Player"));
  }
}

package org.springframework.demo.annotations.services;

public class SadFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Today is sad day  ";
  }
}

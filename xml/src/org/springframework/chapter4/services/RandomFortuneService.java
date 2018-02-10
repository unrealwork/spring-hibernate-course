package org.springframework.chapter4.services;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

  private static final String[] FORTUNES = new String[]{"You are rockstar!", "Never give up",
      "You can do it"};

  private Random random = new Random();

  @Override
  public String getFortune() {
    return FORTUNES[random.nextInt(FORTUNES.length)];
  }
}

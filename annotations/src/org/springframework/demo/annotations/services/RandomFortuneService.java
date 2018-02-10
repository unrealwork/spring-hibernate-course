package org.springframework.demo.annotations.services;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

  private static final String[] FORTUNES = new String[]{"You are rockstar!", "Never give up",
      "You can do it"};

  private Random random = new Random();

  @Override
  public String getFortune() {
    return FORTUNES[random.nextInt(FORTUNES.length)];
  }
}

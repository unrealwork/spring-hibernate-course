package org.springframework.chapter4.models.coach;

import org.springframework.chapter4.services.FortuneService;

public class BaseballCoach implements Coach {

  private FortuneService fortuneService;

  public BaseballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Spending 30 minutes on batting practice";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}

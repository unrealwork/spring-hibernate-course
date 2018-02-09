package org.springframework.chapter4;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  CricketCoach() {
    System.out.println("Cricket coach: Inside no-arg constructor");
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("Cricket coach: inside setter method");
    this.fortuneService = fortuneService;
  }
}

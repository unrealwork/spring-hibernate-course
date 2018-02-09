package org.springframework.chapter4.models.coach;

import org.springframework.chapter4.services.FortuneService;

public class TrackCoach implements Coach {

  private FortuneService fortuneService;

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {
    return "Just do it: " + fortuneService.getFortune();
  }

  // add init method
  public void doMyStartupStuff() {
    System.out.println("Track Coach: inside method doMyStartupStuff");
  }

  // add init method
  public void doMyCleanStuff() {
    System.out.println("Track Coach: inside method doMyCleanStuff");
  }
}

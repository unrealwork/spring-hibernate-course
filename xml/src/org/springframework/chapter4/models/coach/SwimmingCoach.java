package org.springframework.chapter4.models.coach;

public class SwimmingCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Swim 2km";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}

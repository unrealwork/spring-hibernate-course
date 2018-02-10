package org.springframework.chapter4.models.coach;


import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return null;
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}

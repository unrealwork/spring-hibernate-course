package org.springframework.chapter4;

public class BaseballCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Spending 30 minutes on batting practice";
  }
}

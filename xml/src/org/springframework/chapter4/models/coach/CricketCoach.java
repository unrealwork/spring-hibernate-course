package org.springframework.chapter4.models.coach;

import org.springframework.chapter4.services.FortuneService;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  //add new fields (team, email)
  private String emailAddress;
  private String team;

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
    System.out.println("Cricket coach: inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    System.out.println("Cricket coach: inside setter method - setTeam");
    this.team = team;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    System.out.println("Cricket coach: inside setter method - setEmailAddress");
    this.emailAddress = emailAddress;
  }
}

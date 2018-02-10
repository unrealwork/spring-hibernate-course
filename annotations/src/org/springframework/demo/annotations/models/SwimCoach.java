package org.springframework.demo.annotations.models;

import org.springframework.demo.annotations.services.FortuneService;

public class SwimCoach implements Coach {

  private FortuneService service;

  public SwimCoach(FortuneService service) {
    this.service = service;
  }


  @Override
  public String getDailyWorkout() {
    return "Swim 1000m";
  }

  @Override
  public String getDailyFortune() {
    return service.getFortune();
  }
}

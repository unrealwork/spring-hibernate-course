package org.springframework.demo.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  private FortuneService service;

  public TennisCoach() {
    System.out.println("Tennis coach: default constructor");
  }

  /*@Autowired
  public TennisCoach(FortuneService service) {
    this.service = service;
  }*/


  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return service.getFortune();
  }


  /*@Autowired
  public void setService(FortuneService service) {
    System.out.println("Tennis coach: set up fortune service");
    this.service = service;
  }*/

  @Autowired
  public void doSomeCrazyStuff(FortuneService service) {
    System.out.println("Tennis coach: set up fortune service");
    this.service = service;
  }
}

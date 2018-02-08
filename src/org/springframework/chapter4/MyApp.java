package org.springframework.chapter4;

public class MyApp {

  public static void main(String[] args) {
    //create object
    Coach coach = new BaseballCoach();
    //use object
    System.out.println(coach.getDailyWorkout());
  }
}

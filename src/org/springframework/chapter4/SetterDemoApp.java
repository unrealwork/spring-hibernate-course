package org.springframework.chapter4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {
    // load context
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    // retrieve coach
    CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

    // some methods
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());

    // close context
    context.close();
  }
}

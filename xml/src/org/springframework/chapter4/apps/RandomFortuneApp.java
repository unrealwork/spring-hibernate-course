package org.springframework.chapter4.apps;

import org.springframework.chapter4.models.coach.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    Coach coach = context.getBean("trackCoach", Coach.class);
    System.out.println(coach.getDailyFortune());
  }
}

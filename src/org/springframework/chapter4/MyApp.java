package org.springframework.chapter4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    // load the spring configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    //retrieve bean
    Coach coach = context.getBean("myCoach", Coach.class);
    //call methods of the bean
    System.out.println(coach.getDailyWorkout());
    // close the context
    context.close();
  }
}

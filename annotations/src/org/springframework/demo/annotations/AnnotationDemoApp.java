package org.springframework.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.annotations.models.Coach;

public class AnnotationDemoApp {

  public static void main(String[] args) {

    //Create context
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "annotations-app-context.xml");
    Coach coach = context.getBean("tennisCoach", Coach.class);

    // call methods
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());

    //close context
    context.close();
  }
}

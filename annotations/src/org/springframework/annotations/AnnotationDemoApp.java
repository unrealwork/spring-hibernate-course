package org.springframework.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Coach coach = context.getBean("tennisCoach", Coach.class);
    System.out.println(coach.getDailyWorkout());
    context.close();
  }
}

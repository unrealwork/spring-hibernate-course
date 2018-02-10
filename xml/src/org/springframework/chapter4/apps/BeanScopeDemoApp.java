package org.springframework.chapter4.apps;

import org.springframework.chapter4.models.coach.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
    Coach coach = context.getBean("myCoach", Coach.class);

    Coach alphaCoach = context.getBean("myCoach", Coach.class);

    boolean result = coach == alphaCoach;
    System.out.println("The same 4objects: " + result);
    System.out.println("Memory location for coach: " + coach);
    System.out.println("Memory location for alphaCoach: " + alphaCoach);
  }
}

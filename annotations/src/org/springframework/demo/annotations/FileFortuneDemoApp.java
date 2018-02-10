package org.springframework.demo.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.annotations.models.Coach;

public class FileFortuneDemoApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("annotations-app-context.xml");
    Coach coach = context.getBean("tennisCoach", Coach.class);

  }
}

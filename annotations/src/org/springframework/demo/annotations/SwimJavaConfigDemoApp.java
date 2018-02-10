package org.springframework.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.annotations.config.SportConfig;
import org.springframework.demo.annotations.models.Coach;

public class SwimJavaConfigDemoApp {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SportConfig.class);

    Coach swimCoach = context.getBean("swimCoach", Coach.class);

    System.out.println(swimCoach.getDailyFortune());

    context.close();
  }

}

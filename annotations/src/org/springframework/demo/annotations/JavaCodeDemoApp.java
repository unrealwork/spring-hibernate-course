package org.springframework.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.annotations.config.SportConfig;

public class JavaCodeDemoApp {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SportConfig.class);
    context.close();
  }
}

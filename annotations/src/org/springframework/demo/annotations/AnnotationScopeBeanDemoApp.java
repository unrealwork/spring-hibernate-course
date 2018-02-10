package org.springframework.demo.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.annotations.models.Coach;

public class AnnotationScopeBeanDemoApp {

  public static void main(String[] args) {
    //load spting config file
    ClassPathXmlApplicationContext context
        = new ClassPathXmlApplicationContext("annotations-app-context.xml");
    //retrieve bean from spring
    Coach coach = context.getBean("tennisCoach", Coach.class);

    Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

    // check references

    boolean result = coach == alphaCoach;

    // print result
    System.out.println("The same 4objects: " + result);
    System.out.println("Memory location for coach: " + coach);
    System.out.println("Memory location for alphaCoach: " + alphaCoach);

    //close context
    context.close();
  }
}

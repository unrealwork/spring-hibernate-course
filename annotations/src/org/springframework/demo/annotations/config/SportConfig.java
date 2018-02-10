package org.springframework.demo.annotations.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.demo.annotations.models.Coach;
import org.springframework.demo.annotations.models.SwimCoach;
import org.springframework.demo.annotations.services.FortuneService;
import org.springframework.demo.annotations.services.SadFortuneService;

@Configuration
@ComponentScan("org.springframework.demo.annotations")
@PropertySource("classpath:settings.properties")
public class SportConfig {

  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  @Bean
  public Coach swimCoach() {
    return new SwimCoach(sadFortuneService());
  }
}

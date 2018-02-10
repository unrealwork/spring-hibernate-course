package org.springframework.demo.annotations.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileRandomFortuneService implements FortuneService {

  private String[] data;
  private Random random = new Random();

  @Value("${fortune.source}")
  private String fileName;

  public FileRandomFortuneService() {
    System.out.println("file");
  }

  @Override
  public String getFortune() {
    return data[random.nextInt(data.length)];
  }

  @PostConstruct
  private void init() {
    loadData(FileSystems.getDefault().getPath(fileName));
  }

  private void loadData(Path path) {
    try (BufferedReader reader = Files.newBufferedReader(path)) {
      this.data = reader.lines().toArray(String[]::new);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }

  }
}

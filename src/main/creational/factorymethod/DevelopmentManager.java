package main.creational.factorymethod;

public class DevelopmentManager extends HiringManager {
  protected Interviewer makeInterviewer() {
    return new Developer();
  }
}

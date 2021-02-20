package main.creational.factorymethod;

public class MarketingManager extends HiringManager {
  protected Interviewer makeInterviewer() {
    return new CommunityExecutive();
  }
}

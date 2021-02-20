package test.creational;

import main.creational.factorymethod.HiringManager;
import main.creational.factorymethod.MarketingManager;
import main.creational.factorymethod.DevelopmentManager;

public class FactoryMethod {
  public static void main(String[] args) {
    HiringManager devManager = new DevelopmentManager();
    devManager.takeInterview();

    HiringManager mktManager = new MarketingManager();
    mktManager.takeInterview();
  }
}

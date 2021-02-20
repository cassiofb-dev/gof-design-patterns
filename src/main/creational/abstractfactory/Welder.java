package main.creational.abstractfactory;

public class Welder implements DoorFittingExpert {
  public void getDescription() {
    System.out.println("I can only fix iron doors!");
  }
}

package main.creational.abstractfactory;

public class Carpenter implements DoorFittingExpert {
  public void getDescription() {
    System.out.println("I can only fix wooden doors!");
  }
}

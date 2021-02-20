package test.creational;

import main.creational.simplefactory.Door;
import main.creational.simplefactory.DoorFactory;

public class SimpleFactory {
  public static void main(String[] args) {
    Door door = DoorFactory.makeDoor(123, 321);
    System.out.println(door.getWidth());
  }
}

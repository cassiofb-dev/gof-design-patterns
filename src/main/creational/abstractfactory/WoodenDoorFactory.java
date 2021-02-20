package main.creational.abstractfactory;

public class WoodenDoorFactory implements DoorFactory {
  public Door makeDoor() {
    return new WoodenDoor();
  }

  public DoorFittingExpert makeDoorFittingExpert() {
    return new Carpenter();
  }
}

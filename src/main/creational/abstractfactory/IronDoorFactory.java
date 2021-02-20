package main.creational.abstractfactory;

public class IronDoorFactory implements DoorFactory {
  public Door makeDoor() {
    return new IronDoor();
  }

  public DoorFittingExpert makeDoorFittingExpert() {
    return new Welder();
  }
}

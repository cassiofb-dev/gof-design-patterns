package test.creational;

import main.creational.abstractfactory.Door;
import main.creational.abstractfactory.DoorFactory;
import main.creational.abstractfactory.DoorFittingExpert;
import main.creational.abstractfactory.IronDoorFactory;
import main.creational.abstractfactory.WoodenDoorFactory;

public class AbstractFactory {
  public static void main(String[] args) {
    DoorFactory doorFactory;
    DoorFittingExpert expert;
    Door door;

    doorFactory = new WoodenDoorFactory();
    door        = doorFactory.makeDoor();
    expert      = doorFactory.makeDoorFittingExpert();

    door.getDescription();
    expert.getDescription();

    doorFactory = new IronDoorFactory();
    door        = doorFactory.makeDoor();
    expert      = doorFactory.makeDoorFittingExpert();

    door.getDescription();
    expert.getDescription();
  }
}

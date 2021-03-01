package test.structural;

import main.structural.facade.Computer;
import main.structural.facade.ComputerFacade;

public class Facade {
  public static void main(String[] args) {
    ComputerFacade computer = new ComputerFacade(new Computer());

    computer.turnOn();
    computer.turnOff();
  }
}

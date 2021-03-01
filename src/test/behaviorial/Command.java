package test.behaviorial;

import main.behaviorial.command.Bulb;
import main.behaviorial.command.Invoker;
import main.behaviorial.command.TurnOff;
import main.behaviorial.command.TurnOn;

public class Command {
  public static void main(String[] args) {
    Bulb bulb = new Bulb();

    TurnOn turnOn   = new TurnOn(bulb);
    TurnOff turnOff = new TurnOff(bulb);

    Invoker invoker = new Invoker();

    invoker.submit(turnOn);
    invoker.submit(turnOff);
  }
}

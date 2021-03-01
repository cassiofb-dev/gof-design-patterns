package main.behaviorial.command;

public class Invoker {
  public void submit(Command command) {
    command.execute();
  }
}

package main.structural.facade;

public class ComputerFacade {
  protected Computer computer;

  public ComputerFacade(Computer computer) {
    this.computer = computer;
  }

  public void turnOn() {
    this.computer.getEletricShock();
    this.computer.makeSound();
    this.computer.showLoadingScreen();
    this.computer.bam();
  }

  public void turnOff() {
    this.computer.closeEverything();
    this.computer.pullCurrent();
    this.computer.sooth();
  }
}
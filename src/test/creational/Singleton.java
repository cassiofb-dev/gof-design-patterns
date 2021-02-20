package test.creational;

import main.creational.singleton.President;

public class Singleton {
  public static void main(String[] args) {
    President lula = President.getInstance();
    President bolsonaro = President.getInstance();

    System.out.println(lula == bolsonaro);
  }
}

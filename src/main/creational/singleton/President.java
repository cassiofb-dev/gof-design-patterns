package main.creational.singleton;

public final class President {
  private static President instance;

  private President() {}

  public static President getInstance() {
    if(instance == null) return instance;
    return new President();
  }
}

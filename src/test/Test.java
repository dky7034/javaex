package test;

public interface Test {
  public String name = "자동차";

  public abstract void start();

  void break() {}

  default int stop() {
    return 0;
  }
}

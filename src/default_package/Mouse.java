package default_package;

class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Mouse{" +
        "name='" + name + '\'' +
        '}';
  }
}

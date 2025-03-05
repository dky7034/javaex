package default_package;

class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Keyboard{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

}

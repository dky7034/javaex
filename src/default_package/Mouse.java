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

  @Override
  public boolean equals(Object o) {
    if (o instanceof Mouse) {
      Mouse m = Mouse(o);
    }
    return false;
  }

//  @Override
//  public int hashCode() {
//    return Objects.hashCode(name);
//  }
}

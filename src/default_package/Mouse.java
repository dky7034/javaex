package default_package;

import java.util.Objects;

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
    if (o == null || getClass() != o.getClass()) return false;
    Mouse mouse = (Mouse) o;
    return Objects.equals(name, mouse.name);
  }

//  @Override
//  public int hashCode() {
//    return Objects.hashCode(name);
//  }
}

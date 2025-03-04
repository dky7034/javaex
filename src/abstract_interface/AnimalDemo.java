package abstract_interface;

public class AnimalDemo {
  public static void main(String[] args) {
    Animal[] animals = {
        new Dog(),
        new Cuckoo()
    };

    for (Animal animal : animals) {
      animal.sound();
    }
  }
}

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

    makeSound(); // 강아지가 소리를 낸다.
    makeSoune(); // 뻐꾸기가 소리를 낸다.
  }
}

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

    makeSound(new Dog()); // 강아지가 소리를 낸다.
    makeSoune(new Cuckoo()); // 뻐꾸기가 소리를 낸다.
  }
  
  static void makeSound(Animal animal) {


  }
}

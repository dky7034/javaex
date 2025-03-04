package abstract_interface;

public class MyInterfaceDemo extends MyClass {
  public static void main(String[] args) {
    MyClass m = new MyClass();
    System.out.println(m.myClassInt);
    System.out.println(m.yourClassInt);
    m.sayHello();
    m.sayHello2();
    System.out.println(MyInterface.max);
  }

}

package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    list.removeIf(j -> j % 2 == 0);
    list.forEach(i -> System.out.print(i));
    System.out.println();
    list.forEach(System.out::println);

    System.out.println();
    list.replaceAll(i -> i * 10);
    list.forEach(i -> System.out.print(i + " : "));

    System.out.println();
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "사과");
    map.put(2, "딸기");
    map.forEach((k, v) -> System.out.println(k + ", " + v));

    Function<String, Integer> f = (s -> Integer.parseInt(s));
    f = Integer::parseInt; // static method 참조

    // 인스턴스 메서드 참조
    BiFunction<String, String, Boolean> f1 = (str1, str2) -> str1.equals(str2);
    f1 = String::equals;

    // 특정 객체의 인스턴스 메서드 참조
    MyClass myClass = new MyClass();
    Function<String, Boolean> f2 = x -> myClass.equals(x);
    f2 = myClass::equals;

    // new 연산자(생성자) 참조
    Supplier<MyClass> s = new MyClass();
  }
}

class MyClass {

}
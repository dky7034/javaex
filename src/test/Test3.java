package test;

import java.util.stream.Stream;

public class Test3 {
  public static void main(String[] args) {
    Stream.of("갈매기", "나비", "다람쥐", "라마")
        .filter(s -> s.length() == 2)
        .forEach(System.out::println);
  }
}

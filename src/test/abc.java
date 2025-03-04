package test;

public class abc implements C {
}

interface A {
  int value = 10;
}

interface B {
  int value = 20;
}

interface C extends A, B {}

package string;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "Hi, Java !";
    String s2 = "Hi, Java !";
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);

    String s3 = new String("Hi, Java !");
    String s4 = new String("Hi, Java !");
    System.out.println("s3 == s4: " + (s3 == s4));
    System.out.println("s3 = " + s3);
    System.out.println("s4 = " + s4);

    s1 = s3;
    System.out.println("s1 == s3: " + (s1 == s3));
    System.out.println("s1 == s4: " + (s1 == s4));
    System.out.println(s1.equals(s4));

    String a = "apple";
    String b = "banana";

    System.out.println(a.compareTo(b));
  }
}

package string;

public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = new String("hi,");
    String s2 = new String(" java");

    // 3.14를 문자열로 변환하기
    String str = "" + 3.14;
    String str1 = String.valueOf(3.14);
    System.out.println("str = " + str);
    System.out.println("str1 = " + str1);
    String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
    System.out.println("fruits = " + fruits);
    String str3 = String.format("%s %d", "jdk", 14);
    System.out.println("str3 = " + str3);

    // 텍스트 블록 """ ~ """
    String strBlock = """
        <html>
          <body>
            <p>hello, world</p>
          </body>
        <html>
        """;
    System.out.println("strBlock = \n" + strBlock);

  }
}
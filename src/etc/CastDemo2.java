package etc;

public class CastDemo2 {
  public static void main(String[] args) {
    String strInt = "20";
    int i = Integer.parseInt(strInt);
    System.out.println("i = " + i);

    String strDouble = "20.001";
    double d = Double.parseDouble(strDouble);
    System.out.println("d = " + d);
    System.out.println();

    String strFloat = "3.14";
    float f = Float.parseFloat(strFloat);
    System.out.println("f = " + f);
  }
}

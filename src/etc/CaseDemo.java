package etc;

public class CaseDemo {
  public static void main(String[] args) {
    int number = 1;

    switch (number) {
      case 1:
        System.out.print("*");
        break;
      case 2:
        System.out.print("/**");
        break;
      case 3:
        System.out.print("/***");
        break;
      default:
        System.out.println("default");
    }
  }
}

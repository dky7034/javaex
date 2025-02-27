package enumType;

public class PeopleDemo {
  public static void main(String[] args) {
    System.out.println(People.FEMALE);
    System.out.println(People.MALE);
    System.out.println(People.ONE);
    System.out.println(People.TWO);

    if (People.FEMALE == People.ONE) {
      System.out.println("여성입니다.");
    }
  }
}

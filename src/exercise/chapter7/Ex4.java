package exercise.chapter7;

public class Ex4 {
  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }

  private static void speak(Korean korean) {

  }

}

class Korean implements Talkable {


}

class American implements Talkable {

}

interface Talkable {
  void talk();
}

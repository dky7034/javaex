package default_package;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime());
    System.out.println(cal.getTimeZone());
  }
}

package default_package;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.getTime());
    System.out.println(cal.getTimeZone());
    System.out.println(cal.getCalendarType());
    int day = cal.get(Calendar.DATE);
    System.out.println("day = " + day);
    int month = cal.get(Calendar.MONTH);
    System.out.println("month = " + month);
  }
}

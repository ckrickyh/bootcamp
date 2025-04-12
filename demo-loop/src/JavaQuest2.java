import java.util.Scanner;

public class JavaQuest2 {
  /**
   * Expected Output:
   * 
   * Example 1: 
   * Input a month number: 2 
   * Input a year: 2016
   * 
   * !February 2016 has 29 days
   * 
   * Example 2: 
   * Input a month number: 12 
   * Input a year: 2014
   * 
   * !December 2014 has 31 days
   * 
   * Example 3: 
   * Input a month number: 2 
   * Input a year: 2100
   * 
   * !February 2100 has 28 days
   * 
   * Example 4: 
   * Input a month number: 2 
   * Input a year: 2000
   * 
   * !February 2000 has 29 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner scanner = new Scanner(System.in);
    int number_Of_DaysInMonth = 0;
    boolean leapYr = false;

    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = scanner.nextInt(); // assume 1 - 12

    System.out.print("Input a year: ");
    int year = scanner.nextInt(); // > 0

    if (month % 2 == 0) {
      number_Of_DaysInMonth = 31; 
    } else {
      number_Of_DaysInMonth = 30;
    }
    if (month == 8) {
      number_Of_DaysInMonth = 31;
    }

    switch (month) {
      // code here ...
      case 1:;
        monthOfName = "Jan";
        break;

      case 2:
        if (year % 400 == 0) {
          leapYr = true;
        }
        if (year % 100 != 0) {
          leapYr = false; 
        }
        if (year % 4 == 0) {
          leapYr = true; 
        }
        if (leapYr == true) {
          number_Of_DaysInMonth = 29;
        } else {
          number_Of_DaysInMonth = 28;
        }
        monthOfName = "Feb";
        break;
        
      case 3:
        monthOfName = "Mar";
        break;

      case 4:
        monthOfName = "Apr";
        break;
        
      case 5:
        monthOfName = "May";
        break;

      case 6:
        monthOfName = "Jun";
        break;

      case 7:
        monthOfName = "Jul";
        break;
        
      case 8:
        monthOfName = "Aug";
        break;

      case 9:
        monthOfName = "Sep";
        break;

      case 10:
        monthOfName = "Oct";
        break;

      case 11:
        monthOfName = "Nov";
        break;

      case 12:
        monthOfName = "Dec";
        break;

      default:
    }
    // Leap Year: The February has 29 days:
    // 1. Every 4 years (the year is divided by 4)
    // 2. But if the year is divded by 100 and NOT divided by 400 -> Not a leap year.
    // 3. if the year is divided by 400, it is a leap year.
    scanner.close();
    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }

}
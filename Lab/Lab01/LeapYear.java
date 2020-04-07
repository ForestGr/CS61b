import java.util.Scanner;

public class LeapYear {
  /**
   *  Check whether a year is a leap year.
   */
  public static boolean isLeapYear(int year) {
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   *  Calls isLeapYear to print correct statement.
   */
  private static void printLeapYear(int year) {
    if (isLeapYear(year)) {
      System.out.printf("%d is a leap year.\n", year);
    } else {
      System.out.printf("%d is not a leap year.\n", year);
    }
  }

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter a year: ");
    int year = console.nextInt();
    if (year < 1) {
      System.out.printf("%s is not a valid year.\n", year);
    } else {
      printLeapYear(year);
    }
  }
}

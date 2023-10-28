import java.util.Scanner;

public class leapyearchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Date (mm/dd/yyyy): ");
        String date = scanner.nextLine();

        // Extract the year from the date
        String[] dateParts = date.split("/");
        int year = Integer.parseInt(dateParts[2]);

        if (isLeapYear(year)) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }

        scanner.close();
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
import java.util.Scanner;

public class CalendarProgram {

    // Month names
    private static final String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in each month
    private static final int[] days = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Day of week using Gregorian algorithm
    public static int dayOfWeek(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + 31 * m0 / 12) % 7;
    }

    public static void printCalendar(int month, int year) {
        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int daysInMonth = days[month];
        if (month == 2 && isLeapYear(year)) daysInMonth = 29;

        int startDay = dayOfWeek(1, month, year);

        // Print spaces before first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}

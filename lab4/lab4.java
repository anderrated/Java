package lab4;
import java.util.Scanner;
import java.time.Month;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class lab4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month;
    int year;
    Month selectedMonth;
    while (true) {
        System.out.println("Enter month: ");
        month = input.nextInt();
        if (month > 0 && month < 13) {
            selectedMonth = Month.of(month);
            break;
        }
        else {
            System.out.println("Invalid input. Please enter a valid month (1-12).");
        }
    }
    while (true) {
        System.out.println("Enter year: ");
        year = input.nextInt();
        if (year > 0 && year < 10000) {
            break;
        }
        else {
            System.out.println("Invalid input. Please enter a valid year (1-).");
        }
    }

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MONTH, month-1);
    calendar.set(Calendar.YEAR, year);
    
    System.out.println(selectedMonth + ", " + year);

    YearMonth yearMonth = YearMonth.of(year, month);
    int daysInMonth = yearMonth.lengthOfMonth();

    // Print the Calendar
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    for (int i = 0; i < (calendar.get(Calendar.DAY_OF_WEEK) + 1) % 7; i++) {
        System.out.print("    ");
    }
    for (int i = 1; i <= daysInMonth; i++) {
        System.out.printf("%3d ", i);
        if((i + calendar.get(Calendar.DAY_OF_WEEK) + 1) % 7 == 0) {
            System.out.println();
        }
    }
    }
    
}
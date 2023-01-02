package date_time;

import utilities.ScannerHelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {

       // Ask user to enter their age and find their Year of Birth
        int age = ScannerHelper.getAnAge();
        System.out.println(LocalDate.now().getYear() - age);
        System.out.println(LocalDate.now().minusYears(age).getYear());
        System.out.println(LocalDate.now().minus(age, ChronoUnit.YEARS).getYear());

        // Ask user to enter their year off birth . Calculate the age\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year of birth");
        int yob = scanner.nextInt();
        System.out.println(LocalDate.now().getYear() - yob);
    }
}

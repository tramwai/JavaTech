package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DurationAndPeriod {
    public static void main(String[] args) {
        /*
        how many days passed since you were born
         */

     LocalDate today = LocalDate.now();
     LocalDate dateOfBirth = LocalDate.of(1997, Month.JUNE, 23);
        System.out.println(today);
        System.out.println(dateOfBirth);
        // Using ChronoUnit
        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today));


        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 45);
        System.out.println(Duration.between(localTime1, localTime2).getSeconds());
        // ChronoUnit
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));

    }
}

package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("\n=============Date Class==============\n");
        Date date = new Date();
        System.out.println(date);

        System.out.println("\n=============Local Date Class==============\n");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plusDays(7));
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());

        System.out.println("\n=============Local Time Class==============\n");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));

        System.out.println("\n=============Local Date Time Class==============\n");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}

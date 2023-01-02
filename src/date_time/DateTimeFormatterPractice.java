package date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("E HH:mm ")));


    }
}

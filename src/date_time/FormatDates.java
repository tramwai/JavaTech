package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {
        System.out.println("=========Formatting Date===========");


        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(new Date()));

        // Print the date in the format of yyyy 2022
        System.out.println(new SimpleDateFormat("yyyy").format(new Date()));
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(new Date()));


    }
}

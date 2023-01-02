package enum_practices;

import java.time.Month;

public class TestCustomEnums {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        Days[] days = Days.values();
        for (Days d: days) {
            System.out.println(d);
        }

        // print all the months from Month enum
        System.out.println(Month.JANUARY);
        for (Month m:Month.values()) {
            System.out.println(m);
        }

    }
}

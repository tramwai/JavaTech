package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TestPermission {
    public static void main(String[] args) {

        int age = ScannerHelper.getAnAge();
        try {
            if (Permission.isAgeValid(age)) System.out.println("You can get DL");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("You are " + age + ".");
        }

        /**
    Write a program to ask user to enter the day
    Let user know the check in hours
    In case of any error, catch it and print the error
    Finally, print the current date - day
    */
        try {
            System.out.println(Permission.getCheckInHours(ScannerHelper.getAnumber()));
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
            System.out.println("Current day = " + dateFormat.format(date));

        }

    }
}

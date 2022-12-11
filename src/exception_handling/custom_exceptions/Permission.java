package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

public class Permission {


    /**
   Create a method that checks the age of user, takes an argument int age
   if age is more than 16, "it is allowed to have driver licence"
   if the age is less than 16, the method will throw an exception
   "Age of {age} is not allowed to have driver licence"
*/
    public static boolean isAgeValid(int age) {
        if (age >= 16)  return true;
        throw new IllegalStateException("Age of " + age + " is restricted");
    }

    /**
     Create a method that takes an int as an argument to state the day in the week
    1 - Sunday
    2 - Monday
    7 - Saturday
    method name = checkIn()
    if it is weekday user is allowed to check in from 10 AM to 5 PM
    if it is weekend user is allowed to check in 10 AM to 3 PM
    if the input is not in the range of 1-7, then throw an exception with message
    "The input does not represent any day!!!"
     */

    public static String getCheckInHours(int day) {
        if (day == 1 || day == 7) System.out.println("user is allowed to check in from 10 AM to 5 PM");
        else if (day < 1 || day > 7) throw new RuntimeException("The input does not represent any day!!!");
        else System.out.println("user is allowed to check in from 10 AM to 5 PM ");
        return null;
    }



}
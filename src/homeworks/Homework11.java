package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework11 {

    // Task 1
    /**
    Requirement:
-Create a method called noSpace()
-This method will take one String argument and it will return a new String with all spaces removed from
the original String
Test Data 1: “”
Expected Result 1: “”
Test Data 2: “Java”
Expected Result 2: “Java”
Test Data 3: “    Hello    ”
Expected Result 3: “Hello”
Test Data 4: “ Hello World   ”
Expected Result 4: “HelloWorld”
Test Data 5: “Tech Global”
Expected Result 5: “TechGlobal”
     */
    public static String noSpace(String str){
        return str.replaceAll(" ", "");
    }

    // Task 2
    /**
    Requirement:
    -Create a method called replaceFirstLast()
    -This method will take one String argument and it will return a new String with first and last characters replaced
    NOTE: if the length is less than 2, then return empty String
    NOTE: Ignore all before and after spaces (get actual String only)
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “A”
    Expected Result 2: “”
    Test Data 3: “    A       ”
    Expected Result 3: “”
    Test Data 4: “Hello”
    Expected Result 4: “oellH”
    Test Data 5: “Tech Global”
    Expected Result 5: “lech GlobaT”
     */
    public static String replaceFirstLast(String str) {
        if (str.trim().length() < 2) return "\"\"";
        else {
            //return str.trim().substring(1) + str.substring(0, 1);
            String first = str.trim().charAt(0) + "";
            String middle = str.trim().substring(1, str.length() - 1);
            String last = str.trim().substring(str.length() - 1);
            return last + middle + first;
        }
    }

    // Task 3
    /**
     Requirement:
     -Create a method called hasVowel()
     -This method will take one String argument and it will return a boolean checking if String has any
     vowel or not
     NOTE: Vowels are = a, e, o, u, I
     NOTE: Ignore cases
     Test Data 1: “”
     Expected Result 1: false
     Test Data 2: “Java”
     Expected Result 2: true
     Test Data 3: “1234”
     Expected Result 3: false
     Test Data 4: “ABC”
     Expected Result 4: true
     */
    public static boolean hasVowel(String str){
        boolean isVowel = false;
        String regex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()) {
            isVowel = true;
        }
        return isVowel;
    // alternative solution
//        boolean isVowel = false;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
//                    str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
//                isVowel = true;
//            }
//        }
//        return isVowel;
    }

    // Task 4
    /**
    Requirement:
    -Create a method called checkAge()
    -This method will take an int yearOfBirth as  argument and it will print message below based on the entry
    If the age is less than 16, then print “AGE IS NOT ALLOWED”
    If the age is 16 or more, then print “AGE IS ALLOWED”
    If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
    NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.
    Test Data 1: 2010
    Expected Result 1: AGE IS NOT ALLOWED
    Test Data 2: 2006
    Expected Result 2: AGE IS ALLOWED
    Test Data 3: 2050
    Expected Result 3: AGE IS NOT VALID
    Test Data 4: 1920
    Expected Result 4: AGE IS NOT VALID
    Test Data 5: 1800
    Expected Result 5: AGE IS NOT VALID
     */

    // This was solved using google
    public static void checkAge(int yearOfBirth){
        // Get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // Calculate the age based on the year of birth
        int age = currentYear - yearOfBirth;
        System.out.println(age);
        // Check the age and print the appropriate message
        if (age < 0 || age > 100) {
            System.out.println("AGE IS NOT VALID");
        } else if (age < 16) {
            System.out.println("AGE IS NOT ALLOWED");
        } else {
            System.out.println("AGE IS ALLOWED");
        }
//        Alternative
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
//        int age = (Integer.parseInt(dateFormat.format(date)) - yearOfBirth );
//        System.out.println(age);
//
//        if (age > 100|| age < 0) System.out.println("AGE IS NOT VALID");
//        else if (age < 16) System.out.println("AGE IS NOT ALLOWED");
//        else  System.out.println("AGE IS ALLOWED");
    }

    // Task 5
    /**
    Requirement:
    -Create a method called averageOfEdges()
    -This method will take three int arguments and it will return average of min and max numbers
    Test Data 1: 0, 0 ,0
    Expected Result 1: 0
    Test Data 2: 0, 0, 6
    Expected Result 2: 3
    Test Data 3: -2, -2, 10
    Expected Result 3: 4
    Test Data 4: -3, 15, -3
    Expected Result 4: 6
    Test Data 4: 10, 13, 20
    Expected Result 4: 15
     */

    public static int averageOfEdges(int a, int b, int c){
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return (min + max) / 2;
    }

    // Task 6
    /**
    Requirement:
    -Create a method called noA()
    -This method will take a String array argument and it will return a new array with all elements
     starting with A or a replaced with “###”
    NOTE: Assume length will always be more than zero
    NOTE: Ignore cases
    Test Data 1: [“java”, “hello”, “123”, “xyz”]
    Expected Result 1: [“java”, “hello”, “123”, “xyz”]
    Test Data 2: [“appium”, “123”, “ABC”, “java”]
    Expected Result 2: [“###”, “123”, “###”, “java”]
    Test Data 3: [“apple”, “appium”, “ABC”, “Alex”, “A”]
    Expected Result 3: [“###”, “###”, “###”, “###”, “###”
     */

    public static String[] noA(String[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().startsWith("a")) array[i] = "###";
        }
        return array;
    }

    // Task 7
    /**
    Requirement:
    -Create a method called no3or5()
    -This method will take an int array argument and it will return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with 101
    NOTE: Assume length will always be more than zero
    Test Data 1: [7, 4, 11, 23, 17]
    Expected Result 1: [7, 4, 11, 23, 17]
    Test Data 2: [3, 4, 5, 6]
    Expected Result 2: [100, 4, 99, 100]
    Test Data 3: [10, 11, 12, 13, 14, 15]
    Expected Result 3:  [99, 11, 100, 13, 14, 101]
     */

    public static int[] no3or5(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 15 == 0) array[i] = 101;
            else if(array[i] % 3 == 0) array[i] = 100;
            else if(array[i] % 5 == 0) array[i] = 99;
        }
        return array;
    }

    // Task 8
    /**
    Requirement:
    -Create a method called countPrimes()
    -This method will take an int array argument and it will return how many elements in the array are prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2
    Test Data 1: [-10, -3, 0, 1]
    Expected Result 1: 0
    Test Data 2: [7, 4, 11, 23, 17]
    Expected Result 2: 4
    Test Data 3: [41, 53, 19, 47, 67]
    Expected Result 3:  5
     */

    public static int countPrimes(int[] arr){
        int nonPrimeNumbers = 0;
        for (int num : arr) {
            if (num < 2) {
                nonPrimeNumbers++;
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) nonPrimeNumbers++;
            }
        }
        return arr.length - nonPrimeNumbers;
    }

     // Alternative solution
//    public static int countPrimes(int[] array){
//        int count = 0;
//        for (int element : array) {
//            if (element < 2){
//                count++;
//                continue;
//            }
//            boolean isPrime = true;
//            for (int i = 2; i < element; i++) {
//                if (element % i == 0) isPrime = false;
//                break;
//            }
//            if (isPrime) count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {

        System.out.println("============Task 1===============");
        System.out.println(noSpace("\"\""));
        System.out.println(noSpace("Java"));
        System.out.println(noSpace("    Hello    "));
        System.out.println(noSpace("    Hello    "));
        System.out.println(noSpace(" Hello   "));
        System.out.println(noSpace("Tech Global"));

        System.out.println("\n============Task 2===============\n");
        System.out.println(replaceFirstLast("\"\""));
        System.out.println(replaceFirstLast("A"));
        System.out.println(replaceFirstLast("    A    "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println("\n============Task 3===============\n");
        System.out.println(hasVowel("\"\""));
        System.out.println(hasVowel("Java"));
        System.out.println(hasVowel("1234"));
        System.out.println(hasVowel("ABC"));

        System.out.println("\n============Task 4===============\n");
        checkAge(2010);
        checkAge(2006);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);

        System.out.println("\n============Task 5===============\n");
        System.out.println(averageOfEdges(0, 0, 0));
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(averageOfEdges(10, 13, 20));

        System.out.println("\n============Task 6===============\n");
        String[] arr1Task6 = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(arr1Task6));
        String[] arr2Task6 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr2Task6)));
        String[] arr3Task6 = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(Arrays.toString(noA(arr3Task6)));

        System.out.println("\n============Task 7===============\n");
        int[] arr1Task7 = {7,4,11,23,17};
        System.out.println(Arrays.toString(no3or5(arr1Task7)));
        int[] arr2Task7 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(arr2Task7)));
        int[] arr3Task7 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(arr3Task7)));

        System.out.println("\n============Task 8===============\n");
        int[] arr1Task8 = {-10, -3, 0, 1};
        System.out.println(countPrimes(arr1Task8));
        int[] arr2Task8 = {7, 4, 11, 23, 17};
        System.out.println(countPrimes(arr2Task8));
        int[] arr3Task8 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(arr3Task8));

    }
}

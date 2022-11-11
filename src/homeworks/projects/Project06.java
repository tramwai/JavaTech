package homeworks.projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {

    /**
    TASK-1 - countMultipleWords() method
•Write a method that takes a String[] array as an argument and counts how many strings
     in the array has multiple words
•This method will return an int which is the count of multiple words
•NOTE: be careful about these as they are not multiple words ->“”,    “   “,    “    abc”,  “abc   “

Test data:
[“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]

Expected output:
2
     */

    public static int countMultipleWords(String[] str){
        // 1st solution
        int wordCount = 0;
        for (String element : str) {
            if(element.trim().contains(" ")) wordCount++;
        }
        return wordCount;
    }
        // 2nd solution
//        public static int countMultipleWords(String[] str){
//            Pattern pattern = Pattern.compile("\\W{3,}");
//            Matcher matcher = pattern.matcher(Arrays.toString(str));
//            int wordCount = 0;
//            while (matcher.find()){
//                wordCount++;
//            }
//            return wordCount;
//        }

    /**
    TASK-2 - removeNegatives() method
    •Write a method that takes an “ArrayList<Integer> numbers” as an argument and removes
     all negative numbers from the given list if there are any
    •This method will return an ArrayList with removed negatives

    Test data 1:
    [2, -5, 6, 7, -10, -78, 0, 15]

    Expected output 1:
    [2, 6, 7, 0, 15]

    Test data 2:
    [2, -5, 6, 7, -10, -78, 0, 15]

    Expected output 2:
    [2, 6, 7, 0, 15]
     */
    // 1st solution using new array container
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        // create new empty array
        ArrayList<Integer> noNegatives = new ArrayList<>();
        // for each loop to run through the given array and add the positive numbers only
        for (Integer element : numbers) {
            if (element >= 0) noNegatives.add(element);
        }
        return noNegatives;
    }

    // 2nd solution using iterator
//    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
//        // create iterator
//        Iterator<Integer> iterator = numbers.iterator();
//        // while loop iterator
//        while (iterator.hasNext())
//            if (iterator.next() < 0) iterator.remove();
//        return numbers;
//    }

    /**
    TASK-3 - validatePassword() method
    •Write a method that takes a “String password” as an argument and checks if the given password is valid or not
    •This method will return true if given password is valid, or false if given password is not valid
    •A VALID PASSWORD:
        -should have length of 8 to 16 (length of 7 or 17 should return false)
        -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
        -should NOT have any space
    Test data 1:
    Expected output 1:
    false
    Test data 2:  abcd
    Expected output 2: false
    Test data 3: abcd1234
    Expected output 3:  false
    Test data 4: Abcd1234
    Expected output 4: false
    Test data 5: Abcd123!
    Expected output 5: true
     */

    // 1st solution
    public static boolean validatePassword(String password){
        // empty containers for special requirements
        int digits = 0, upperCase = 0, lowerCase = 0, specialChar = 0;
        // fori loop to pass through the string
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) digits++;
            else if (Character.isUpperCase(password.charAt(i))) upperCase++;
            else if (Character.isLowerCase(password.charAt(i))) lowerCase++;
            else specialChar++;
        }
        return (password.length() >= 8 && password.length() <= 16) // apply length requirements
                && (digits > 0 && upperCase > 0 && lowerCase > 0 && specialChar > 0) // apply char req
                && !(password.contains(" ")); // apply no space req
    }

    // 2nd solution using regex
//    public static boolean validatePassword(String password){
//        // regex string
//        String regex ="^(?=.*[0-9])" +      // digit at least once
//                      "(?=.*[a-z])" +       // lowerCase at least once
//                      "(?=.*[A-Z])" +       // upperCase at least once
//                      "(?=.*[-@#$%^&+=()])" +  // specialChar at least once
//                      "(?=\\S+$)" +         // exclude whitespace in whole string
//                      ".{8,16}$";           // length of 8 to 16
//
//        // compile regex
//        Pattern pattern = Pattern.compile(regex);
//        // matcher() method to find matching between given password and regex.
//        Matcher matcher = pattern.matcher(password);
//        return matcher.matches();
//    }


/**
        TASK-4 - validateEmailAddress() method
        •Write a method that takes a “String email” as an argument and checks if the given email is valid or not
        •This method will return true if given email is true, or false if given email is not valid
        •A VALID EMAIL:
            -should NOT have any space
            -should not have more than one “@” character
            -should be in the given format <2+chars>@<2+chars>.<2+chars>
        Test data 1: a@gmail.com
        Expected output 1:  false
        Test data 2:  abc@g.com
        Expected output 2:  false
        Test data 3:  abc@gmail.c
        Expected output 3: false
        Test data 4: abc@@gmail.com
        Expected output 4:  false
        Test data 5: abcd@gmail.com
        Expected output 5: true
         */

    public static boolean validateEmailAddress(String email){
            return Pattern.matches("[\\w\\d._-]{2,}@[\\w\\d]{2,}.[\\w\\d.].{3,}.{2,}", email);
    }



    public static void main(String[] args) {
        System.out.println("\n============Task 1 Test=============\n");
        String[] task1 = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(task1));

        System.out.println("\n============Task 2 Test=============\n");
        ArrayList array1Task2 = new ArrayList(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(array1Task2));

        ArrayList array2Task2 = new ArrayList<>(Arrays.asList(2, -5, -6, 7, -10, -78, 0, -15));
        System.out.println(removeNegatives(array2Task2));

        System.out.println("\n============Task 3 Test=============\n");
        String task3A = " ";
        System.out.println(validatePassword(task3A));
        String task3B = "abcd";
        System.out.println(validatePassword(task3B));
        String task3C = "abcd1234";
        System.out.println(validatePassword(task3C));
        String task3D = "Abcd1234";
        System.out.println(validatePassword(task3D));
        String task3E = "Abcd123!";
        System.out.println(validatePassword(task3E));

        System.out.println("\n============Task 4 Test=============\n");

        String task6A = "a@gmail.com";
        System.out.println(validateEmailAddress(task6A)); // expected false

        String task6B = "abc@g.com";
        System.out.println(validateEmailAddress(task6B)); // expected false

        String task6C = "abc@gmail.c";
        System.out.println(validateEmailAddress(task6C)); // expected false

        String task6D = "abc@@gmail.com";
        System.out.println(validateEmailAddress(task6D)); // expected false

        String task6E = "abcd@gmail.com";
        System.out.println(validateEmailAddress(task6E)); // expected true

    }
}

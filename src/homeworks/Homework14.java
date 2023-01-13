package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14 {


    // Task1
    /**
    Requirement:
-Create a method called fizzBuzz1()
-This method will take an int argument, and it will print numbers starting from 1 to given argument.
 BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5,
 and “FizzBuzz” for the numbers divided both by 3 and 5.

Test Data 1: 3          Test Data 2: 5          Test Data 3: 18
Expected Result 1:      Expected Result 2:      Expected Result 3:
1                       1                       1
2                       2                       2
Fizz                    Fizz                    Fizz
                        4                       4
                        Buzz                    Buzz

                                                Fizz
                                                7
                                                8
                                                Fizz
                                                Buzz
                                                11
                                                Fizz
                                                13
                                                14
                                                FizzBuzz
                                                16
                                                17
                                                Fizz

     */

    public static void fizzBuzz1(int givenNumber){
        for(int i = 1; i <= givenNumber; i++){
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    // Task 2
    /**
    Requirement:
-Create a method called fizzBuzz2()
-This method will take an int argument, and it will return a String. BUT it will return “Fizz”
 if the given number is divided by 3, “Buzz” if the number is divided by 5, and “FizzBuzz”
 if the number is divided both by 3 and 5. Otherwise, it will return number itself.

Test Data 1: 0
Expected Result 1: FizzBuzz

Test Data 2: 1
Expected Result 2: 1

Test Data 3: 3
Expected Result 3: Fizz

Test Data 4: 5
Expected Result 4: Buzz

Test Data 5: 15
Expected Result 5: FizzBuzz
     */

    public static String fizzBuzz2(int number){
        if (number % 15 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return String.valueOf(number);
    }

// Task3
    /**
    Requirement:
-Create a method called findSumNumbers()
-This method will take a String argument and it will return an int which
is the sum of all numbers presented in the String.

NOTE: If there are no numbers represented in the String, return 0.

Test Data 1: “abc$”
Expected Result 1: 0

Test Data 2: “a1b4c  6#”
Expected Result 2: 6

Test Data 3: “ab110c045d”
Expected Result 3: 155

Test Data 4: “525”
Expected Result 4: 525
     */

    public static int findSumNumbers(String str){
        ArrayList<String> listTask3 = new ArrayList<>(Arrays.asList(str.split("\\D+")));
        int sum = 0;
        for (String element : listTask3) {
            if (!element.isEmpty()) sum += Integer.parseInt(element);
        }
        return sum;
    }


    // Task 4
    /**
    Requirement:
-Create a method called findBiggestNumber()
-This method will take a String argument and it will return an int which is the number presented in the String.

NOTE: If there are no numbers represented in the String, return 0.

Test Data 1: “abc$”
Expected Result 1: 0

Test Data 2: “a1b4c  6#”
Expected Result 2: 6

Test Data 3: “ab110c045d”
Expected Result 3: 110

Test Data 4: “525”
Expected Result 4: 525

     */

    public static int findBiggestNumber(String text){
        ArrayList<String> listTask4 = new ArrayList<>(Arrays.asList(text.split("\\D+")));
        int max = Integer.MIN_VALUE;
        if(listTask4.isEmpty()) return 0;
        else{
            for (String s : listTask4) {
                if (!s.isEmpty() && Integer.parseInt(s) > max) max = Integer.parseInt(s);
            }
        }
        return max;
    }

    // Task 5
    /**
    Requirement:
-Create a method called countSequenceOfCharacters()
-This method will take a String argument and it will return a String which is the count
     of repeated characters in a sequence in the String.
NOTE: If given String is empty, then return empty String.
NOTE: It is case sensitive!!!

Test Data 1: “”
Expected Result 1: “”

Test Data 2: “abc”
Expected Result 2: “1a1b1c”

Test Data 3: “abbcca”
Expected Result 3: “1a2b2ca”

Test Data 4: “aaAAa”
Expected Result 4: “2a2A1a”

     */

    public static String countSequenceOfCharacters(String strTask5) {
        if (strTask5.isEmpty()) {
            return "";
        }
        String result = "";
        char[] chars = strTask5.toCharArray();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                result += count + "" + chars[i];
                count = 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("================Task 1==============");
        fizzBuzz1(3);
        System.out.println();
       fizzBuzz1(5);
        System.out.println();
       fizzBuzz1(18);
       fizzBuzz1(2);



       // comments
        System.out.println("================Task 2==============");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("================Task 3==============");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("================Task 4==============");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("================Task 5==============");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));
    }
}

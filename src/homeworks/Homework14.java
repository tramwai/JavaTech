package homeworks;

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
Expected Result 2: 11

Test Data 3: “ab110c045d”
Expected Result 3: 155

Test Data 4: “525”
Expected Result 4: 525
     */

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
}

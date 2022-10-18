package homeworks.projects;

import java.util.Random;

public class Project03Recap {
    public static void main(String[] args) {
        System.out.println("========Task 1 ===========");
        /**
         Assume that you are given below Strings. String s1 = “24”, s2 = “5”;
         -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
         The sum of 24 and 5 = 29,The subtraction of 24 and 5 = 19
         The division of 24 and 5 = 4.8, The multiplication of 24 and 5  = 120
         The remainder of 24 and 5 = 4
         */
        String s1= "24", s2 = "5";
        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (Integer.parseInt((s1) + Integer.parseInt((s2)))));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + ((Integer.parseInt((s1)) - (Integer.parseInt((s2))))));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + (double)(Integer.parseInt((s1)) / Integer.parseInt((s2))));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (Integer.parseInt((s1) ) *  Integer.parseInt((s2))));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (Integer.parseInt((s1) ) % Integer.parseInt((s2))));


        System.out.println("\n========Task 2 ===========");
        /**
         -Write a program that generates a random number between 1 and 35 (1 and 35 are included)
         -Find if the given number is a Prime Number
         -If random number generated is a prime one, then print “THE NUMBER IS A PRIME NUMBER”.
         -Otherwise, print “THE NUMBER IS NOT A PRIME NUMBER”
         Prime number is a number that can be divided only by itself and 1. It cannot be divided by any other number.
         The smallest prime number is 2 and 2 is the only even prime number.
         So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
         */
        int randNumber = (int) (Math.random() * 35) + 1;
        boolean isPrime = true;
        for (int i = 2; i <= randNumber / 2; i++){
            if (randNumber % i == 0 ){
                if (randNumber % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(randNumber + " It is not a prime number");
            else System.out.println(randNumber  + " Is not a prime number");
        }

        System.out.println("\n========Task 3 ===========");
        /**
         Write a program that generates 3 random numbers between 1 and 50 (1 and 50 are included)
         -Find and print each number in ascending order. Ascending order is ordering from lowest to greatest
         NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this task.
         */
        Random random = new Random();
        int random1Task3 = random.nextInt(50) + 1;
        int random2Task3 = random.nextInt(50) + 1;
        int random3Task3 = random.nextInt(50) + 1;
        System.out.println("Random number 1 is " + random1Task3);
        System.out.println("Random number 2 is " + random2Task3);
        System.out.println("Random number 3 is " + random3Task3);
        // Find the min and max numbers
        int max = Math.max(Math.max(random1Task3, random2Task3), random3Task3);
        int min = Math.min(Math.min(random1Task3, random2Task3), random3Task3);
        int middle = 0;
        if(min == random1Task3){
            middle = Math.min(random2Task3,random2Task3);
        } else if (min == random2Task3 ) {
            middle = Math.min(random1Task3, random2Task3);
        }else
            middle = Math.min(random1Task3, random2Task3);
        System.out.println("\nLowest number is = " + min);
        System.out.println("Middle number is = " + middle);
        System.out.println("Greatest number is = " + max);

        // int middle = (random1Task1 + random2Task2 + random3Task3 - max - min);

        System.out.println("\n========Task 4 ===========");
        /**TASK-4 (Find if given char is lowercase or uppercase)
         -Assume you are given a single character. (It will be hard-coded)
         -First, check if given char is a letter but not digit or special character.
         -If the given char is not a letter, then print “Invalid character detected!!!”.
         -If it is a letter, then find out if it is an uppercase or a lowercase letter.
         -If the letter is uppercase, then print “The letter is uppercase”, else print “The letter is lowercase”.
         NOTE: You need to use ASCII table and casting for this task
         */
        char c1 = 'A';
        boolean isLowerCase = (c1 >= 'a' && c1 <= 'z');
        boolean isUpperCase = (c1 >= 'A' && c1 <= 'A');

        if (isLowerCase || isUpperCase){
            if (isLowerCase) System.out.println( "The letter is lowercase");
            else System.out.println("teh letter is uppercase");
        }else System.out.println("invalid character detected");

        System.out.println("\n========Task 5 ===========");
        /**
         TASK-5 (Find if given char is vowel or consonant)
         -Assume you are given a single character. (It will be hard-coded)
         First, check if given char is a letter but not digit or special character.
         -If it is not a letter, then print “Invalid character detected!!!”.
         -If it is a letter, then find out whether it is a vowel or a consonant.
         -If the letter is vowel, then print “The letter is vowel”, else print “The letter is consonant”.
         -Vowel letters: a, e, i o, u, A, E, I, O, U
         NOTE: You need to use ASCII table and casting for this example
         */

        char c2 = 'e';
        boolean isLower1= (c2 >= 'a' && c2 <= 'z');
        boolean isUpper1 = (c1 >= 'A' && c1 <= 'Z');
        if (isLower1 || isUpper1){
            if(isUpper1) c2 += 32;
            if (c2 == 'a' || c2 == 'e' || c2 == 'o' || c2 == 'u'){
                System.out.println("The letter is vowel");
            }else
                System.out.println("The letter is consonant");
        }else
            System.out.println("Invalid character detected");

        System.out.println("\n========Task 6 ===========");
        /**
         TASK-6 (Find if given char is special character or not)
         -Assume you are given a single character. (It will be hard-coded)
         -First, check if the given char is a special character but not a digit or not a letter.
         -If it is not a special character, then print “Invalid character detected!!!”.
         -If it is a special character, then print “Special character is = {givenCharacter}”.
         NOTE: You need to use ASCII table and casting for this example
         */
        char character1 = '8';
        boolean isLetter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        boolean isDigit = character1 >= 48 && character1 <= 57;
        if(isLetter || isDigit) System.out.println("Invalid character detected");
        else System.out.println("Special character is = " + character1);


        System.out.println("\n========Task 7 ===========");
        /**
         TASK-7 (Find if given char is a letter or digit or special character)
         -Assume you are given a single character. (It will be hard-coded)
         -If given char is a letter, then print “Character is a letter”
         -If given char is a digit, then print “Character is a digit”
         -Otherwise, print “Character is a special character”
         */

        char charT7 = 'a';
        isLetter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        isDigit = character1 >= 48 && character1 <= 57;
        if(isLetter) System.out.println("Character is a letter");
        else if (isDigit) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");

    }
}

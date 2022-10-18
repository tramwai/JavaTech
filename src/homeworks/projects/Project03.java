package homeworks.projects;

import java.util.Random;

public class Project03 {
    public static void main(String[] args) {
        System.out.println("========Task 1 ===========");
        /**
         Assume that you are given below Strings. String s1 = “24”, s2 = “5”;
         -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
         The sum of 24 and 5 = 29,The subtraction of 24 and 5 = 19
         The division of 24 and 5 = 4.8, The multiplication of 24 and 5  = 120
         The remainder of 24 and 5 = 4
         */
        // declare the given variables
        String s1 = "24", s2 = "5";
        // cast variables into int
        int convertedS1 = Integer.parseInt(s1);
        int convertedS2 = Integer.parseInt(s2);
        // calculate and print the results
        System.out.println("The sum of " + s1 + " and " + s2 + " is = " + (convertedS1 + convertedS2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " is = " + (convertedS1 - convertedS2));
        // cast into double each variable in order to get a double result
        System.out.println("The division of " + s1 + " and " + s2 + " is = " + ((double) convertedS1 / (double) convertedS2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " is = " + convertedS1 * convertedS2);
        System.out.println("The remainder of " + s1 + " and " + s2 + " is = " + convertedS1 % convertedS2);


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
        Random random = new Random();
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
        // create an object of Random class
//        Random random = new Random();
//        int randomNumber = random.nextInt(35) + 1;
//        System.out.println("Random number = " + randomNumber);
//        // Find the prime numbers using if-else
//        if (randomNumber == 1)
//            System.out.println(randomNumber + " IS NOT PRIME NUMBER");
//        else if (randomNumber == 2 || randomNumber % 2 != 0) // 2 is the only even prime number
//            System.out.println(randomNumber + " IS A PRIME NUMBER");
//        else
//            System.out.println(randomNumber + " IS NOT PRIME NUMBER");


        System.out.println("\n========Task 3 ===========");
        /**
         Write a program that generates 3 random numbers between 1 and 50 (1 and 50 are included)
         -Find and print each number in ascending order. Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this task.
        */
        // Generate 3 random numbers and print them
        int random1Task3 = random.nextInt(50) + 1;
        int random2Task3 = random.nextInt(50) + 1;
        int random3Task3 = random.nextInt(50) + 1;
        System.out.println("Random number 1 is " + random1Task3);
        System.out.println("Random number 2 is " + random2Task3);
        System.out.println("Random number 3 is " + random3Task3);
        // Find the min and max numbers
        int max = Math.max(Math.max(random1Task3, random2Task3), random3Task3);
        int min = Math.min(Math.min(random1Task3, random2Task3), random3Task3);
        // write the logic statements for the middle number
        System.out.println("\nLowest number is = " + min);
        if (random1Task3 != min && random1Task3 != max) {
            System.out.println("Middle number is = " + random1Task3);
        } else if (random2Task3 != min && random2Task3 != max) {
            System.out.println("Middle number is = " + random2Task3);
        } else
            System.out.println("Middle number is = " + random3Task3);

        // Alternative solution
        // int middle = (random1Task1 + random2Task2 + random3Task3 - max - min);

        System.out.println("Greatest number is = " + max);


        System.out.println("\n========Task 4 ===========");
        /**TASK-4 (Find if given char is lowercase or uppercase)
        -Assume you are given a single character. (It will be hard-coded)
         -First, check if given char is a letter but not digit or special character.
         -If the given char is not a letter, then print “Invalid character detected!!!”.
         -If it is a letter, then find out if it is an uppercase or a lowercase letter.
         -If the letter is uppercase, then print “The letter is uppercase”, else print “The letter is lowercase”.
         NOTE: You need to use ASCII table and casting for this task
         */
        // given single character
        char c = 'V';
        // this checks if the given char is a letter or not
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            // if the condition above is true, this checks if the given character is upper case
            if (c >= 65 && c <= 90) {
                System.out.println("The letter is upper case");
            } else {
                // otherwise, the character is lowercase
                System.out.println("The letter is lower case");
            }
        } else {
            System.out.println("Invalid character detected");
        }

//        System.out.println("========Alternative solution TAsk 4========");
//        char c1 = 'V';
//        if (c1 >= 'a' && c1 <= 'z'){
//            System.out.println("The letter is lower case");
//        } else if (c1 >= 'A' && c1 <= 'Z') {
//            System.out.println("The letter is upper case");
//        }else
//            System.out.println("The letter is lower case");


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
        //declare the given variable
        char charTask5 = '#';
        // this checks if the given char is a letter or not
        if ((charTask5 >= 65 && charTask5 <= 90) || (charTask5 >= 97 && charTask5 <= 122)) {
            // get cases for ASCII vowel values
            switch (charTask5) {
                case 97: // 'a'
                case 101: // 'e'
                case 105: // 'i'
                case 111: // 'o'
                case 117: // 'u'
                    // case 121: // 'y' - is this missing from the requirements?>
                case 65: // 'A'
                case 69: // 'E'
                case 73: // 'I'
                case 79: // 'O'
                case 85: // 'U'
                    //  case 89: // 'Y'
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }
        } else
            System.out.println("Invalid character detected");

//
//        System.out.println("========Alternative solution Task5========");
//        // write condition for all letters
//        if ((charTask5 >= 'a' && charTask5 <= 'z') || (charTask5 >= 'A' && charTask5 <= 'Z')){
//            switch (charTask5){
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                    System.out.println("Letter is vowel");
//                    break;
//                default:
//                    System.out.println("The letter is consonant");
//            }
//        }else {
//            System.out.println("Invalid character detected");
//        }
      // Alternative solution
//
//        char c2 = 'e';
//        boolean isLower1= (c2 >= 'a' && c2 <= 'z');
//        boolean isUpper1 = (c1 >= 'A' && c1 <= 'Z');
//        if (isLower1 || isUpper1){
//            if(isUpper1) c2 += 32;
//            if (c2 == 'a' || c2 == 'e' || c2 == 'o' || c2 == 'u'){
//                System.out.println("The letter is vowel");
//            }else
//                System.out.println("The letter is consonant");
//        }else
//            System.out.println("Invalid character detected");

        System.out.println("\n========Task 6 ===========");
        /**
         TASK-6 (Find if given char is special character or not)
         -Assume you are given a single character. (It will be hard-coded)
         -First, check if the given char is a special character but not a digit or not a letter.
         -If it is not a special character, then print “Invalid character detected!!!”.
         -If it is a special character, then print “Special character is = {givenCharacter}”.
         NOTE: You need to use ASCII table and casting for this example
         */
        // declare the given variable
        char charTask6 = '&';
        // exclude all letters and numbers
        if ((charTask6 >= 'a' && charTask6 <= 'z') || (charTask6 >= 'A' && charTask6 <= 'Z') || (charTask6 >= '0' && charTask6 <= '9')){
            System.out.println("Invalid character detected");
        }else // if it's not a letter or a number then it is a special character
            System.out.println("Special character is = " + charTask6);


        System.out.println("\n========Task 7 ===========");
        /**
        TASK-7 (Find if given char is a letter or digit or special character)
    -Assume you are given a single character. (It will be hard-coded)
    -If given char is a letter, then print “Character is a letter”
    -If given char is a digit, then print “Character is a digit”
    -Otherwise, print “Character is a special character”
         */
    // declare the given variable
    char charTask7 = '@';
    // write the logical statement for all letters
    if ((charTask7 >= 'a' && charTask7 <= 'z') || (charTask7 >= 'A' && charTask7 <= 'Z')){
        System.out.println("Character is a letter");
    // write the logical statement for all the numbers
    } else if (charTask7 >= '0' && charTask7 <= '9'){
        System.out.println("Character is a digit");
    }else
    // if it's not letter or character then it is a special character
        System.out.println("Character is a special character");
    }
}



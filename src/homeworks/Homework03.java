package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("\n============Task 1===========");
        /**
         Write a Java program that asks user to enter 2 numbers -
         int values and find the absolute difference between the
         two numbers by using Math.abs() method
         */
        // initiate scanner method
        Scanner input = new Scanner(System.in);
        // ask user to enter 2 numbers
        System.out.println("Please enter two numbers");
        // declare and assign the values of variables entered by user
        int num1 = input.nextInt(), num2 = input.nextInt();
        // invoke the Math.abs() method to find the absolute difference and print the result
        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("\n============Task 2 ===========");
        /**
         -Write a Java program that asks user to enter 5 numbers -
         int values and find the Max and Min number by using
         Math.max() and Math.min() methods
         */
        //ask user to enter 5 numbers - int values
        System.out.println("Please enter five numbers");
        // declare and assign the values of variables entered by user
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();
        int numb3 = input.nextInt();
        int numb4 = input.nextInt();
        int numb5 = input.nextInt();
        // invoke the Math.max() and Math.min() methods to find the min, max and print the result
        System.out.println("Max value is = " + Math.max(Math.max(Math.max(numb1, numb2), numb3), (Math.max(numb4, numb5))));
        System.out.println("Min value is = " + Math.min(Math.min(Math.min(numb1, numb2), numb3), (Math.min(numb4, numb5))));


        System.out.println("\n============Task 3 ===========");
        /**
         Write a Java program that generates 3 random numbers between 50 and 100 both included. Use Math.random()
         First print the numbers
         Then, find the sum of these numbers
         */
        // insert formula for random numbers and print them
        int random1 = (int) ((Math.random() * ((100 - 50) + 1)) + 50);
        System.out.println(" Number 1 = " + random1);
        int random2 = (int) ((Math.random() * ((100 - 50) + 1)) + 50);
        System.out.println(" Number 2 = " + random2);
        int random3 = (int) ((Math.random() * ((100 - 50) + 1)) + 50);
        System.out.println(" Number 3 = " + random3);
        // Find the sum of these numbers
        System.out.println("The sum of numbers is " + (random1 + random2 + random3));


        System.out.println("\n============Task 4 ===========");
        /**
         Assume Alex has $125, and Mike has $220.
         And Alex is going to give $25.5 to Mike.Then,
         How much money will Alex and Mike will have after that?
         */
        // Declare variables for each guy's amount and the amount given. Assign their respective values
        double amountMike = 220, amountAlex = 125;
        double amountGivenByAlex = 25.5;
        System.out.println("Alex's money: " + "$" + (amountAlex - amountGivenByAlex));
        System.out.println("Mike's money: " + (amountMike + amountGivenByAlex));


        System.out.println("\n============Task 5 ===========");
        /**
         Assume David is going to save  $390 to buy a bicycle.
         David can save only $15.60 per day.
         Requirement:
         Write a program to find how many days later, David can save $390 and buy the bicycle.
         */
        // Declare variables and assign their values
        double bicyclePrice = 390;
        double savingsPerDay = 15.60;
        // Divide the bicycle price by the savings per day to find the number of days
        System.out.println((int) (bicyclePrice / savingsPerDay));


        System.out.println("\n============Task 6 ===========");
        /**
         Convert given Strings below to int data types and
         find their sum, product, division, subtraction and remainder.
         */
        // Write the given variables
        String s1 = "5", s2 = "10";
        // Convert the strings and perform the required operations
        int i1 = Integer.parseInt(s1), i2 = Integer.parseInt(s2);
        System.out.println("-Sum of " + i1 + " and " + i2 + " is = " + (i1 + i2));
        System.out.println("-Product of " + i1 + " and " + i2 + " is = " + i1 * i2);
        System.out.println("-Division of " + i1 + " and " + i2 + " is = " + i1 / i2);
        System.out.println("-Subtraction of " + i1 + " and " + i2 + " is = " + (i1 - i2));
        System.out.println("-Remainder of " + i1 + " and " + i2 + " is = " + (i1 % i2));


        System.out.println("\n============Task 7 ===========");
        /**
         Convert given Strings below to int data types and find the greatest and
         smallest values and find the average and absolute difference of them.
         */
        // Write the given variables, reassigning values to the previously used variable with the same names
        s1 = "200";
        s2 = "-50";
        int convertedS1 = Integer.parseInt(s1);
        int convertedS2 = Integer.parseInt(s2);
        // Perform the required tasks
        System.out.println("The greatest value is = " + Math.max(convertedS1, convertedS2));
        System.out.println("The smallest value is = " + Math.min(convertedS1, convertedS2));
        System.out.println("The average is = " + (convertedS1 + convertedS2) / 2);
        System.out.println("The absolute difference is = " + Math.abs(convertedS1 - convertedS2));


        System.out.println("\n============Task 8 ===========");
        /**
         Assume that you have a coin bank, and you save 3 quarters, 1 dime, 2 nickels and 1 penny each day.
         -find how many days later you can save $24
         -find how many days later you can save $168
         -how much you will save after 5 months (assume a month is 30 days)
         */
        // Declare variables and assign respective values
        double savePerDay = 0.96; // (3*0.25) + (1*0.1) + (2*0.05) + (1*0.01) = 0.96
        double firstAmountToBeSaved = 24;
        double secondAmountToBeSaved = 168;
        // formula for how many days later you can save $24
        System.out.println((int) (firstAmountToBeSaved / savePerDay) + " days");
        // formula for how many days later you can save $168
        System.out.println((int) (secondAmountToBeSaved / savePerDay) + " days");
        //formula for how much you will save after 5 months (assume a month is 30 days)
        System.out.println("$" + savePerDay * (5 * 30));


        System.out.println("\n============Task 9 ===========");
        /**
         Jessie is going to save $1,250 to buy a new computer. Jessie is saving $62.5 in a day.
         Write a Java program that calculates how many days it will take for Jessie to buy the computer.
         */
        // Declare variables and assign respective values
        double computerPrice = 1_250;
        double savingsDay = 62.5;
        // Calculate how many days needed to buy computer and convert result into int value
        System.out.println((int) (computerPrice / savingsDay));


        System.out.println("\n============Task 10 ===========");
        /**
         Dan is going to save $14,265 to buy a new car. Dan is given two option to
         make monthly payments with no interest rate.
         Option 1: Equal payments of $475.50 per month
         Option 2: Equal payments of $951 per month
         Write a Java program that calculates how many months it will take for Dan to
         complete all the payments with option 1 and option 2.
         */
        // Declare variables and assign respective values
        double carPrice = 14_265;
        double option1 = 475.50;
        double option2 = 951;
        //Calculate how many months needed for each option and convert results into int values
        System.out.println("Option 1 will take " + (int) (carPrice / option1) + " months");
        System.out.println("Option 2 will take " + (int) (carPrice / option2) + " months");


        System.out.println("\n============Task 11 ===========");
        /**
         Write a Java program that asks user to enter 2 numbers(number1 and number2) and store those in int variables.
         Find the result of number1/number2 and store this in a double. Finally print the result
         */
        // Ask user to enter 2 numbers
        System.out.println("Enter 2 numbers");
        // use input() method
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // convert to double
        double a = number1, b = number2;
        // print result
        System.out.println(a / b);
        // Alternative:  System.out.println((double) number1 / (double)number2);

        System.out.println("\n============Task 12 ===========");
        /**
         Write a Java program that generates 3 random numbers between 0 and 100(0 and 100 are included) and find if
         all numbers are more than 25. Print true if all numbers are greater than 25. Print false if any of the numbers
         is less than or equal to 25
         */
        //generate 3 random numbers and print them
        int randomNr1 = (int) (Math.random() * 101);
        int randomNr2 = (int) (Math.random() * 101);
        int randomNr3 = (int) (Math.random() * 101);
        System.out.println(randomNr1);
        System.out.println(randomNr2);
        System.out.println(randomNr3);
        // write if else statement based on the requirements
        if (randomNr1 > 25 && randomNr2 > 25 && randomNr3 > 25) {
            System.out.println("true");
        } else {
            if (randomNr1 <= 25 || randomNr2 <= 25 || randomNr3 <= 25) {
                System.out.println("false");
            }
        }



        System.out.println("\n============Task 13 ===========");
        /**
         Write a Java program to ask user to enter a number between 1 and 7(1 and 7 are included).
         Print the day of the week according to given number. First day is MONDAY and last day is SUNDAY
         */
        // ask user to enter a number between 1 and 7
        System.out.println("Please enter a number between 1 and 7");
        int day = input.nextInt();
        // write logical statement according to requirements
        if (day == 1) {
            System.out.println("The number entered returns MONDAY");
        } else if (day == 2) {
            System.out.println("The number entered returns TUESDAY");
        } else if (day == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        } else if (day == 4) {
            System.out.println("The number entered returns THURSDAY");
        } else if (day == 5) {
            System.out.println("The number entered returns FRIDAY");
        } else if (day == 6) {
            System.out.println("The number entered returns SATURDAY");
        } else {
            System.out.println("The number entered returns SUNDAY");
        }


        System.out.println("\n============Task 14 ===========");
        /**
            Jennifer is taking a math course . This math course requires students to take 3 exams. At the end,
            if the average of those exams is more than or equal to 70, then Jennifer will pass the course.
            However, if the average of those 3 exams is less than 70, then Jennifer will fail.
            Write a Java program that asks Jennifer to enter her exam results and print if she passed or failed
            for the exam.
         */
        // ask Jennifer to for the results from the 3 exams
        System.out.println("Tell me your exam results?");
        int exam1 = input.nextInt();
        int exam2 = input.nextInt();
        int exam3 = input.nextInt();
        // calculate the average score of the 3 exams
        int averageScore = (exam1 + exam2 + exam3) / 3;
        // write logical statement according to requirements
        if (averageScore >= 70){
            System.out.println("YOU PASSED");
        } else {
            if (averageScore < 70) {
                System.out.println("YOU FAILED");
            }
        }

        System.out.println("\n============Task 15 ===========");
        /**
          Write a Java program that asks user to enter 3 numbers.If all numbers are different, then print “NO MATCH”
          If any of those 2 numbers are equal, then print “DOUBLE MATCH”
          If all 3 numbers are equal, then print “TRIPLE MATCH”
        */
        // ask user to enter 3 numbers
        System.out.println("Enter 3 numbers");
        int number1Task15 = input.nextInt(), number2Task15 = input.nextInt(), number3Task15 = input.nextInt();
        // write logical statement according to requirements
        if (number1Task15 == number2Task15 && number1Task15 == number3Task15){
            System.out.println("TRIPLE MATCH");
        } else if (number1Task15 != number2Task15 && number1Task15 != number3Task15) {
            System.out.println("NO MATCH");
        }
        if (number1Task15 == number2Task15 && number1Task15 !=number3Task15){
            System.out.println("DOUBLE MATCH");
        } else {
            if (number1Task15 == number3Task15 && number1Task15 != number2Task15){
                System.out.println("DOUBLE MATCH");
            }
        }
    }
}




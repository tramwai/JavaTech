package homeworks;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.util.Random;
import java.util.Scanner;

public class Homework03AlternativeSolutions {
    public static void main(String[] args) {
        System.out.println("\n============Task 12 ===========");
        /**
         *         // Alternative solution using the Random class
        Write a Java program that generates 3 random numbers between 0 and 100 (0 and 100 are included) and find if all
         numbers are more than 25.Print true if all numbers are greater than 25
         Print false if any of the number is less than or equal to 25
         */
        // Import and initiate the Random class
        Random random = new Random();
        // declare and assign the variables values for the random numbers
        int randomNr1, randomNr2, randomNr3;
        randomNr1 = random.nextInt(100) + 1;
        randomNr2 = random.nextInt(100) + 1;
        randomNr3 = random.nextInt(100) + 1;
        // print the random numbers
        System.out.println(randomNr1);
        System.out.println(randomNr2);
        System.out.println(randomNr3);
        // write if else statement based on the requirements
        boolean allNumsOver25 = (randomNr1 > 25) && (randomNr2 > 25) && (randomNr3 > 25);
        //System.out.println((randomNr1 > 25) && (randomNr2 > 25) && (randomNr3 > 25));
        System.out.println(allNumsOver25);

//        if (randomNr1 > 25 && randomNr2 > 25 && randomNr3 > 25) {
//            System.out.println("true");
//        } else {
//            if (randomNr1 <= 25 || randomNr2 <= 25 || randomNr3 <= 25) {
//                System.out.println("false");
//            }
//        }

        System.out.println("\n============Task 13 ===========");

        /**
         *         // Alternative solution using switch
         Write a Java program to ask user to enter a number between 1 and 7(1 and 7 are included).
         Print the day of the week according to given number. First day is MONDAY and last day is SUNDAY
         */
    // Import Scanner Class and initiate a new scanner
        Scanner scanner = new Scanner(System.in);
        // Ask user to enter a number between 1 and 7
        System.out.println("Please enter a number between 1 and 7");
        int dayOfWeek = scanner.nextInt();
        // write the solution using switch
        switch (dayOfWeek){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
        }

        /**
         Jennifer is taking a math course . This math course requires students to take 3 exams. At the end,
         if the average of those exams is more than or equal to 70, then Jennifer will pass the course.
         However, if the average of those 3 exams is less than 70, then Jennifer will fail.
         Write a Java program that asks Jennifer to enter her exam results and print if she passed or failed
         for the exam.
         */
        // ask Jennifer to for the results from the 3 exams
        System.out.println("Tell me your exam results?");
        int exam1 = scanner.nextInt();
        int exam2 = scanner.nextInt();
        int exam3 = scanner.nextInt();
        // calculate the average score of the 3 exams
        int averageScore = (exam1 + exam2 + exam3) / 3;
        // write logical statement according to requirements
        if (averageScore >= 70)
            System.out.println("YOU PASSED");
        else
            System.out.println("YOU FAILED");




        System.out.println("\n============Task 15 ===========");
        /**
         Write a Java program that asks user to enter 3 numbers.If all numbers are different, then print “NO MATCH”
         If any of those 2 numbers are equal, then print “DOUBLE MATCH”
         If all 3 numbers are equal, then print “TRIPLE MATCH”
         */
        // ask user to enter 3 numbers
        System.out.println("Please enter 3 numbers");
        int num1, num2, num3;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        // write logical statement according to requirements
        if (num1 == num2 && num2 == num3)
            System.out.println("TRIPLE MATCH");
        else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
            System.out.println("DOUBLE MATCH");
        } else
            System.out.println("NO MATCH");

    }
}

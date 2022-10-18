package homeworks.projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("\n==============Task 1=================");
        /*
        TASK-1
        -Write a program that asks user to enter their 3 numbers
        -Then multiply these numbers and print the result in the format:
        The product of the numbers entered is = {number1}*{number2}*{number3}
         */

        // Declare the variables for the 3 numbers to be entered by user
        int number1, number2, number3;
        // Invoke the scanner() method to get input from user
        Scanner scanner = new Scanner(System.in);
        // Call the println() method to ask for user's input
        System.out.println("Please enter 3 numbers ");
        // assign the variables their value according to user input
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        scanner.nextLine();
        // Calculate the product and display the result message
        System.out.println("The product of the numbers entered is = " + number1 * number2 * number3);

        System.out.println("\n==============Task 2=================");
        /*
        TASK-2
        -Write a program that asks user to enter their first name, last name and year of birth.
        -Then calculate the age by subtracting the year of birth from current year we are in.
        -Print result in the format: {firstName} {lastName}’s age is = {currentYear} – {yearOfBirth}.
         */
        // Declare the task variables
        String firstName, lastName;
        int yearOfBirth;
        int currentYear = 2022;
        // Ask user's input
        System.out.println("What is your first name? ");
        firstName = scanner.nextLine();
        System.out.println("What is your last name? ");
        lastName = scanner.nextLine();
        System.out.println("What is your year of birth?");
        yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        // Calculate the age and print the result
        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - yearOfBirth) + ".");

        System.out.println("\n==============Task 3=================");
        /*
        TASK-3
        -Write a program that asks user to enter their full name and weight as kg.
        -Then calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
        -Print result in the format: {fullName}’s weight is = {kgWeight * 2.205} lbs.
         */
        // Declare the new variables
        double kgWeight;
        String fullName;
        // Ask user's input
        System.out.println("What is your full name?");
        fullName = scanner.nextLine();
        System.out.println("What is your weight?");
        kgWeight = scanner.nextInt();
        scanner.nextLine();
        // Calculate the weight and display the result
        System.out.println(fullName + "'s weight is " + kgWeight * 2.205 + " lbs.");

        System.out.println("\n==============Task 4=================");
        /*
        TASK-4
        -Write a program that asks 3 students to enter their full name and age
        -Then print each student’s age with their full names as {fullName}’s age is {age}.
        -And, calculate the average age for these students and print result as The average age is {averageAge}.
        -And, find the eldest age and print result as The eldest age is {eldestAge}.
        -And, find the youngest age and print result as The youngest age is {youngestAge}.
         */

        // Ask first student for name and age
        //student 1
        System.out.println("What is your full name");
        String student1FullName = scanner.nextLine();
        System.out.println("What is your age");
        int ageOfStudent1 = scanner.nextInt();
        scanner.nextLine();
        // ask second student for name and age
        System.out.println("What is your full name");
        String student2FullName = scanner.nextLine();
        System.out.println("What is your age");
        int ageOfStudent2 = scanner.nextInt();
        scanner.nextLine();
        // ask third student for name and age
        System.out.println("What is your full name");
        String student3FullName = scanner.nextLine();
        System.out.println("What is your age");
        int ageOfStudent3 = scanner.nextInt();

        // Print each student's age
        System.out.println(student1FullName + "'s age is " + ageOfStudent1 + ".");
        System.out.println(student2FullName + "'s age is " + ageOfStudent2 + ".");
        System.out.println(student3FullName + "'s age is " + ageOfStudent3 + ".");

        // Calculate the average age
        System.out.println("The average age is " + (ageOfStudent1 + ageOfStudent2 + ageOfStudent3) / 3 + ".");

        // Calculate and print the eldest age
        System.out.println("The eldest age is " + Math.max(Math.max(ageOfStudent1, ageOfStudent2), ageOfStudent3 ) + ".");

        // Calculate and print the youngest age
        System.out.println("The youngest age is " + Math.min(Math.min(ageOfStudent1, ageOfStudent2), ageOfStudent3) + ".");

        // Bonus


    }

}

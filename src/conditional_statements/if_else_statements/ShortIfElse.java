package conditional_statements.if_else_statements;

import java.util.Scanner;

public class ShortIfElse {
    public static void main(String[] args) {
        /*
        Write a program that aska user to enter 2 different numbers
        and find the max number and print it with message
        Example
            Program: Please enter 2 numbers
            User 5 10
            Program 10 is the greatest
            Note: do not use math class
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 different numbers");
        int number1 = input.nextInt(), number2 = input.nextInt();
        // shortcut - gets rid of curly braces if the statement repeats itself
        if (number1 > number2)
            System.out.println(number1 + " is the greatest");
        else
            System.out.println(number2 + " is the greatest");
        System.out.println("End of the program");

        // solution 2
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter 2 different numbers");
        int num1 = input.nextInt(), num2 = input.nextInt();
        int greatest = 0; // create empty container
        if(num1 > num2) greatest = num1;
        else greatest = num2;
        System.out.println(greatest + " is the greatest");

    }
}

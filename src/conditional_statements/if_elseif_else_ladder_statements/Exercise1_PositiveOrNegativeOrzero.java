package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrzero {
    public static void main(String[] args) {
        /*
        Write a program that askas user to enter a number
        if number is more than zero , print "POSITIVE"
        if number is less than zero , print "NEGATIVE"
        Otherwise ,print "ZERO"
         */
        // Solution 1
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        if(number == 0){
            System.out.println("ZERO");
        }else if (number < 0){
            System.out.println("NEGATIVE");
        }else{
            System.out.println("POSITIVE");
        }

        // Solution 2 with nested if else
        if (number == 0){
            System.out.println("ZERO");
        }else {
            if(number < 0){
                System.out.println("NEGATIVE");
            }else{
                System.out.println("POSITIVE");
            }
        }

    }
}

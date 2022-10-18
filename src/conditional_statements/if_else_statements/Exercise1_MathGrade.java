package conditional_statements.if_else_statements;

import java.util.Scanner;
import java.util.SortedMap;

public class Exercise1_MathGrade {
    public static void main(String[] args) {
        /**
        Write a Java program that asks user to enter their age
And print “It is your time to get retired!” if their age is more than or equal to 55
NOTE: Write PSEUDO CODE first
EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 60
Program: It is your time to get retired!
EXAMPLE PROGRAM 1
Program: Please enter your age?
User: 45
Program:
         **/

        Scanner input = new Scanner(System.in);
        System.out.println("Hey David! Please enter your math grade?");
        int examResult = input.nextInt();

        if(examResult >= 60){
            System.out.println("Awesome, you passed!");
        }else {
            System.out.println("Sorry, you failed!");
        }
        System.out.println("End of the program");
    }
}

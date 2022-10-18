package conditional_statements.ternary_operator;

import java.util.Random;

public class Exercise2_FindMIn {
    public static void main(String[] args) {
         /*
        Task
        write a program that generates 2 random numbers between 1 and 10. Find and print the smallest number
        Use Ternary Operator
         */

        Random random = new Random();
        int num1 = random.nextInt(10) +1; //1 to 10
        int num2 = random.nextInt(10) + 1;
        System.out.println("The random number 1 is = " + num1);
        System.out.println("The random number 2 is = " + num2);
        int min = num1 < num2 ? num1 : num2;
        System.out.println("The smallest number is = " + min);


    }
}

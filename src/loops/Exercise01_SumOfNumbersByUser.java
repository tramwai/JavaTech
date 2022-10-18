package loops;

import java.util.Random;
import java.util.Scanner;

public class Exercise01_SumOfNumbersByUser {
    public static void main(String[] args) {
        /*
Write a Java program that asks user to enter some numbers and
find the sum of numbers given by user

Example program
Program: Please enter how many number you want to enter
User: 3

Program: Please enter number 1
User: 10

Program: Please enter number 2
User: 7

Program: Please enter number 3
User: 8

Expected output:
25
 */
        System.out.println("/n ------for i solution ---------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter");
        int count1 = scanner.nextInt(); // total numbers we are getting from user
        int sum1 = 0; //  sum of all numbers entered
        for (int i = 1; i <= count1 ; i++) {
            System.out.println("Please enter number " + i);
            sum1 += scanner.nextInt();
        }
        System.out.println(sum1);

        System.out.println("\n ------while solution --------");
        System.out.println("Please enter how many numbers you want to enter");
        int count2 = scanner.nextInt();
        int sum2 = 0;
        int start = 1;
        while (start <= count2){
            System.out.println("Please enter number " + start);
            sum2 += scanner.nextInt();
            start ++;
        }
        System.out.println(sum2);
    }
}

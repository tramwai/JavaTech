package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number ");
        int number2 = input.nextInt();

        System.out.println("Enter the third number ");
        int number3 = input.nextInt();

        System.out.println("Max of the numbers is " + Math.max(number1,number2));
        System.out.println("Min of the numbers is " + Math.min(number1,number3));
        System.out.println("Max of the numbers is " + Math.max(Math.max(number1,number2), number3));
        System.out.println("Min of the numbers is " + Math.min(Math.min(number1,number2), number3));



    }
}

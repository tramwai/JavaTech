package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {
        System.out.println("Difference between your numbers is = " + Math.abs(10 -14));
        System.out.println("Difference between your numbers is = " + Math.abs(14 -10)); // difference
        System.out.println("Subtraction between your numbers is = " + (10 -14)); //subtraction

        // write a program that asks user 2 ages and gets the differnce between ages and print thme

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int age1 = input.nextInt();
        System.out.println("Enter the 2nd number ");
        int age2 = input.nextInt();

        System.out.println("Difference between your numbers is = " + Math.abs(age1 - age2));
        System.out.println("Max age is = " + Math.max(age1,age2));
        System.out.println("Min age is = " + Math.min(age1,age2));

    }
}

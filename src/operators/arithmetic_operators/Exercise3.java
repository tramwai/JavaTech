package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Calculate monthly payment asking user to enter yearly salary
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hey user, how much do you make yearly ?");
//        double yearlySalary;
//        yearlySalary = scanner.nextDouble();
//        double monthlySalary = yearlySalary / 12;
//        monthlySalary = yearlySalary / 12;
//        System.out.println("Your monthly payment is " + monthlySalary + " then!");


        //it can also be done this way
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, how much do you make? ");
        double yearlySalary = input.nextDouble();
        System.out.println("Your monthly payment is " + yearlySalary / 12 + "ten");


    }
}

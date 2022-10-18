package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their name and age and print the info in below format
        name's {age} is {age}.
         */

        System.out.println(ScannerHelper.getAName() + "'s age is " + ScannerHelper.getAnAge() +"." +
                "\nAddress is " + ScannerHelper.getAnAddress());

    }
}

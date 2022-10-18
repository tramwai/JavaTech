package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {
        /**
         Write a Java program that asks user to enter 2 strings
         And store answers of user in different String variables
         Finally, check if given 2 Strings are equal or not and print messages given below
         Test data 1:

         Hello World
         Expected output 1:
         These strings are not equal
         Test data 2:
         Hello
         Hello
         Expected output 2:
         These strings are equal
         */

        String s1 =ScannerHelper.getAString() ;
        String s2 =ScannerHelper.getAString() ;
        if(s1.equals(s2)) System.out.println("The strings are equal");
        else System.out.println("The strings are not equal");

        //         Alternative solution 1 //
//        System.out.println(ScannerHelper.getAString().equals(ScannerHelper.getAString()) ? "The strings are equal" : "The strings are not equal");
        // alternative solution 2
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter first string");
//        String str1 = input.nextLine();
//        System.out.println("Please enter second string");
//        String str2 = input.nextLine();
//        if(str1.equals(str2)){
//            System.out.println("The strings are equal");
//        }else
//            System.out.println("The strings are not equal");

    }
}

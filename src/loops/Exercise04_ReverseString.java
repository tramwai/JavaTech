package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise04_ReverseString {
    public static void main(String[] args) {
    /*
    Write a program that reverses the string
     */
        String name = ScannerHelper.getAName();
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0 ; i--) {
            reversedName += name.charAt(i);
        }
        System.out.println("the reversed name " + reversedName);
    }
}

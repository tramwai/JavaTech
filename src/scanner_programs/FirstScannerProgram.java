package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {
        String fName,lName;
        // 1. Create a scanner object           data type varName= value;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        fName = inputReader.next();

        System.out.println("Please enter your last name : ");
        lName = inputReader.next();
        System.out.println("Your full name is " + fName + " " + lName);


    }
}

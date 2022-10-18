package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNUmbersUsingScanner {
    public static void main(String[] args) {

        // Create program that asks user to enter number and print al odd numbers starting from 0 to given number by user
        // start point: 0
        // end point: given number
        // update: positive
       int number = ScannerHelper.getAnumber();
        System.out.println("The odd numbers from zero to " + number + " are:");
        for (int i = 0; i <= number ; i++) {
            if (i % 2 == 1)
            System.out.println(i);
        }
    }
}

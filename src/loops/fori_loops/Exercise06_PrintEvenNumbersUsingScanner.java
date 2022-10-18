package loops.fori_loops;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
         /*
    ask user to enter 2 different numbers. Print all the even numbers between the given numbers by user in ascending order

     */
        // start point: smallest number
        // end point: greatest number
        // Update: increment
        int num1 = ScannerHelper.getAnumber();
        int num2 = ScannerHelper.getAnumber();
        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2); i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }

    }


}

package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        printPosNeg(arr);

    }
    /**
 create a public static method which will take an arraylist and it will find the
 first positive and first negative number and print them.
 Example:
     ArrayList -> [0, -4, -7, 0, 5, 10, 45]
 Output:
     First positive number is: 5
     First negative number is: -4
  */
    public static void printPosNeg(ArrayList<Integer> numbers){
        int firstPos = 0;
        int firstNeg = 0;
        for (Integer n : numbers) {
            if (n > 0 && firstPos == 0){
                firstPos = n;
            }
            if (n < 0 && firstNeg == 0){
                firstNeg = n;
            }
        }
        System.out.println("First positive number is = " + firstPos);
        System.out.println("First negative number is = " + firstNeg);
    }
}

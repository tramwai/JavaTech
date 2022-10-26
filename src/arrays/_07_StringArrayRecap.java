package arrays;

import java.util.Arrays;

public class _07_StringArrayRecap {
    public static void main(String[] args) {
        // create a String array with length of 4
        String[] fruits = new String[4];
        // print array
        System.out.println(Arrays.toString(fruits));
        // assign "Apple" to index of 0
        // Assign "Kiwi" to indexof 3
       fruits[0] = "Apple";
       fruits[3] = "Kiwi";
        System.out.println(Arrays.toString(fruits));
        // orange to index 1 and grapes to index 2
        fruits[1] = "Orange";
        fruits[2] = "Grapes";
        System.out.println(Arrays.toString(fruits));

        System.out.println("\nReassigning values");
        // Reassign Apple to index of 3 to index of 2
        fruits[3] = fruits[0];
        fruits[2] = fruits[0];
        System.out.println(Arrays.toString(fruits));
        // change the orange with apple
        fruits[3] = fruits[0];
        fruits[2] = fruits[0];
        System.out.println(Arrays.toString(fruits));

        // print with for each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}

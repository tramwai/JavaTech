package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // 1.5, 2.3, -1.3, -3.7
        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);
        // change the values , sort
        Arrays.sort(decimals);
        System.out.println("Arras after sorting " + Arrays.toString(decimals));
        // print out the array in separate lines
        // When we need indexes or an increment to use
        System.out.println("\nFori loop");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }

        // When we don't need an increment number to use(indexes)
        System.out.println("\nForEach loop");
        for (double elements : decimals) {
            System.out.println(elements);
        }
        System.out.println("\n Fori loop print 2 arrays");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " - " + chars[i]);
        }



    }
}

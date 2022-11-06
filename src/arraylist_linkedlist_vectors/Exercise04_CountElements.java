package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {
        /**
        Count evens -> 3
        count odds -> 2
        count numbers that are more than 15 -> 3
         */

        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        System.out.println(numbers.stream().filter(number -> number % 2 == 1).count());
        System.out.println(numbers.stream().filter(x -> x > 15).count());
        System.out.println(numbers.stream().filter(x -> x != 20).count());



    }
}

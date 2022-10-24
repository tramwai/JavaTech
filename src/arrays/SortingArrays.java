package arrays;

import java.util.Arrays;



public class SortingArrays {
    public static void main(String[] args) {
        // sort()
        // -statc, void , it is overloaded, takes an array
        int[] numbers = {5, -1, 3, 10};
        String[] objects = {"remote", "computer", "Cup", "Phone"};
        System.out.println("\n--------before sorting-----------\n");
        System.out.println(Arrays.toString(numbers)); // [5, -1, 3, 10]
        System.out.println(Arrays.toString(objects)); // [remote, computer, Cup, Phone]
        System.out.println("\n--------after sorting-----------\n");
        Arrays.sort(numbers);
        Arrays.sort(objects);
        System.out.println(Arrays.toString(numbers)); // [-1, 3, 5, 10]
        System.out.println(Arrays.toString(objects)); // [Cup, Phone, computer, remote]

     }
}

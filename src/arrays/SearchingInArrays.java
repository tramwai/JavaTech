package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 10};
        // search for 7 and return true if it exists in this array. return false otherwise
        // Expected result false
        boolean has7 = false;
        for (int number : numbers) {
            if (number == 7) {
                has7 = true;
                break;
            }
        }
        System.out.println(has7);

        //Search for 5 and return true if it exists in this array, return false otherwise -> true
        boolean has5 = false;
        for (int number : numbers) {
            if (number == 5) {
                has5 = true;
                break;
            }
        }
        System.out.println(has5);

        System.out.println("\n---------Binary Search In arrays---------\n");
        /**
         NOTE: Binary Search can be used if the array is sorted only, otherwise you will get wrong results
            -Binary search returns the index of the element if found
            -if the index returned is zero or positive, it means the element exists
            -if the index returned is negative, this means the element doesn't exist
            -if 2 elements exist, then the method returns the last index
         */
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 9));


    }
}

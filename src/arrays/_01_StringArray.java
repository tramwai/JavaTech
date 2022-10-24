package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {
        // 1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. assigning values to specific indexes
        countries[1] = "Spain";

        // 3. Print a specific index from an array
        System.out.println(countries[1]); // spain

        // 4. print an array
        System.out.println(Arrays.toString(countries)); // [null, Spain, null]

        /*
        Assign belgium to index of [2]
         */
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries)); // [null, Spain, Belgium]

        // 5. Update existing elements
        countries[1] = "France";
        System.out.println(Arrays.toString(countries)); // [null, France, Belgium]

        // 6. Getting the length of an array - how many elements
        System.out.println(countries.length); //  NOT a Method ; 3 returns the numbers of elements

        // 7. Print each element separate
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);
        // Use loops
        for (int i = 0; i < 3; i++) {
            System.out.println("Country at index of " + i + " is " + countries[i]);
        }

    }
}

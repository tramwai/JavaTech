package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_forEach {
    public static void main(String[] args) {
        /**
            Create an ArrayList  to store below colors and print it
            "Blue", "Red", "Brown", "Pink", "Yellow", "Black"
         */
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red", "Brown", "Pink", "Yellow", "Black"));
        System.out.println(colors);
        System.out.println("---------Iterating with Fori loop -----------"); // traversing = iterating
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("---------Iterating with for Each loop -----------");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("---------Iterating with forEach() loop -----------");
        colors.forEach(System.out::println);


    }
}

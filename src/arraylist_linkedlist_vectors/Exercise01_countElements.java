package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static void main(String[] args) {
        System.out.println("============Task 1===========");
        /**
        Create an ArrayList and store below colors
        Blue, Brown, Pink, Yellow, Red, Purple
        Print the Array, the size, each element
        EXPECTED:
[Blue, Brown, Pink, Yellow, Red, Purple]
6
Blue
Brown
Pink
Yellow
Red
Purple
 */
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow","Red", "Purple" ));
        System.out.println(colors);
        System.out.println(colors.size());
        for (String color : colors) {
            System.out.println(color);

        }


        System.out.println("============Task 2===========");
        /**
        count the elements that have length of 6
        Expected: 2
         */
        System.out.println("For each loop solution");
        int count6 = 0;
        for (String color : colors) {
            if (color.length() == 6) count6++;
        }
        System.out.println(count6);

        System.out.println("fori loop solution");
        count6 = 0; // resetting the counter
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).length() == 6) count6++;
        }
        System.out.println(count6);

        System.out.println("============Task 3===========");
        /**
        count the elements that have 'o'
         */
        System.out.println("For each loop solution");
        int hasO = 0;
        for (String color : colors) {
            if (color.toLowerCase().contains("o")) hasO++;
        }
        System.out.println(hasO);

        System.out.println("fori loop solution");
        hasO = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).toLowerCase().contains("o")) hasO++;
        }
        System.out.println(hasO);

    }
}

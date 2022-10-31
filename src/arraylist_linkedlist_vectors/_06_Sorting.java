package arraylist_linkedlist_vectors;

import javafx.collections.transformation.SortedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _06_Sorting {
    public static void main(String[] args) {
        /**
        Create 2 LinkedList to store data
        1-> 10, -3, 5, 15
        2-> Remote, Phone, Laptop
        Print, Sort and Print again the LinkedList
         */
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));
        System.out.println("\nBefore Sort");
        System.out.println(numbers);
        System.out.println(objects);
        Collections.sort(numbers);
        Collections.sort(objects);
        System.out.println("\nAfter Sort");
        System.out.println(numbers);
        System.out.println(objects);



    }
}

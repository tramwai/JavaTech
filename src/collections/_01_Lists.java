package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class _01_Lists {
    public static void main(String[] args) {

        /**
        - insertion order is preserved
        - duplicates are allowed
        - null elements are allowed

        - performance
        - memory
        - initial capacity
        - Load
        - the way they store the data is different
         */



        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");
        System.out.println(fruits.element());
        System.out.println(fruits.getFirst());
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits.poll()); // null
        System.out.println(fruits.remove()); // NoSuchElementException



    }
}

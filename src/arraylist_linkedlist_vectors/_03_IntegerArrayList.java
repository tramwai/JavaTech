package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        /**
        Create an ArrayList to store below numbers
        10, 15, 20, 10, 20, 30
        Print the ArrayList and the size
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println(numbers.size());
        // remove() method
        numbers.remove((Integer) 10); // need to cast into an object - Wrapper
        System.out.println(numbers);
        // contains() method
        System.out.println(numbers.contains(10));
        System.out.println(numbers.contains(12));
        System.out.println(numbers.contains(20));
        System.out.println(numbers.contains(22));


        System.out.println("\n---------IndexOf() method -----------");
        System.out.println(numbers.indexOf(15)); //0
        System.out.println(numbers.indexOf(25)); // -1
        System.out.println(numbers.indexOf(20)); // 1

        System.out.println("\n---------LastIndexOf() method -----------");
        System.out.println(numbers.indexOf(30)); // 4
        System.out.println(numbers.indexOf(35)); // -1
        System.out.println(numbers.indexOf(10)); // 2

        System.out.println("\n---------Retrieve each element with fori loop -----------");

        // System.out.println(numbers.get(0)); ...
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n---------Retrieve each element with for each loop -----------");
        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}

package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {
        System.out.println("\n ---------Task 1---------");
        /**
        Create an ArrayList and store cities in i
        Chicago, Berlin, Miami
        Print the size, print the array
        EXPECTED:
        3
        [Chicago, Berlin, Miami]
         */

        ArrayList<String> cities = new ArrayList<>(); // capacity is 10 by default
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");
        System.out.println(cities.size());
        System.out.println(cities);


        System.out.println("\n ---------Task 2---------");
        /**
        Update Miami to be Evanston
        print the array
         */
        cities.set(2, "Evanston");
        System.out.println(cities);

        System.out.println("\n ---------Task 3---------");
        /**
        Remove Berlin and print the list and the size
         */
        cities.remove("Berlin");
      //  cities.remove(1);
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.remove(0));
       // cities.remove("Evanston");
        System.out.println(cities);
        System.out.println(cities.size());


        System.out.println("\n ---------Task 4---------");

        /**
        TASK
        Add below cities to ArrayList
        New York, Rome, Ghent
        Print the ArrayList
        Print the size
        EXPECTED:
        [Evanston, New York, Rome, Ghent]
        4
        */
        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.contains("Rome"));

        System.out.println("\n ---------Task 5---------");

        /**
        Remove all the elements from ArrayList
         */
        cities.clear();
       // cities.removeAll(cities);
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n ---------Task 6---------");


    }
}

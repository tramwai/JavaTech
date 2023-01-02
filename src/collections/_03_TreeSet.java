package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {

        // Create a TreeSet object
        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago", "Miami", "New York", "San Francisco", "LA"));
        // printing the object
        System.out.println(cities); // [Chicago, Los Angeles, Miami, New York, San Francisco]

        System.out.println(cities.headSet("Miami")); // [Chicago, LA]
        System.out.println(cities.headSet("Miami", true)); // [Chicago, LA, Miami]
        System.out.println(cities.tailSet("New York")); // [New York, San Francisco]
        System.out.println(cities.tailSet("New York", false)); // [San Francisco]

        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 2, 3, 7, 10));
        System.out.println(numbers);
        System.out.println(numbers.first());
        System.out.println(numbers);
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

        numbers.clear();
       //  System.out.println(numbers.last()); // NoSuchElementException
        System.out.println(numbers.first());   // NoSuchElementException
        System.out.println(numbers.pollLast()); // null
        System.out.println(numbers.pollFirst()); // null

    }
}

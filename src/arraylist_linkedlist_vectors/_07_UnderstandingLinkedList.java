package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.LinkedList;

public class _07_UnderstandingLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>(Arrays.asList(10.5, 5.5, 20.0));
        System.out.println(numbers); //[10.5, 5.5, 20.0]
        System.out.println(numbers.size()); // 3
        System.out.println(numbers.contains(10.5)); // true
        System.out.println(numbers.indexOf(4)); // -1
        System.out.println(numbers.get(1)); // 5.5
        System.out.println(numbers.getFirst()); // 10.5
        System.out.println(numbers);
        System.out.println(numbers.getLast());
        System.out.println(numbers);
        System.out.println(numbers.offer(4.5));
        System.out.println(numbers);
        System.out.println(numbers.offerLast(2.0));
        System.out.println(numbers);
        System.out.println(numbers.peek());
        System.out.println(numbers);
        System.out.println(numbers.peekLast());
        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers);// retrieves and removes the head of the list
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);
        System.out.println(numbers.pop()); // removes and returns the first element
        System.out.println(numbers);
        System.out.println(numbers.pollLast());
        System.out.println(numbers);
        numbers.push(2.0); // adds an element to the index 0;
        System.out.println(numbers);
        numbers.removeFirstOccurrence(2.0);
        System.out.println(numbers);


    }
}

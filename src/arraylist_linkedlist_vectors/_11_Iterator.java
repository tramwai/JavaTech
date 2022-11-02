package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _11_Iterator {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>(Arrays.asList("Pizza", "Pasta", "Burger", "Lamb Chops", "salad", "Sushi", "Falafel"));
        /*
        Remove the element that has 5 characters
        Print the list
        Expected: [Burger, Lamb chops, Falafel]
         */

//        food.removeIf(x -> x.length() == 5);
//        System.out.println(food);

        Iterator<String> foodIterator = food.iterator();

        while (foodIterator.hasNext()){
            String f = foodIterator.next();
            if (f.length() == 5) foodIterator.remove();
        }
        System.out.println(food);
    }
}

package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"));
        /*
        Remove elements that contain "book" - this is case-insensitive
        print the list
        Expected: [Pen, Pencil]
         */
        Iterator<String> someObjects = objects.iterator(); // put them in a queue(in line)
        while (someObjects.hasNext()){
            String s = someObjects.next();
            if (s.toLowerCase().contains("book")) someObjects.remove();
        }
        System.out.println(objects);
        
    }
}

package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArraylist {
    public static void main(String[] args) {
        // 1. Declaring an array vs ArrayList
        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); // default capacity = 10 elements

        // 2. Getting the size of the array vs ArrayList
        System.out.println("\n -------Size of array vs ArrayList");
        System.out.println("The size of the array is " + names1.length); // 3
        System.out.println("The size of the ArrayList is " + names2.size()); // 0


        // 3. Printing an array vs an ArrayList
        System.out.println("\n -------Print array vs ArrrayList");
        System.out.println("the array is = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2);

        // 4. Adding element to specific indexes
        names1[0] = "Alex";
        names2.add(0, "John ");
        System.out.println("\n -------Print array vs ArrayList");
        System.out.println("the array is = " + Arrays.toString(names1)); // [Alex, null, null]
        System.out.println("The ArrayList = " + names2);

        /*
        Add Ali and Andrii to names1
       Add Joe and Jane to names2
       Print names1 and names2 again
         */
        names1[1] = "Ali";
        names1[2] = "Andrii";
        names2.add("Joe");
        names2.add("Jane");
        System.out.println("the array is = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);


        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println(names2);
        System.out.println("The size of the ArrayList is " + names2.size());

        // 5. Updating an existing element in array vs ArrayList
        names1[1] = "Mike";
        names2.set(1, "Olena");
        names2.add(10, "");



    }
}

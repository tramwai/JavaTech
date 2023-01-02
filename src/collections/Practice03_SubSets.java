package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice03_SubSets {
    public static void main(String[] args) {
        /**
        Create a collection to store below numbers
        3, 2, 7, 10, 15, 20, 7, 5
        Find all the elements more than 7 -> [10, 15, 20]
        Find all the elements less than or equal to 5 -> [2, 3, 5]
        Find all the elements between 5 and 15 both inclusive -> [5, 7, 10, 15]
         */

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 2, 7, 10, 15, 20, 7, 5));
        System.out.println(treeSet.tailSet(7, false)); // [10, 15, 20]
        System.out.println(treeSet.headSet(5, true)); // [2, 3, 5]
        System.out.println(treeSet.subSet(5, true, 15, true)); // [5, 7, 10, 15]

        // how many elements are bigger than 7?
        System.out.println(treeSet.tailSet(7, false).size()); // 3
        System.out.println(Arrays.toString(lessThenN(treeSet.toArray(new Integer[0]), 7)));
    }
    public static Integer[] lessThenN(Integer[] arr, int n){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        return set.headSet(n, true).toArray(new Integer[0]);
    }
}


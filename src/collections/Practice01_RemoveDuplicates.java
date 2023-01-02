package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, 1, 2, 5})));

    }

    /**
    Create a method that takes an array of numbers below
    -5, 10, -5, 10, 1, 2, 5
    Remove all duplicates and return a new array
     Expected Results:
     [-5, 10, 1, 2, 5]
     */

    public static Integer[] removeDuplicates(Integer[] arr){
        // Integer array -> Integer List -> LinkedHashSet -> Object array -> Integer array
         return new LinkedHashSet<>(Arrays.asList(arr)).toArray((new Integer[0]));
        // sorted - convert to TreeSet
        // return new TreeSet<>(Arrays.asList(arr)).toArray((new Integer[0]));

//        LinkedHashSet<Integer> nums = new LinkedHashSet<>(Arrays.asList(arr));
//        Integer[] newArray = nums.toArray(nums.toArray(new Integer[0]));
//        return newArray;
    }

//    old version o solving
//    public static Integer[] removeDuplicates(Integer[] arr){
//        ArrayList<Integer> uniques = new ArrayList<>();
//        for (Integer i : arr) {
//            if (!uniques.contains(i)) uniques.add(i);
//        }
//        return uniques.toArray(new Integer[0]);
//    }

}

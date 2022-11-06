package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {
ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("banana", "orange", "Apple"));
ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("banana, orange, apple"));
ArrayList<String> fruits3 = new ArrayList<>(Arrays.asList("pineapple", "banana", "orange", "grapes"));



        System.out.println(containsApple(fruits1));
    }
    /**
     * create a public static method which will take an arraylist then it will check it is
     * containing "apple".
     * NOTE: IGNORE CASES
     * Example:
     * ArrayList -> {"banana", "orange", "Apple"} ==> true
     * ArrayList -> {"banana", "orange", "apple"} ==> true
     * ArrayList -> {"pineapple", "banana", "orange", "grapes} ==> false
     */
    public static boolean containsApple(ArrayList<String> fruits){
        for (String fruit : fruits) {
            if (fruit.toLowerCase().equalsIgnoreCase("apple")) return true;
        }
        return false;
    }
    // another way
    public static boolean containsAppleEasier(ArrayList<String> fruits) {
        // it will fail with "APLLE" or AApLe
        return (fruits.contains("apple") || fruits.contains("Apple"));
    }
    // solve with fori loop
    public static boolean containsAppleFori(ArrayList<String> fruits) {

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equalsIgnoreCase("apple")) return true;
        }
        return false;
    }


}

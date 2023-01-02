package collections;

import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {

        System.out.println("\n===========Task 1=============\n");
        /**
        Given a String as "banana", print all duplicated letters
        Expected
        a, n
         */

        String str = "banana";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        System.out.println(map);
        // check the entry if the entry value is > 1, then print the key of the entry
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1) System.out.println(entry.getKey());
        }


        System.out.println("\n===========Task 2=============\n");
        System.out.println(getMostCounted(null));
        System.out.println(getMostCounted(""));
        System.out.println(getMostCounted("a"));
        System.out.println(getMostCounted("banana"));
        System.out.println(getMostCounted("apple"));
        System.out.println(getMostCounted("papa"));
        System.out.println(getMostCounted("abcabcabcabc"));
        System.out.println(getMostCounted("Maps are hard but useful"));

    }

    /**
     Create a method that takes a string as an argument, and it returns the char that occurs the most
     if there is more that one char that is counted the most, then return all; if string is empty or null, return nothing
     "" -> []
     null -> []
     "banana" -> a
     "apple" -> p
     "papa" [p, a]
     "abcabcabcabc" -> [a, b, c]
     */

    public static Set<Character> getMostCounted(String str) {
        /*
        1. count all the unique chars "abcabcabc"
        Key    values
        a       3
        b       3
        c       3
        2.Find the max occurrence  // 3
        3. loop through the occurrence and find the chars that have the max count, put them in a collection and return
         */
        Set<Character> result = new LinkedHashSet<>();
        if ( str == null || str.isEmpty()) return result;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        //  1. count all the unique chars
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        // 2.Find the max occurance
        int maxCount = new TreeSet<>(map.values()).last();

        // 3. loop through the occurence and find the chars that have the max count, put them in a collection and return
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == maxCount) result.add(entry.getKey());
        }
        return result;
    }


}

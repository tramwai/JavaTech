package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {
        /**
        Assume you have an ArrayList of languages
        Java, JavaScript, Ruby, Go, Ruby, Java, Java
         */
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Ruby", "Go", "Ruby", "Java", "Java"));
//        ArrayList<String> uniques = new ArrayList<>();
//        for (String language : languages) {
//            if (!uniques.contains(language)) uniques.add(language);
//        }
//        System.out.println(uniques);
        System.out.println(new HashSet<>(languages));

    }
}

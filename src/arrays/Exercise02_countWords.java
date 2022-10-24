package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {
        /**
        Assume you are given below string
        String sentence = "I love arrays";
        Count how many words you have in the string
        Expected: 3
         */
        // toCharArray solution
        char ch;
        String sentence = "I love arrays";
       int wordCount = 1;
        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) wordCount++;
        }
        System.out.println(wordCount);
        // fori loops solution
        int countS = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') countS++;
        }
        System.out.println(countS + 1);

        // split solution
        // [I, Love, arrays]
        System.out.println(sentence.split(" ").length);
    }
}

package arrays;

import java.util.Arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {
        /**
        Assume you are given a string
        String word = "Java";
        Count how many 'a' letters are int the string
        Expected: 2
//         */
//        int countA = 0;
//        String word = "Java";
//        for (int i = 0; i < word.length(); i++) {
//           if(word.charAt(i) == 'a') countA++;
//        }
//        System.out.println(countA);

        // char Array [J, a, v, a]
        String word = "Java";
        int countA = 0;
        for (char element : word.toCharArray()) {
            if (element == 'a') countA++;
        }
        System.out.println(countA);
    }
}

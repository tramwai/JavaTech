package arrays;

import java.util.Arrays;

public class _11_charArray_Recap {
    public static void main(String[] args) {
        // Create a char array which will hold your name's letters with both ways
        char[]  initials =  new char[5];
        initials[0] = 'M';
        initials[1] = 'i';
        initials[2] = 'h';
        initials[3] = 'a';
        initials[4] = 'i';
        System.out.println(Arrays.toString(initials));
    // 2nd way
         char[] initials2 = {'M', 'i', 'h', 'a', 'i'};
         // reassign
        initials[0] = 'm';
        initials[0] = initials[4];
        initials[2] = initials[4];
        System.out.println(Arrays.toString(initials));

        // print name in initials2
        for (char in : initials2) {
            System.out.print(in);
        }
        // with fori loop
        for (int i = 0; i < initials2.length; i++) {
            System.out.print(initials2[i]);
        }

        // get sum of first 3 elements, sum of last 5
    }
}

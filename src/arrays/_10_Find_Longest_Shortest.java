package arrays;

import java.util.Arrays;

public class _10_Find_Longest_Shortest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};
        printLongestShortest(colors);
    }

    /**
create a public static method which will take a String array then it will print the longest and shortest
string from that array.

Example:
Array ->  String[] colors = {"red", "blue", "yellow", "white"};

Output:
    Shortest = red
    Longest = yellow

 */

    public static void printLongestShortest (String[] strings){
       /*
       Pseudo code
       1. containers -> one for small, another for big one
       2. loop -> fori loop, increment, two if conditions
       3. print
        */
        String shortStr = strings[0], longStr = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (longStr.length() < strings[i].length()) { // if my current longStr is smaller than current str - > reassign it
                longStr = strings[i];
            }
            if (shortStr.length() > strings[i].length()){ // if my current shortStr is longer than current str, reassign it
                shortStr = strings[i];
            }
        }
        System.out.println("Longest = " + longStr);
        System.out.println("Shortes = " + shortStr);
    }
}

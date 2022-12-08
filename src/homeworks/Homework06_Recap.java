package homeworks;

import javax.swing.*;
import java.util.Arrays;

public class Homework06_Recap {
    public static void main(String[] args) {
        System.out.println("=========Task 11==========");
        /**
         Requirement:
         -Create 2 int arrays that stores numbers below
         First -> 5, 8, 13, 1, 2
         Second -> 9, 3, 67, 1, 0

         THEN:
         -Print both arrays
         –Then, create a new array called that will take greatest of same index from first 2 arrays
         -Print third array as well

         Expected Result:
         1st array is =  [5, 8, 13, 1, 2]
         2nd array is = [9, 3, 67, 1, 0]
         3rd array is =  [9, 8, 67, 1, 2]
         */

        int[] firstArr = {5, 8, 13, 1, 2};
        int[] secondArr = {9, 3, 67, 1, 0};
        int[] thirdArr = new int[5];
        for (int i = 0; i < thirdArr.length; i++) {
            thirdArr[i] =  Math.max(firstArr[i],secondArr[i]);
        }
        System.out.println("1st array is = " + Arrays.toString(firstArr));
        System.out.println("2nd array is = " + Arrays.toString(secondArr));
        System.out.println("3rd array is = " + Arrays.toString(thirdArr));

        System.out.println("\n==========Task 10==========\n");
        /**
         Requirement:
         -Create an int array that stores numbers below
         3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78

         THEN:
         -Print the entire array
         -Print how many elements are more than 10
         -Print how many elements are less than 10
         -Print how many elements are 10

         Expected Result:
         [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
         Elements that are more than 10 = 5
         Elements that are less than 10 = 4
         Elements that are 10 = 2
         */
        int[] numArr = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numArr));
        int moreThanTen = 0;
        int lessThanTen = 0;
        int isTen = 0;
        for (int i : numArr) {
            if (i > 10) moreThanTen++;
            else if (i < 10) lessThanTen++;
            else isTen++;
        }
        System.out.println("Elements that are more than 10 = " + moreThanTen);
        System.out.println("Elements that are less than 10 = " + lessThanTen);
        System.out.println("Elements that are 10 = " + isTen);


        System.out.println("\n==========Task 9==========\n");
        /**
         Requirement:
         -Create a String array that stores objects below
         Pen, notebook, Book, paper, bag, pencil, Ruler

         THEN:
         -Print the entire array
         -Print how many elements starts with uppercase
         -Print how many elements starts with lowercase
         -Print how many elements starts with B or P, ignoring cases
         -Print how many elements has “book” or “pen” in it, ignoring cases

         Expected Result:
         [Pen, notebook, Book, paper, bag, pencil, Ruler]
         Elements starts with uppercase = 3
         Elements starts with lowercase =4
         Elements starting with B or P = 5
         Elements having ”book” or “pen”= 4
         */
        String[] strArr = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int startsWithUpper = 0;
        int startsWithLower = 0;
        int startSWitBOrP = 0;
        int containsBookOrPen = 0;
        for (String s : strArr) {
            if (Character.isUpperCase(s.charAt(0))) startsWithUpper++;
            else startsWithLower++;
            if (s.toLowerCase().charAt(0) == 'b' || s.toLowerCase().charAt(0) == 'p') startSWitBOrP++;
            if (s.toLowerCase().contains("book") || s.toLowerCase().contains("pen")) containsBookOrPen++;
        }
        System.out.println(Arrays.toString(strArr));
        System.out.println("Elements starts with uppercase = " + startsWithUpper);
        System.out.println("Elements starts with lowercase = " + startsWithLower);
        System.out.println("Elements starting with B or P = " + startSWitBOrP);
        System.out.println("Elements having ”book” or “pen”= " + containsBookOrPen);

        System.out.println("\n==========Task 8==========\n");
        /**
         Requirement:
         -Create a char array that stores characters below
         A, b, G, H, 7, 5, &, *, e, @, 4

         THEN:
         -Print the entire array
         -Print the total count of the letters
         -Print the total count of lowercase letters
         -Print the total count of uppercase letters
         -Print the total count of digits
         -Print the total count of special characters

         Expected Result:
         [A, b, G, H, 7, 5, &, *, e, @, 4]
         Letters = 5
         Uppercase letters = 3
         Lowercase letters = 2
         Digits = 3
         Special characters = 3
         */
        char[] charArr = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(charArr));
        int uLetters = 0;
        int lLetters = 0;
        int digits = 0;
        int special = 0;
        for (char c : charArr) {
            if (Character.isUpperCase(c)) uLetters++;
            else if (Character.isLowerCase(c)) lLetters++;
            else if (Character.isDigit(c)) digits++;
            else if (!Character.isWhitespace(c)) special++;
        }
        System.out.println("Letters = " + (uLetters + lLetters));
        System.out.println("Uppercase letters = " + uLetters);
        System.out.println("Lowercase letters = " + lLetters);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + special);

        System.out.println("\n==========Task 7==========\n");
        /**
         Requirement:
         -Create a double array that stores numbers below
         10.5, 20.75, 70, 80, 15.75

         THEN:
         -Print the entire array
         -Print each element

         Expected Result:
         [10.5, 20.75, 70, 80, 15.75]
         10.5
         20.75
         70
         80
         15.75
         */
        double[] doubleArr = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(doubleArr));
        for (double v : doubleArr) {
            if (v % (int)v == 0) System.out.println((int)v);
            System.out.println(v);
        }

        System.out.println("\n==========Task 6==========\n");
        /**
         Requirement:
         -Create a String array that stores cartoon cats below
         Garfield, Tom, Sylvester, Azrael

         THEN:
         -Print the entire array sorted lexicographically
         -Then, check if it contains Garfield and Felix
         if it contains both, then print true
         if it does not contain both, print false

         Expected Result:
         [Azrael, Garfield, Sylvester, Tom]
         false
         */
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        boolean containsGarfield = false;
        boolean containsFelix = false;
        boolean containsBoth = false;
//        for (String cartoonCat : cartoonCats) {
//            if (cartoonCat.equals("Garfield")) containsGarfield = true;
//            else if(cartoonCat.equals("Felix")) containsFelix = true;
//            if (containsGarfield && containsFelix)
//                containsBoth = true;
//           break;
//        }
//        System.out.println(Arrays.toString(cartoonCats));
//        System.out.println(containsBoth);

        System.out.println(Arrays.asList().contains("Garfield") && Arrays.asList().contains("Felix"));
    }
}

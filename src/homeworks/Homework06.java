package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("==========Task 1==========");
        /**
        Requirement:
        -Create an int array having size of 10
        -Assign 23 to index of 2
        -Assign 12 to index of 4
        -Assign 34 to index of 7
        -Assign 7 to index of 9
        -Assign 15 to index of 6
        -Assign 89 to index of 0

        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 9
        -Print the entire array

        Expected Result:
        0
        89
        7
        [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
         */

        int[] task1 = new int[10];
        task1[2] = 23;
        task1[4] = 12;
        task1[7] = 34;
        task1[9] = 7;
        task1[6] = 15;
        task1[0] = 89;
        System.out.println(task1[3]);
        System.out.println(task1[0]);
        System.out.println(task1[9]);
        System.out.println(Arrays.toString(task1));

        System.out.println("\n==========Task 2==========\n");
        /**
        Requirement:
        -Create a String array having size of 5
        -Assign “abc” to index of 1
        -Assign “xyz” to index of 4

        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 4
        -Print the entire array

        Expected Result:
        null
        null
        xyz
        [null, abc, null, null, xyz]
         */
        String[] task2 = new String[5];
        task2[1] = "abc";
        task2[4] = "xyz";
        System.out.println(task2[3]);
        System.out.println(task2[0]);
        System.out.println(task2[4]);
        System.out.println(Arrays.toString(task2));

        System.out.println("\n==========Task 3==========\n");
        /**
            Requirement:
            -Create an int array that stores numbers below
            23, -34, -56, 0, 89, 100

            THEN:
            -Print the entire array
            -Print the entire array sorted in ascending order

            Expected Result:
            [23, -34, -56, 0, 89, 100]
            [-56, -34, 0, 23, 89, 100]
            */
        int[] task3 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(task3));
        Arrays.sort(task3);
        System.out.println(Arrays.toString(task3));

        System.out.println("\n==========Task 4==========\n");
        /**
        Requirement:
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania

        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically

        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine]
         */

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n==========Task 5==========\n");
        /**
        Requirement:
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky

        THEN:
        -Print the entire array
        -Then, check if it contains Pluto
            if it contains Pluto, then print true
            if it does not contain Pluto, print false

        Expected Result:
        [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
         */
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };
        System.out.println(Arrays.toString(cartoonDogs));
        Arrays.sort(cartoonDogs);
        System.out.println(Arrays.binarySearch(cartoonDogs, "Pluto") >= 0);


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
        System.out.println(Arrays.toString(cartoonCats));
        System.out.println(Arrays.binarySearch(cartoonCats, "Garfield") >= 0 &&
                Arrays.binarySearch(cartoonCats, "Felix") >= 0);

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

        double[] numbersTask7 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbersTask7));
        for (double element : numbersTask7) {
            System.out.println(element);
        }

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
        char[] task8 = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(task8));
        int letters = 0,
            upperCase = 0,
            lowerCase = 0,
            digits = 0,
                whiteSpaceChars = 0;

        for (char total : task8) {
            if (Character.isLetter(total)) letters++;
            if(Character.isUpperCase(total)) upperCase++;
            if(Character.isLowerCase(total)) lowerCase++;
            if (Character.isDigit(total)) digits++;
            if (Character.isSpaceChar(total)) whiteSpaceChars++;
        }

        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + upperCase);
        System.out.println("Lowercase letters = " + lowerCase);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + (task8.length - letters - digits - whiteSpaceChars));

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
        String[] task9 = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(task9));
        int startUpperCase = 0,
             startLowerCase = 0,
             startWithBOrP = 0,
             bookOrPen = 0;
        for (String objects : task9) {
            if (Character.isUpperCase(objects.charAt(0))) startUpperCase++;
            if (Character.isLowerCase(objects.charAt(0))) startLowerCase++;
            if (objects.toLowerCase().charAt(0) == 'b' || objects.toLowerCase().charAt(0) == 'p') startWithBOrP++;
            if (objects.toLowerCase().contains("book") || objects.toLowerCase().contains("pen")) bookOrPen++;
        }
        System.out.println("Elements starts with uppercase = " + startUpperCase);
        System.out.println("Elements starts with lowercase = " + startLowerCase);
        System.out.println("Elements starting with B or P = " + startWithBOrP);
        System.out.println("Elements having ”book” or “pen”= " + bookOrPen);

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
        int[] task10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(task10));
        int moreThan10 = 0;
        int lessThan10 = 0;
        int ten = 0;
        for (int number : task10) {
            if (number > 10) moreThan10++;
            if (number < 10) lessThan10++;
            if (number == 10) ten++;
        }
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + ten);

        System.out.println("\n==========Task 11==========\n");
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
        int[] firstArray = {5, 8, 13, 1, 2};
        int[] secondArray = {9, 3, 67, 1, 0};
        System.out.println("1st array is = " + Arrays.toString(firstArray));
        System.out.println("2nd array is = " + Arrays.toString(secondArray));
        int[] thirdArray = new int[5];
        for (int i = 0; i < 5  ; i++) {
            thirdArray[i] = Math.max(firstArray[i], secondArray[i]);
        }
        System.out.println("3rd array is = " + Arrays.toString(thirdArray));

    }
}

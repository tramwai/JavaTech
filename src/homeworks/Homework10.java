package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework10 {
    // Task1
    /**
    Requirement:
Write a method countWords() that takes a String as an argument, and returns how many words there are in the the given String
Test data 1:
String str = “      Java is fun       ”;
Expected output 1:
3
Test data 2:
String str = “Selenium is the most common UI automation tool.   ”;
Expected output 2:
8
NOTE: Make your code dynamic that works for any given String
NOTE: Be careful about empty String
NOTE: Be careful about before and after white spaces
     */
    public static int countWords(String str){
        int wordCount = 1;
        String trimmedStr = str.trim();
        for (int i = 0; i < trimmedStr.length() - 1; i++) {
            if (trimmedStr.charAt(i) == ' ') wordCount++;
        }
        return wordCount;
    }

    // Task 2
    /**
    Requirement:
Write a method countA() that takes a String as an argument, and returns how many A or a there are in the the given String
Test data 1:
String str = “TechGlobal is a QA bootcamp”;
Expected output 1:
4
Test data 2:
String str = “QA stands for Quality Assurance”;
Expected output 2:
5
NOTE: Make your code dynamic that works for any given String
NOTE: Be careful about empty String
NOTE: Be careful about uppercase and lowercase
     */

    public static int countA(String str){
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
            //if (Character.toLowerCase(str.charAt(i)) == 'a') countA++;
        }
        return countA;
    }

    // Task 3
    /**
    Requirement:
Write a method countPos() that takes an ArrayList of Integer as an argument, and returns how many
elements are positive
Test data 1:
[-45, 0, 0, 34, 5, 67]
Expected output 1:
3
Test data 2:
[-23, -4, 0, 2, 5, 90, 123]
Expected output 2:
4
NOTE: Make your code dynamic that works for any given ArrayList of Integer
     */

    public static int countPos(ArrayList<Integer> array){


        int countPositives = 0;
        for (Integer element : array) {
            if (element > 0) countPositives++;
        }
        return countPositives;
    }

    // Task 4
    /**
    Requirement:
Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
and returns it back with removed duplicates
Test data 1:
[10, 20, 35, 20, 35, 60, 70, 60]
Expected output 1:
[10, 20, 35, 60, 70]
Test data 2:
[1, 2, 5, 2, 3]
Expected output 2:
[1, 2, 5, 3]
NOTE: Make your code dynamic that works for any given ArrayList of Integer
     */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> removed = new ArrayList<>();
        for (Integer element : numbers) {
            if (!removed.contains(element)) removed.add(element);
        }
        return removed;
    }

    // Task 5
/**
Requirement:
Write a method removeDuplicateElements() that takes an ArrayList of String as an argument, and returns it back with removed duplicates
Test data 1:
[“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
Expected output 1:
[“java”, “C#”, “ruby”, “JAVA”,  “C++”]
Test data 2:
[“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]
Expected output 2:
[“abc”, “xyz”, “123”, “ab”, “ABC”]
NOTE: Make your code dynamic that works for any given ArrayList of String
NOTE: Be careful about lowercase and uppercases, this method is case sensitive
 */
public static ArrayList<String> removeDuplicateElements(ArrayList<String> listTask5){
    ArrayList<String> uniques = new ArrayList<>();
    for (String element : listTask5) {
        if (!uniques.contains(element)) uniques.add(element);
    }
    return uniques;
}
// Task 6
/**
Requirement:
Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces
Test data 1:
String str = “   I   am      learning     Java      ”;
Expected output 1:
I am learning Java
Test data 2:
String str = “Java  is fun    ”;
Expected output 2:
Java is fun
NOTE: Make your code dynamic that works for any given String
NOTE: Be careful about empty String
NOTE: Be careful about before and after white spaces
 */
public static String removeExtraSpaces(String str){
    // regex solution nr1
    return str.trim().replaceAll(" +", " ");
    // regex solution nr2
    // return str.trim().replaceAll("\\s{1,}", " ");
    // standard solution
//    String[] str1 = str.trim().split(" ");
//    String strContainer = "";
//    for (String element : str1){
//        if(!(element.isEmpty())) strContainer += (element + " ");
//    }
//    return strContainer.trim();
}

// Task 7
    /**
    Requirement:
    Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};
    Expected output 1:
    [9, 3, 2, 7, 5, 10]
    Test data 1:
    int[] arr1 =  {10, 3, 6, 3, 2};
    int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
    Expected output 1:
    [16, 11, 9,  3, 2, 7, 5, 10, 34]
    NOTE: Make your code dynamic that works for any given arrays
    NOTE: You will assume that length of arrays are always more than zero
    NOTE: Be careful about arrays length, if they were equal, it would be an easy task, but they can be different as given in the example above.
     */





    public static int[] sum(int[] array1, int[] array2){
        int[] sum = new int[Math.max(array1.length, array2.length)];
        int[] longer;
        if (array1.length > array2.length) longer = array1;
        else longer = array2;
        for (int i = 0; i < sum.length; i++) {
            if (i < Math.min(array1.length, array2.length)) sum[i] = array1[i] + array2[i];
            else sum[i] = longer[i];
        }
        return sum;
    }

// Task8
    /**
    Requirement:
    Write a method findClosestTo10() that takes an int[] array as an argument, and returns the closest element to 10 from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
    8
    NOTE: You will assume that length of array is always more than zero
    NOTE: Make your code dynamic that works for any given int[] array
    NOTE: Be careful about element to be 10 (ignore it)
    NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in this case return smallest which is 8
     */

    public static int findClosestTo10(int[] array){
        Arrays.sort(array);

        int closest10 = Integer.MAX_VALUE;
        int leastDist = Math.abs(10 - closest10);
        for (int i = 0; i < array.length; i++) {
            int currentDist = Math.abs(10 - array[i]);
            if(currentDist < leastDist && currentDist > 0)
                closest10 = array[i];
            leastDist = currentDist;
        }
        return closest10;
    }




    public static void main(String[] args) {

        System.out.println("\n=============Task 1==================\n");
        String str1Task1 = "      Java is fun       ";
        String str2Task1 = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str1Task1));
        System.out.println(countWords(str2Task1));

        System.out.println("\n=============Task 2==================\n");
        String str1Task2 = "TechGlobal is a QA bootcamp";
        String str2Task2 = "QA stands for Quality Assurance";
        System.out.println(countA(str1Task2));
        System.out.println(countA(str2Task2));

        System.out.println("\n=============Task 3==================\n");
        ArrayList<Integer> arr1Task3 = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        ArrayList<Integer> arr2Task3 = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(arr1Task3));
        System.out.println(countPos(arr2Task3));

        System.out.println("\n=============Task 4==================\n");
        ArrayList<Integer> arr1Task4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        ArrayList<Integer> arr2Task4 = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(arr1Task4));
        System.out.println(removeDuplicateNumbers(arr2Task4));


        System.out.println("\n=============Task 5==================\n");
        ArrayList arr1Task5 =  new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(arr1Task5));
        ArrayList arr2Task5 =  new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println(removeDuplicateElements(arr2Task5));

        System.out.println("\n===============Task 6==================\n");
        String strTask6 = "   I   am      learning     Java     ";
        System.out.println(removeExtraSpaces(strTask6));
        String str2Task6 = "Java  is fun    ";
        System.out.println(removeExtraSpaces(str2Task6));


        System.out.println("\n===============Task 7==================\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(sum(arr1, arr2)));
        int[] arr3 =  {10, 3, 6, 3, 2};
        int[] arr4 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(sum(arr3, arr4)));

        System.out.println("\n===============Task 8 ==================\n");
        int[] numbers1Task8 = {10, -13, 5, 70, 15, 57};
        int[] numbers2Task8 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(numbers1Task8));
        System.out.println(findClosestTo10(numbers2Task8));

    }
}

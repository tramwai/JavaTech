package homeworks.projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    /**
    TASK-1 - findClosestDistance() method
•Write a method that takes a int[] array as an argument and returns the closest difference between the numbers
•This method will return an int which is the closest difference between 2 elements in the array
•NOTE: if array does not have at least 2 elements, then return -1.
Test data1:
[4]
Expected output:
-1
-The reason the result is -1 for above example is because the array length is less than 2
 and we return -1 in this case.
Test data2:
[4, 8, 7, 15]
Expected output:
1
-The reason the result is 1 for above example is because 8 and 7 are closest elements in the array
 and the difference between them is 1.
Test data2:
[10, -5, 20, 50, 100]
Expected output:
10
The reason the result is 1 for above example is because 10 and 20 are closest elements in the array
and the difference between them is 10.
     */
public static int findClosestDistance(int[] array){

    // Return -1 if array is null or has fewer than 2 elements
    if (array.length < 2) return -1;
    // Initialize closest difference to the maximum possible value
    int closestDiff = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            // Calculate the difference between the current elements
            int diff = Math.abs(array[i] - array[j]);
            // Update the closest difference if the current difference is smaller
            closestDiff = Math.min(closestDiff, diff);
        }
    }
    return closestDiff;
//    Arrays.sort(array);
//    int arrSize = array.length;
//    int minDist = array[arrSize - 1];
//    if (array.length < 2) return -1;
//    for(int i=0; i < arrSize - 1; i++) {
//        minDist = Math.min(minDist, array[i + 1] - array[i]);
//    }
//    return minDist;
}

    // Task 2
    /**
    TASK-2 – findSingleNumber() method
    Write a method that takes a int[] array as an argument and returns the element that occurs only once.
    You will be given a non-empty array in which all the elements appears twice except for one.
    Test data 1:
    [2]
    Expected output 1:
    2
    Test data 2:
    [5, 3, -1, 3, 5, 7, -1]
    Expected output 2:
    7
     */

    public static int findSingleNumber(int[] array){
        // Sort the array in ascending order
        Arrays.sort(array);
        // Iterate through the array and return the element that does not have a matching element next to it
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] != array[i + 1]) {
                return array[i];
            }
        }
        // If all elements have a matching element next to them, return the last element
        return array[array.length - 1];
    }


    /**
    TASK-3 - findFirstUniqueCharacter() method
    Write a method that takes a non-empty String as an argument and returns the first unique character in the String.
    This method returns a char.
    If there is no unique character in the String, then return space by default.
    This task is case-sensitive.
    Test data 1:
    Hello
    Expected output 1:
    H
    Test data 2:
    abc abc d
    Expected output 2:
    d
    Test data 3:
    abab
    Expected output 3:
    Space
     */
    public static char findFirstUniqueCharacter(String str){

        // Create an array of boolean values to store which characters have been seen before
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the current character is unique by
            // comparing it to every other character in the string
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                // Skip the current character itself
                if (i == j) continue;
                if (ch == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            // Return the unique character
            if (isUnique) return ch;
        }
        // If no unique character is found, return space by default
        return ' ';
    }

    /**
    TASK-4 – findMissingNumber() method
    Write a method that takes a int[] array as an argument and returns the missing element.
    You will be given an array length of 2 at least.
    Array elements will be representing a sequence of numbers that increases by 1.
    Test data 1:
    [2, 4]
    Expected output 1:
    3
    Test data 2:
    [2, 3, 1, 5]
    Expected output 2:
    4
    Test data 3:
    [4, 7, 8, 6]
    Expected output 2:
    5
     */

    public static int findMissingNumber(int[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);
        // Iterate through the array and return the first element that is not one greater than the previous element
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i] - 1;
            }
        }
        // If all elements are one greater than the previous element, return the last element + 1
        return array[array.length - 1] + 1;
    }


    public static void main(String[] args) {

        System.out.println("=========Task 1==========");
        int[] arr1Task1 = {4};
        System.out.println(findClosestDistance(arr1Task1));
        int[] arr2Task1 = {4, 8, 7, 15};
        System.out.println(findClosestDistance(arr2Task1));
        int[] arr3Task1 = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(arr3Task1));

        System.out.println("=========Task 2==========");
        int[] arr1Task2 = {2, 3, 3, 5, 5, 6, 6};
        System.out.println(findSingleNumber(arr1Task2));
        int[] arr2Task2 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(arr2Task2));

        System.out.println("=========Task 3==========");
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter("abab"));

        System.out.println("=========Task 4==========");
        int[] arr1Task4 = {2, 4};
        System.out.println(findMissingNumber(arr1Task4));
        int[] arr2Task4 = {2, 3, 1, 5};
        System.out.println(findMissingNumber(arr2Task4));
        int[] arr3Task4 = {4, 7, 8, 6};
        System.out.println(findMissingNumber(arr3Task4));
    }
}

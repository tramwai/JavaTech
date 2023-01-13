package homeworks;

import java.util.*;

public class Homework15 {
    //Task1
    /**
    Requirement:
    -Create a method called fibonacciSeries1()
    -This method will take an int argument as n, and it will return n series of Fibonacci numbers as an int array.

    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21

    Test Data 1: 3
    Expected Result 1: [0, 1, 1]

    Test Data 2: 5
    Expected Result 2: [0, 1, 1, 2, 3]

    Test Data 3: 7
    Expected Result 3: [0, 1, 1, 2, 3, 5, 8]
     */

    public static int[] fibonacciSeries1(int n) {
        if (n <= 0) {
            return new int[]{};
        } else if (n == 1) {
            return new int[]{0};
        } else {
            int[] result = new int[n];
            result[0] = 0;
            result[1] = 1;
            for (int i = 2; i < n; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
            return result;
        }
    }


    // Task2
    /**
    Requirement:
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will return the nth series of Fibonacci number as an int.

    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21

    Test Data 1: 2
    Expected Result 1: 1

    Test Data 2: 4
    Expected Result 2: 2

    Test Data 3: 8
    Expected Result 3: 13
     */

    public static int fibonacciSeries2(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int first = 0;
            int second = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = first + second;
                first = second;
                second = fib;
            }
            return fib;
        }
    }

    // Task3
    /**
    Requirement:
    -Create a method called findUniques()
    -This method will take 2 int array argument and it will return an int array which has only the unique values from both given arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values from the other array.

    Test Data 1: [], []
    Expected Result 1: []

    Test Data 2: [], [1, 2, 3, 2]
    Expected Result 2: [1, 2, 3]

    Test Data 3: [1, 2, 3, 4], [3, 4, 5, 5]
    Expected Result 3: [1, 2, 5]

    Test Data 4: [8, 9], [9, 8, 9]
    Expected Result 4: []
     */

    public static int[] findUniques(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }
        for (int i : array2) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
            result[index++] = i;
        }
        return result;
    }

    // Task4
    /**
    Requirement:
    -Create a method called isPowerOf3()
    -This method will take an int argument and it will return true if given int argument is equal to 3 power
     of the X. Otherwise, it will return false.

    Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….

    Test Data 1: 1
    Expected Result 1: true

    Test Data 2: 2
    Expected Result 2: false

    Test Data 3: 3
    Expected Result 3: true

    Test Data 4: 81
    Expected Result 4: true
     */

    public static boolean isPowerOf3(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    // Task5
    /**
     * Requirement:
     * -Create a method called firstDuplicate()
     * -This method will take an int array argument and it will return an int which is the first duplicated number.
     * NOTE: All elements will be positive numbers.
     * NOTE: If there are no duplicates, then return -1
     * NOTE: If there are more than one duplicate, then return the one for which second occurrence has the smallest index.
     * <p>
     * Test Data 1: []
     * Expected Result 1: -1
     * <p>
     * Test Data 2: [1]
     * Expected Result 2: -1
     * <p>
     * Test Data 3: [1, 2, 2, 3]
     * Expected Result 3: 2
     * <p>
     * Test Data 4: [1,  2, 3, 3, 4, 1]
     * Expected Result 4: 3
     */

    public static int firstDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }




    public static void main(String[] args) {
        System.out.println("===========Task1============");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));


        System.out.println("===========Task2============");

        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));

        System.out.println("===========Task3============");
        int[] arr1Task3 = {};
        int[] arr2Task3 = {};
        int[] arr3Task3 = {};
        int[] arr4Task3 = {1, 2, 3, 2};
        int[] arr5Task3 = {1, 2, 3, 4};
        int[] arr6Task3 = {3, 4, 5, 5};
        int[] arr7Task3 = {8, 9};
        int[] arr8Task3 = {9, 8, 9};

        System.out.println(Arrays.toString(findUniques(arr1Task3, arr2Task3)));
        System.out.println(Arrays.toString(findUniques(arr3Task3, arr4Task3)));
        System.out.println(Arrays.toString(findUniques(arr5Task3, arr6Task3)));
        System.out.println(Arrays.toString(findUniques(arr5Task3, arr6Task3)));
        System.out.println(Arrays.toString(findUniques(arr7Task3, arr8Task3)));


        System.out.println("===========Task4============");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));

        System.out.println("===========Task5============");

        int[] arr1Task5 = {};
        System.out.println(firstDuplicate(arr1Task5));
        int[] arr2Task5 = {1};
        System.out.println(firstDuplicate(arr2Task5));
        int[] arr3Task5 = {1, 2, 2, 3};
        System.out.println(firstDuplicate(arr3Task5));
        int[] arr4Task5 = {1, 2, 3, 3, 4, 1};
        System.out.println(firstDuplicate(arr4Task5));
        }


    }












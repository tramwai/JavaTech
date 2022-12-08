package homeworks;

import java.util.Arrays;
import java.util.Date;

public class Homework11_Recap {


    // Task 7
    /**
     Requirement:
     -Create a method called no3or5()
     -This method will take an int array argument and it will return a new array with some elements replaced as below
     If element can be divided by 5, replace it with 99
     If element can be divided by 3, replace it with 100
     If element can be divided by both 3 and 5, replace it with 101
     NOTE: Assume length will always be more than zero
     Test Data 1: [7, 4, 11, 23, 17]
     Expected Result 1: [7, 4, 11, 23, 17]
     Test Data 2: [3, 4, 5, 6]
     Expected Result 2: [100, 4, 99, 100]
     Test Data 3: [10, 11, 12, 13, 14, 15]
     Expected Result 3:  [99, 11, 100, 13, 14, 101]
     */

    public static int[] no3or5(int[] arr){
        int[] newArr = arr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 3 == 0) newArr[i] = 101;
            else if(arr[i] % 3 == 0) newArr[i] = 100;
            else if(arr[i] % 5 == 0) newArr[i] = 99;
            else newArr[i] = arr[i];
        }
        return newArr;
    }



    // Task 8
    /**
     Requirement:
     -Create a method called countPrimes()
     -This method will take an int array argument and it will return how many elements in the array are prime numbers
     NOTE: Prime number is a number that can be divided only by 1 and itself
     NOTE: Negative numbers cannot be prime
     Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
     NOTE: Smallest prime number is 2
     Test Data 1: [-10, -3, 0, 1]
     Expected Result 1: 0
     Test Data 2: [7, 4, 11, 23, 17]
     Expected Result 2: 4
     Test Data 3: [41, 53, 19, 47, 67]
     Expected Result 3:  5
     */
    public static int countPrimes(int[] arr){
        int nonPrimeNumbers = 0;
        for (int num : arr) {
            if (num < 2) {
                nonPrimeNumbers++;
            continue;
        }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) nonPrimeNumbers++;
            }
        }
        return arr.length - nonPrimeNumbers;
    }


    public static void main(String[] args) {

        System.out.println("\n============Task 7===============\n");
        int[] arr1Task7 = {7,4,11,23,17};
        System.out.println(Arrays.toString(no3or5(arr1Task7)));
        int[] arr2Task7 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(arr2Task7)));
        int[] arr3Task7 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(arr3Task7)));

        System.out.println("============Task8=============");
        int[] arr1Task8 = {-10, -3, 0, 1};
        System.out.println(countPrimes(arr1Task8));
        int[] arr2Task8 = {7, 4, 11, 23, 17};
        System.out.println(countPrimes(arr2Task8));
        int[] arr3Task8 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(arr3Task8));
    }
}

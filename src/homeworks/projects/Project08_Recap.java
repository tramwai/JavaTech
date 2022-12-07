package homeworks.projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project08_Recap {



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
    public static int findClosestDistance(int[] arr){
        Arrays.sort(arr);
        if (arr.length < 2) return -1;
        int smallDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if(diff < smallDiff) smallDiff = diff;
        }
        return smallDiff;
    }

            // ======= Alternative solution =================
//    public static int findClosestDistance(int[] arr) {
//         // look at current number, compare with all following numbers and find the smallest absolute difference
//        // between all of them, and compare it to our global min value.
//        // then we do the same comparison with the next number, until we get all absolute differences and have found
//        // the smallest of those differences
//        int len = arr.length, ans = Integer.MAX_VALUE;
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                int diff = Math.abs(arr[i] - arr[j]);
//                if (diff < ans) ans = diff;
//            }
//        }
//        return ans;
//    }


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

    public static int findSingleNumber(int[] arr){
        Arrays.sort(arr);
        // compare the next number, if it's the same - > skip hte number
        if (arr.length == 1) return arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) return arr[i];
            else i++;
        }
        return arr[arr.length - 1];
    }

    // ======= Alternative solution =================
//    public static int findSingleNumber(int[] arr){
//        if (arr.length == 1) return arr[0];
//        int ans = 0;
//        // if the current value is not in the list, add to to list and add it with our ans container.
//        // When we find a value that is already in the list, we subtract from our ans container. Whatever is left = our single number
//        List<Integer> nums = new ArrayList<Integer>();
//        for (int j : arr) {
//            if (!nums.contains(j)) {
//                nums.add(j);
//                ans += j;
//            } else ans -= j;
//        }
//        return ans;
//    }
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
     Space -> ' '
     */

    public static char findFirstUniqueCharacter(String s){
        while (s.length() > 0) {
            // if the char we're looking at exists in the rest of the string, then remove all instances of that char, else return it
            if (s.length() == 1) return s.charAt(0);
            if (!s.substring(1).contains("" + s.charAt(0))) return s.charAt(0);
            else s = s.replaceAll("" + s.charAt(0), "");
        }
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

//    public static int findMissingNumber(int[] arr){
//        Arrays.sort(arr);
//        // compare the next value and see if it's the +1 of the current value
//        // if it is then continue, if not return the missing next value
//        for (int i = 0; i < arr.length; i++) {
//            int expectedValue = arr[i] + 1;
//            int nextValue = arr[i + 1];
//            if (nextValue != expectedValue) return expectedValue;
//        }
//        return 0;
//    }

    // ======= Alternative solution =================
    public static int findMissingNumber(int[] arr){
        // we want to find min and max and the range between those values is what to compare
        int len = arr.length - 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0, j = len; i <= len / 2; i++, j--) {
            if (arr[i] < min ) min = arr[i];
            if (arr[j] < min ) min = arr[j];
            if (arr[i] > max ) max = arr[i];
            if (arr[j] > max ) max = arr[j];
        }
        // min = 1 and max = 5
        // now that we have our range, we increment min++ and check if array contains that number
        // to use contains method, we must make the array into a string ([2, 3, 1, 5])
        // if it does, continue, if not, that's the missing number
        String s = Arrays.toString(arr).replace("]", ","); // [2, 3, 1, 5,
        for (int i = min + 1; i < max; i++) { // min + 1 = 2, -> 3, -> 4,
            if (!s.contains(i + ",")) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=======Task1=========");
        System.out.println(findClosestDistance(new int[]{4, 8, 7, 15}));

        System.out.println("=======Task2=========");
        System.out.println(findSingleNumber(new int[]{5, 3, -1, 3, 5, 7, -1}));

        System.out.println("=======Task3=========");
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findFirstUniqueCharacter("abc abc d"));
        System.out.println(findFirstUniqueCharacter(""));

        System.out.println("=========Task 4==========");
        int[] arr1Task4 = {2, 4};
        System.out.println(findMissingNumber(arr1Task4));
        int[] arr2Task4 = {2, 3, 1, 5};
        System.out.println(findMissingNumber(arr2Task4));
        int[] arr3Task4 = {4, 7, 8, 6};
        System.out.println(findMissingNumber(arr3Task4));

    }
}

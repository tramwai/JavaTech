package homeworks.projects;

import java.util.Arrays;

public class Project05Recap {
    public static void main(String[] args) {

    }


    /**
     TASK-1 - findGreatestAndSmallestWithSort() method
     Write a method that takes an int array that has at least one element.
     Find the greatest and smallest elements from the array and print them.
     Complete task using sort() method.
     Test data:
     [10, 7, 7, 10, -3, 10, -3]
     Expected output:
     Smallest = -3
     Greatest = 10
     */

    public static void findGreatestAndSmallestWithSort(int[] num){
        if (num.length >= 1){
            Arrays.sort(num);
        }
    }
}

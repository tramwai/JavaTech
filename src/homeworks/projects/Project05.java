package homeworks.projects;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\nTest - Task1");
        int[] task1 = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(task1);

        System.out.println("\nTest - Task2");
        int[] task2 = {10, 7, 7, 10 -3, 10, -3};
        findGreatestAndSmallest(task2);

        System.out.println("\nTest - Task3");
        int[] task3 = {0, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(task3);

        System.out.println("\nTest - Task4");
        int[] task4 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallest(task4);

        System.out.println("\nTest - Task5");
        String[] task5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(task5);

        System.out.println("\nTest - Task6");
        String[] task6 = {"pen","eraser","pencil","pen","123","abc","pen","eraser"};
       findMostRepeatedElementInAnArray(task6);
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
    public static void findGreatestAndSmallestWithSort(int[] array){
        Arrays.sort(array);
        System.out.println("Smallest = " + array[0]);
        System.out.println("Greatest = " + array[array.length - 1]);
    }

    /**
    TASK-2 findGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find the greatest and smallest elements from the array and
     print them. DO NOT sort the array and complete task without sorting.
    Test data:
    [10, 7, 7, 10 -3, 10, -3]
    Expected output:
    Smallest = -3
    Greatest = 10
     */
    public static void findGreatestAndSmallest(int[] array){
    int smallest = Integer.MAX_VALUE;
    int greatest = Integer.MIN_VALUE;
    for(int element : array){
        if (element < smallest) smallest  = element;
        else if(element > greatest) greatest = element;
    }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

    /**
    TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element.
     Find the second greatest and second smallest elements from the array
     and print them. Complete task using sort() method.
    Test data:
    [10, 5, 6, 7, 8, 5, 15, 15]
    Expected output:
    Second Smallest = 6
    Second Greatest = 10
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] array){
    Arrays.sort(array);
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element != array[array.length - 1] && element > max)
                max = element;
            if (element != array[array[0]] && element < min)
                min = element;
        }
        System.out.println("Second Smallest = " + min);
        System.out.println("Second Greatest = " + max);
    }

    /**
    TASK-4 - findSecondGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element.
     Find the second greatest and second smallest elements from the array and print them.
     DO NOT sort the array and complete task without sorting.
    Test data:
    [10, 5, 6, 7, 8, 5, 15, 15]
    Expected output:
    Second Smallest = 6
    Second Greatest = 10
     */
    public static void findSecondGreatestAndSmallest(int[] array){
        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int secGreatest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element < smallest) smallest = element;
            else if (element > greatest) greatest = element;
        }
        for (int element : array) {
            if (element != smallest && element < secSmallest)
                secSmallest = element;
            else if(element != greatest && element > secGreatest)
                secGreatest = element;
        }
        System.out.println("Second Smallest = " + secSmallest);
        System.out.println("Second Greatest = " + secGreatest);
    }

    /**
    TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and print them.
    NOTE: It is case-sensitive!
    Test data:
    [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]
    Expected output:
    bar
    6
     */
    public static void findDuplicatedElementsInAnArray(String[] str){
        String duplicateStr = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && !duplicateStr.contains(str[i]))
                    duplicateStr += str[i] + "\n";
            }
        }
        System.out.println(duplicateStr);
    }

    /**
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element and print it.
    Test data:
    [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
    Expected output:
    pen
     */
    public static void findMostRepeatedElementInAnArray(String[] array){
        String result = "";
        int mostRepeated = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count >= mostRepeated){
                result = array[i];
                mostRepeated = count;
            }
        }
        System.out.println(result);
    }
}

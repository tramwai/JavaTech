package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        int[] numbers2 = {10, -3, 7, 1, 22};
        System.out.println(lastFiveElements(numbers));
        System.out.println(lastFiveElements(numbers2));
    }
    /**
    Create a public static method which will take a int array then will get the sum of first 3 elements and return it
    Example:
     Array - > int[] numbers = {10, -3, -7, 0, 0, 7, 22};
     return 0;
     */
    public static int findSumOfThree(int[] numbers){
        /*
        Pseudo code:
        1. Create am int container
        2. Create a loop(start point= 0, end = 3(not included)
        3. return the container
         */
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /**
create a public static method which will take an int array then it will get the
sum of last 5 elements and return it.

Note: Given array should be at least 5 elements
Note2: Use LOOPS

Example:
Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

Return:
22

Example2:
Array -> int[] numbers = {10, -3, 7, 1, 22};

Return2:
38
 */
    public static int lastFiveElements (int [] numbers){
        /*
        1. Create a container
        2. Loop(start = L -1; end -> i > L - 5, i--)
        3. return sum container
         */
       int sum = 0;
        for (int i = numbers.length - 1; i > numbers.length - 6; i--) {
            sum += numbers[i];
        }
        return sum;
    }
}

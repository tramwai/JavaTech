package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};
        /**
        negatives: 2
        positive: 5
        neutrals/zeros: 3
        even: 6
        odd: 4
        max:10
        min: -7
        sum of all numbers: 28
        average of the numbers: 2
        how many unique numbers: 7
        how many of those numbers are represented in fibonacci sequence: 6
        prime numbers(numbers divided by itself or  by 1): 2
        how many numbers can be divided by 5: 6
        absolute difference between the max and min: 17
        closest number to 9(take the smalles if you have 2 equal on each side: 8
         */
        // negatives
        int negatives = 0;
        for (int number : numbers) {
          if (number < 0) negatives++;
        }
        System.out.println("Negative count is " + negatives);

        // positives
        int positives = 0;
        for (int number : numbers) {
            if (number > 0) positives++;
        }
        System.out.println("Positive count " + positives);

        //neutrals
        int neutrals = 0;
        for (int number : numbers) {
            if (number == 0) neutrals++;
        }
        System.out.println("Neutrals count " + neutrals);

        /**
        Count how many even numbers you have
         Expected: 6
         */
        int even1 = 0;
        for (int element : numbers) {
            if (element % 2 == 0) even1++;
        }
        System.out.println(even1);
        // fori loop
        int even2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) even2++;
        }
        System.out.println(even2);
    }
}

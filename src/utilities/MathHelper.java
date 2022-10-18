package utilities;

public class MathHelper {

    /*
    Create a method that returns the max number of 3 int numbers
     */
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    /*
    Create a method that returns the min number of 3 int numbers
     */
    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    /*
    Create a method that returns the middle number of 3 int numbers
    Assume numbers can never be equal to each other
     */
    public static int middleOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);
        if (num1 != min && num1 != max) return num1;
        else if (num2 != min && num2 != max) return num2;
        else return num3;
        // alternative return = num1 + num2 + num3 - min - max
    }

    // Create a method that takes an int as an argument and returns true if it is even , returns false if oddd
    public static boolean isEven(int num) {
        return num % 2 == 0;
        // Alternative solution
//        if (num % 2 == 0) {
//            return true;
//        }else{
//            return false;
//        boolean even = num % 2 == 0? true : false;
//        boolean even = num % 2 == 0;
    }

    // Create a method that takes an int as an argument and returns true if it is odd , returns false if even
    public static boolean isOdd(int num) {
        return num % 2 != 0;
//        return num % 2 == 1;
//        return !isEven;
    }

    // Create a method that takes 2 int arguments and returns their sum
    // Method name = sum
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
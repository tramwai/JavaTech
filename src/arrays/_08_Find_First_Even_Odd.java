package arrays;

public class _08_Find_First_Even_Odd {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 2, 5, 3, 2, 4, 7, 10};

        String[] array = {"ABCD", "abcd", "123", "!@#"};
        printFirstEvenAndOdd(numbers);
        printStartWithA(array);
    }

    /**
     * Create a public static method which will take an int array and then it will printout the first even and odd number
     * - arrays = {0, 2, 2, 5, 3, 2, 4, 7, 10};
     * output:
     * First even = 0;
     * First odd = 5
     */
    public static void printFirstEvenAndOdd(int[] numbers) {
        //{0, 2, 2, 5, 3, 2, 4, 7, 10};
        /*
        Pseudo
        1. Containers ->even, odd, isEvenFound, isOddFound
        2. loop
        3. print
         */
        int fEven = 0;
        int fOdd = 0;
        boolean isEvenFound = false; // flag
        boolean isOddFound = false;
        for (int n : numbers) {
            if (!isEvenFound && n % 2 == 0) {
                fEven = n;
                isEvenFound = true; // marking flag as true , so next time you will know fEven is found
            } else if (!isOddFound && n % 2 == 1) { // if the first odd not found and the number is odd
                fOdd = n;
                isOddFound = true;
            }
        }
        System.out.println((isEvenFound) ? "First even " + fEven : "There is no even number in this array");
        System.out.println((isOddFound) ? "First odd " + fOdd : "There is no odd number in this array");
    }

    /**
     * Create a public static method which will take a String array then it will
     * print out the first String starting with "a", NOT CASE SENSITIVE
     * If there is not a String which is starting with "a" print -> 'No String starting with "a"'
     * <p>
     * Example1:
     * - array =  {"ABCD", "abcd", "123", "!@#"}
     * <p>
     * Output1:
     * First string with "a" = "ABCD"
     * <p>
     * Example2:
     * - array =  {"abcd", "123", "!@#"}
     * <p>
     * Output2:
     * First string with "a" = "abcd"
     * <p>
     * Example3:
     * - array =  {"123", "!@#"}
     * <p>
     * Output3:
     * No String starting with "a"
     */
    public static void printStartWithA(String[] strs) {
        /*
        Pseudo
        1. Containers -> isAFound
        2. loop -> should start with "a" and should be first
        3. print the str otherwise  "no string starting ..
         */
        String startsA = "";
        boolean isAFound = false;
        for (String s : strs) {
            if (s.toLowerCase().startsWith("a") && !isAFound){
                System.out.println(s);
                isAFound = true;
            }
        }
        if(!isAFound){
            System.out.println("No Strings start with \"a\"");
        }
    }


}





package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Homework13 {

// Task1

    /**
     * Requirement:
     * -Create a method called hasLowerCase()
     * -This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn’t.
     * <p>
     * Test Data 1: “”
     * Expected Result 1: false
     * <p>
     * Test Data 2: “JAVA”
     * Expected Result 2: false
     * <p>
     * Test Data 3: “125$”
     * Expected Result 3: false
     * <p>
     * Test Data 4: “hello”
     * Expected Result 4: true
     */

    public static boolean hasLowerCase(String str) {
        boolean hasLower = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                hasLower = true;
                break;
            }
        }
        return hasLower;
    }

// Task2

    /**
     * Requirement:
     * -Create a method called noZero()
     * -This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros removed from the original Integer ArrayList.
     * <p>
     * NOTE: Assume that ArrayList size will be at least 1.
     * <p>
     * Test Data 1: [1]
     * Expected Result 1: [1]
     * <p>
     * Test Data 2: [1, 1, 10]
     * Expected Result 2: [1, 1, 10]
     * <p>
     * Test Data 3: [0, 1, 10]
     * Expected Result 3: [1, 10]
     * <p>
     * Test Data 4: [0, 0, 0]
     * Expected Result 4: []
     */

    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number != 0) {
                result.add(number);
            }
        }
        return result;
    }

    // Task 3

    /**
     * Requirement:
     * -Create a method called numberAndSquare()
     * -This method will take an int array argument and it will return a multidimensional array with all numbers squared.
     * <p>
     * NOTE: Assume that array size is at least 1.
     * <p>
     * Test Data 1: [1, 2, 3]
     * Expected Result 1: [[1, 1], [2, 4], [3, 9]]
     * <p>
     * Test Data 2: [0, 3, 6]
     * Expected Result 2: [[0, 0], [3, 9], [6, 36]]
     * <p>
     * Test Data 3: [1, 4]
     * Expected Result 3: [[1,1], [4, 16]]
     */

    public static int[][] numberAndSquare(int[] numbers) {
        int[][] result = new int[numbers.length][];
        for (int i = 0; i < numbers.length; i++) {
            int[] arr1 = {numbers[i], numbers[i] * numbers[i]};
            result[i] = arr1;
        }
        return result;
    }


    // Task 4

    /**
     * Requirement:
     * -Create a method called containsValue()
     * -This method will take a String array and a String argument, and it will return a boolean.
     * Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
     * NOTE: Assume that array size is at least 1.
     * NOTE: The method is case-sensitive
     * <p>
     * Test Data 1: [“abc”, “foo”, “java”], “hello”
     * Expected Result 1: false
     * <p>
     * Test Data 2: [“abc”, “def”, “123”], “Abc”
     * Expected Result 2: false
     * <p>
     * Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
     * Expected Result 3: true
     * <p>
     * Hint: Use binarySearch() for easy solution
     */

    public static boolean containsValue(String[] array, String value) {
        int index = Arrays.binarySearch(array, value);
        return index >= 0;
    }
    // Task 5

    /**
     * Requirement:
     * -Create a method called reverseSentence()
     * -This method will take a String argument and it will return a String with changing the place of every word.
     * All words should be in reverse order. Make sure that there are two words inside the sentence at least.
     * If there is no two words return “There is not enough words!”.
     * <p>
     * NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
     * <p>
     * Test Data 1: “Hello”
     * Expected Result 1: “There is not enough words!”
     * <p>
     * Test Data 2: “Java is fun”
     * Expected Result 2: “Fun is java”
     * <p>
     * Test Data 3: “This is a sentence”
     * Expected Result 3: “Sentence a is this”
     * <p>
     * Hint: Use split() for easy solution
     * Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
     */


    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 2) {
            return "There is not enough words!";
        }
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            if (i == words.length - 1) {
                result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
            } else {
                result.append(" ").append(word.toLowerCase());
            }
        }
        return result.toString();
    }

// Task 6
    /**
    Requirement:
-Create a method called removeStringSpecialsDigits()
-This method will take a String as argument, and it will return a String without the special characters or digits.
NOTE: Assume that String length is at least 1.
NOTE: Do not remove spaces.

Test Data 1: “123Java #$%is fun”
Expected Result 1: “Java is fun”

Test Data 2: “Selenium”
Expected Result 2: “Selenium”

Test Data 3: “Selenium 123#$%Cypress”
Expected Result 3: “Selenium Cypress”

     */

    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z]","");
    }

    // Task 7
    /**
    Requirement:
-Create a method called removeArraySpecialsDigits()
-This method will take a String array as argument, and it will return a String array without the special characters
     or digits from the elements.
NOTE: Assume that array size is at least 1.

Test Data 1: [“123Java”, “#$%is”, “fun”]
Expected Result 1: [“Java”, “is”, “fun”]

Test Data 2: [“Selenium”, “123$%”, “###”]
Expected Result 2: [“Selenium”, “”, “”]

Test Data 3: [“Selenium”, “123#$%Cypress”]
Expected Result 3: [“Selenium”, “Cypress”]

     */



    public static String[] removeArraySpecialsDigits(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = "\"" + Pattern.compile("[^a-zA-Z]").matcher(array[i]).replaceAll("") + "\"";
        }
        return result;
    }

    // Task8
    /**
    Requirement:
-Create a method called removeAndReturnCommons()
-This method will take two String ArrayList and it will return all the common words as String ArrayList.
NOTE: Assume that both ArrayList sizes are at least 1.

Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
Expected Result 1: []

Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”, “Python”]
Expected Result 2: [“Java”]

Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C++”]
Expected Result 3: [“C#”]
     */

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> arr3 = new ArrayList<>();

        for (int i = 0; i< arr1.size(); i++){

            for (int j = 0; j <arr2.size() ; j++) {
                if (arr1.get(i).equals(arr2.get(j))) {
                    arr3.add(arr1.get(i));
                }
            }
        }
        return arr3;
    }

    // Task 9
    /**
    Requirement:
-Create a method called noXInVariables()
-This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
If the element itself equals to x or X or contains only x letters, then remove that element.
NOTE: Assume that ArrayList size is at least 1.

Test Data 1: [abc, 123, #$%]
Expected Result 1: [abc, 123, #$%]

Test Data 2: [xyz, 123, #$%]
Expected Result 2: [yz, 123, #$%]

Test Data 3: [x, 123, #$%]
Expected Result 3: [123, #$%]

Test Data 4: [xyXyxy, Xx, ABC]
Expected Result 4: [yyy, ABC]
     */

    public static List<String> noXInVariables(ArrayList<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.equals("x") || s.equals("X")) {
                continue;
            }
            result.add(s.replaceAll("[xX]", ""));
        }
        return result;
    }


    public static void main (String[]args) {
        System.out.println("\n==============Task1================\n");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("\n==============Task2================\n");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        System.out.println(noZero(arr));
        arr.add(1);
        arr.add(10);
        System.out.println(noZero(arr));
        arr.remove(0);
        arr.add(0);
        System.out.println(noZero(arr));
        arr.clear();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        System.out.println(noZero(arr));

        System.out.println("\n==============Task3================\n");
        int[][] result1Task3 = numberAndSquare(new int[]{1, 2, 3});
        int[][] result2Task3 = numberAndSquare(new int[]{0, 3, 6});
        int[][] result3Task3 = numberAndSquare(new int[]{1, 4});

        System.out.println(Arrays.deepToString(result1Task3));
        System.out.println(Arrays.deepToString(result2Task3));
        System.out.println(Arrays.deepToString(result3Task3));

        System.out.println("\n==============Task4================\n");
        boolean result1Task4 = containsValue(new String[]{"abc", "foo", "java"}, "hello");
        boolean result2Task4 = containsValue(new String[]{"abc", "def", "123"}, "Abc");
        boolean result3Task4 = containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123");

        System.out.println(result1Task4);
        System.out.println(result2Task4);
        System.out.println(result3Task4);


        System.out.println("\n==============Task5================\n");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n==============Task6================\n");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\n==============Task7================\n");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));

        System.out.println("\n==============Task8================\n");
        ArrayList<String> tDA = new ArrayList<>();
        tDA.add("Java");
        tDA.add("is");
        tDA.add("fun");

        ArrayList<String> tDB = new ArrayList<>();
        tDB.add("abc");
        tDB.add("xyz");
        tDB.add("123");

        ArrayList<String> tDC = new ArrayList<>();
        tDC.add("Java");
        tDC.add("is");
        tDC.add("fun");

        ArrayList<String> tDD = new ArrayList<>();
        tDD.add("Java");
        tDD.add("C#");
        tDD.add("Python");

        ArrayList<String> tDE = new ArrayList<>();
        tDE.add("Java");
        tDE.add("C#");
        tDE.add("C#");

        ArrayList<String> tDF = new ArrayList<>();
        tDF.add("Python");
        tDF.add("C#");
        tDF.add("C++");

        System.out.println(removeAndReturnCommons(tDA,tDB));
        System.out.println(removeAndReturnCommons(tDC,tDD));
        System.out.println(removeAndReturnCommons(tDE,tDF));

        System.out.println("\n==============Task9================\n");
        ArrayList<String> task9TD1 = new ArrayList<>();
        task9TD1.add("xyz");
        task9TD1.add("123");
        task9TD1.add("#$%");

        ArrayList<String> task9TD2 = new ArrayList<>();
        task9TD2.add("abc");
        task9TD2.add("123");
        task9TD2.add("#$%");

        ArrayList<String> task9TD3 = new ArrayList<>();
        task9TD3.add("x");
        task9TD3.add("123");
        task9TD3.add("#$%");

        ArrayList<String> task9TD4 = new ArrayList<>();
        task9TD4.add("xyXyxy");
        task9TD4.add("Xx");
        task9TD4.add("ABC");

        System.out.println(noXInVariables(task9TD1));
        System.out.println(noXInVariables(task9TD2));
        System.out.println(noXInVariables(task9TD3));
        System.out.println(noXInVariables(task9TD4));
    }
}
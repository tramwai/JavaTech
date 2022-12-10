package homeworks;

import java.util.Arrays;

public class Homework12 {

    // Task1
    /**
    -Create a method called noDigit()
    -This method will take one String argument and it will return a new String
    with all digits removed from the original String
     Test Data 1: “”
     Expected Result 1: “”
     Test Data 2: “Java”
     Expected Result 2: “Java”
     Test Data 3: “123Hello”
     Expected Result 3: “Hello”
     Test Data 4: “123Hello World149”
     Expected Result 4: “Hello World”
     Test Data 5: “123Tech456Global149”
     Expected Result 5: “TechGlobal”
     */
    public static String noDigit(String str){
        // return str.replaceAll("[0-9]", "");
        String strTask1 = "";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) strTask1 += str.charAt(i);
        }
        return strTask1;
    }

    // Task2
    /**
    Create a method called noVowel()
    -This method will take one String argument and it will return a new String
    with all vowels removed from the original String
     Test Data 1: “”
     Expected Result 1: “”
     Test Data 2: “xyz”
     Expected Result 2: “xyz”
     Test Data 3: “JAVA”
     Expected Result 3: “JV”
     Test Data 4: “125$”
     Expected Result 4: “125$”
     Test Data 5: “TechGlobal”
     Expected Result 5: “TchGlbl”
     */
    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Task3
    /**
     -Create a method called sumOfDigits()
    -This method will take one String argument and it will return an int sum of all digits
     from the original String.
     NOTE: Return zero if there is no digits in the String
     Test Data 1: “”
     Expected Result 1: 0
     Test Data 2: “Java”
     Expected Result 2: 0
     Test Data 3: “John’s age is 29”
     Expected Result 3: 11
     Test Data 4: “$125.0”
     Expected Result 4: 8
     */

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;
    }

    // Task4
    /**
     -Create a method called hasUpperCase()
     -This method will take one String argument and it will return boolean true if
     there is an uppercase letter and false otherwise.
     Test Data 1: “”
     Expected Result 1: false
     Test Data 2: “java”
     Expected Result 2: false
     Test Data 3: “John’s age is 29”
     Expected Result 3: true
     Test Data 4: “$125.0”
     Expected Result 4: false
     */

    public static boolean hasUpperCase(String str){
//        for (char c : str.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                return true;
//            }
//        }
//        return false;

        boolean isUpperCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                isUpperCase = true;
                break;
            }
        }
        return isUpperCase;
    }

    // Task 5
    /**
    Requirement:
    -Create a method called middleInt()
    -This method will take three int arguments and it will return the middle int.
    Test Data 1: 1, 1, 1
    Expected Result 1: 1
    Test Data 2: 1, 2, 2
    Expected Result 2: 2
    Test Data 3: 5, 5, 8
    Expected Result 3: 5
    Test Data 4: 5, 3, 5
    Expected Result 4: 5
    Test Data 4: -1, 25, 10
    Expected Result 4: 10
     */

    public static int middleInt(int a, int b, int c){
        // using sorting the array
        int[] nums ={a,b,c};
        Arrays.sort(nums);
        return nums[1];

        // without sorting the array
//        int max = Math.max(a, Math.max(b,c));
//        int min = Math.min(a, Math.min(b,c));
//        if(a != max && a != min) return a;
//        else if (b != max && b != min) return b;
//        else return c;

    }

    // Task 6
    /**
    Requirement:
    -Create a method called no13()
    -This method will take an int array as argument and it will return a new array
     with all 13 replaced with 0.
    NOTE: Assume length will always be more than zero.
    Test Data 1: [1, 2, 3 ,4]
    Expected Result 1: [1, 2, 3 ,4]
    Test Data 2: [13, 2, 3 ]
    Expected Result 2: [0, 2, 3 ]
    Test Data 3:[13, 13, 13 , 13, 13]
    Expected Result 3: [0, 0, 0, 0, 0]
     */

    public static int[] no13(int[] array){
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 13) newArr[i] = array[i];
            else array[i] = 0;
        }
        return newArr;
    }

    // Task 7
    /**
    Requirement:
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the array
    with every number replaced with their factorials.
    NOTE: If given array is empty, then return it back empty.
    NOTE: 0! equals to 1
    Test Data 1: [1, 2, 3, 4]
    Expected Result 1: [1, 2, 6, 24]
    Test Data 2: [0, 5]
    Expected Result 2: [1, 120]
    Test Data 3:[5 , 0, 6]
    Expected Result 3: [120, 1, 720]
    Test Data 4:[]
    Expected Result 4: []
     */

    public static int[] arrFactorial(int[] array){

        for (int i = 0; i < array.length; i++){
            int fact = 1;
            for(int j = 2; j <= array[i]; j++){
                fact *= j;
            }
            array[i]= fact;
        }
        return array;
    }


    // Task 8
    /**
    Requirement:
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array
     as letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.
    Test Data 1: “     ”
    Expected Result 3: [ , , ]
    Test Data 2: “abc123$#%”
    Expected Result 2: [abc, 123, $#%]
    Test Data 3: “12ab$%3c%”
    Expected Result 3: [abc, 123, $%%]
     */

    public static String[] categorizeCharacters(String str) {

        String[] categorized = {"", "", ""};
        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) categorized[0] += character + "";
            else if (Character.isDigit(character)) categorized[1] += character + "";
            else categorized[2] += character + "";
        }
        return categorized;
    }

    public static void main(String[] args) {
        System.out.println("=============Task 1=============\n");
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));

        System.out.println("=============Task 2=============\n");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));

        System.out.println("=============Task 3=============\n");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John's age is 29"));
        System.out.println(sumOfDigits("125.0"));

        System.out.println("=============Task 4=============\n");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John's age is 29"));
        System.out.println(hasUpperCase("125.0"));

        System.out.println("=============Task 5=============\n");
        System.out.println(middleInt(1,1,1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5,5,8));
        System.out.println(middleInt(5,3,5));
        System.out.println(middleInt(-1,25,10));

        System.out.println("=============Task 6=============\n");
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3})));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13, 13, 13})));

        System.out.println("=============Task 7=============\n");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 5})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{5, 0, 6})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{})));

        System.out.println("=============Task 8=============\n");
        System.out.println(Arrays.toString(categorizeCharacters("   ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));

    }
}

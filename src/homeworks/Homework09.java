package homeworks;

import java.util.ArrayList;

public class Homework09 {

    public static void main(String[] args) {

        System.out.println("\n=============Task 1 ==============\n");
        /**
         * Requirement:
         * Write a program to find the first duplicated number in an int array
         * It should print “There is no duplicates” if there are no duplicate elements.
         * NOTE: Make your code dynamic that works for any given int array.
         */

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        boolean isDuplicate = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) break;
        }
        if (!isDuplicate) System.out.println("There is no duplicates");


        System.out.println("\n=============Task 2 ==============\n");

        /**
        Requirement:
        Write a program to find the first duplicated String in a String array, ignore cases. It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.
        Test data 1:
        String[] words = {“Z”, “abc”, “z”, “123”, “#” };
        Expected output 1: Z
        Test data 2:
        String[] words = {“xyz”, “java”, ”abc”};
        Expected output 2: There is no duplicates
        Test data 3: String[] words = {“a”, “b”, “B”, “XYZ”, “123”};
        Expected output 2:
         */

        String[] words = {"Z", "abc", "z", "123", "#" };
        boolean isDuplicateTask2 = false;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])){
                    System.out.println(words[j]);
                    isDuplicateTask2 = true;
                    break;
                }
            }
            if (isDuplicateTask2) break;
            if (!isDuplicateTask2) System.out.println("There is no duplicates");
        }



        System.out.println("\n=============Task 3 ==============\n");

        /**
        Requirement:
        Write a program to find the all duplicates in an int array.
         It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given int array.
        Test data 1:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        Expected output 1:
        0
        -7
        Test data 2:
        int[] numbers = {1, 2, 5, 0, 7};
        Expected output 2:
        There is no duplicates
         */

        int[] numbersTask3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        String str = "";

        for (int i = 0; i < numbersTask3.length; i++) {
            for (int j = i + 1; j < numbersTask3.length; j++) {
                if (numbersTask3[i] == numbersTask3[j] && !str.contains(numbersTask3[i] + "")){
                    str += numbersTask3[i];
                    System.out.println(numbersTask3[i]);
                }
            }
        }
        if (str.isEmpty()) System.out.println("There is no duplicates");

        System.out.println("\n=============Task 4 ==============\n");

        /**
        Requirement:
        Write a program to find the all duplicates in a String array, ignore cases.
         It should print “There is no duplicates” if there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given String array.
        Test data 1:
        String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”, “java”};
        Expected output 1:
        A
        foo
        Test data 2:
        String[] words = {“python”, “foo”, “bar”, “java”, “123” };
        Expected output 2:
        There is no duplicates
         */

        String[] wordsTask4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        String strTask3 = "";
        for (int i = 0; i < wordsTask4.length; i++) {
            for (int j = i + 1; j < wordsTask4.length; j++) {
                if (wordsTask4[i].equalsIgnoreCase(wordsTask4[j]) &&
                        !strTask3.toLowerCase().contains(wordsTask4[j])){
                    System.out.println(wordsTask4[i]);
                    strTask3 += wordsTask4[i];
                }
            }
        }
        if (strTask3.isEmpty())
            System.out.println("There is no duplicates");

        System.out.println("\n=============Task 5 ==============\n");

        /**
        Requirement:
        Write a program to reverse elements in an array, then print array.
        NOTE: Make your code dynamic that works for any given array.
        Test data 1:
        String[] words1 = {“abc”, “foo”, “bar”};
        Expected output 1:
        [bar, foo, abc]
        Test data 2:
        String[] words2 = {“java”, “python”, “ruby”};
        Expected output 2:
        [ruby, python, java]
         */

        String[] wordsTask5 = {"abc", "foo", "bar"};
            ArrayList<String> wordsContainer = new ArrayList<String>();
                for (int i = wordsTask5.length - 1; i >= 0; i--) wordsContainer.add(wordsTask5[i]);
            System.out.println(wordsContainer);


        System.out.println("\n=============Task 6 ==============\n");
        /**
         Requirement:
         Write a program to reverse each word in a given String
         NOTE: Make your code dynamic that works for any given String.
         Test data 1:
         String str = “Java is fun”;
         Expected output 1:
         avaJ si nuf
         Test data 2:
         String str = “Today is a fun day”;
         Expected output 2:
         yadoT si a nuf yad
         */

        String strTask6 = "Java is fun";
        String[] mirroredStr = strTask6.split(" ");
        for (int i = 0; i < mirroredStr.length; i++){
            for (int j = mirroredStr[i].length() - 1; j >= 0; j--) {
                System.out.print(mirroredStr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }


}

package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {

    /** --------------------Task1-------------------------
     Requirement:
     Write a method named countConsonants() that takes a String as an argument a returns how many
     consonants are in the String.
     NOTE: You must use regex

     Example program1:
     String str = “hello”;
     Program: 3

     Example program2:
     String str = “JAVA”;
     Program: 2

     Example program2:
     String str = “”;
     Program: 0
     */

    public static int countConsonants(String str){
        // remove all vowels, case-insensitive, spaces with empty. Whatever remains are consonants
        str = str.replaceAll("(?i)[\\saeiou]", "");
        // use the length() method to get whatever is left in the string, in our case - consonants
        return str.length();
    }

    /** -------------------- Task 2 ----------------------
    Requirement:
    Write a method named wordArray() that takes a String as an argument and returns a String
     array with all the words in the String
    NOTE: Make as dynamic as possible.

    Example program1:
    String str = “hello”;
    Program: [hello]

    Example program2:
    String str = “java  is    fun”;
    Program: [java, is, fun]

    Example program2:
    String str = “Hello, nice to meet you!!”;
    Program: [Hello, nice, to, meet, you]
     */

    public static String[] wordArray(String str){
        // remove everything except all words, spaces and commas. Trim the string to remove extra white spaces
        str = str.trim().replaceAll("[^\\w\\s,]","");
        // next we make an array with elements as the string separated by \\W+
        // "\\W+" = all characters that are non-alphabetic and occur more than once
        String[] s = str.split("\\W+");
        // return the newly formed array
        return s;
    }

    /** ---------------------- Task 3 ----------------------
    Requirement:
        Write a method named removeExtraSpaces() that takes a String as an argument a returns
         the String back with all extra spaces removed.
        NOTE: Make sure you use regex

        Example program1:
        String str = “hello”;
        Program: hello

        Example program2:
        String str = “java  is    fun”;
        Program: java is fun

        Example program2:
        String str = “Hello,    nice to   meet     you!!”;
        Program: Hello, nice to meet you!!
     */

    public static String removeExtraSpaces(String str){
        // trim and remove all extra spaces that occur at least once(\\s+), then replace with empty (" ")
        str = str.trim().replaceAll("\\s+"," ");
        // return the newly formed string
        return str;
    }

    /** --------------------------- Task - 4 -------------------------
    Requirement:
        Write a method named count3OrLess() that asks the user to enter a sentence. Return a count of
        how many words are 3 characters long or less.
        NOTE: You must use regex

        Example program1:
        String str = “I go to TechGlobal”;
        Program: 3

        Example program2:
        String str = “Hi, my name is John Doe”;
        Program: 4

        Example program2:
        String str = “Hello guys”;
        Program: 0
     */
    public static int count3OrLess(String str){
        // get a string from user
        str = ScannerHelper.getAString();
        // create a pattern object that defines the regex for the words that are 3 chars or less
        Pattern pattern = Pattern.compile("\\b\\w{1,3}\\b"); // \\b - boundary
        // create the matcher object for the given string
        Matcher matcher = pattern.matcher(str);
        // create empty container for the word count
        int wordCount = 0;
        // check all the word occurrences
        while (matcher.find()){
            wordCount++;
        }
        return wordCount;
    }
    /** ------------------ Task 5 -------------------
    Requirement:
Write a method named isDateFormatValid() that takes a String dateOfBirth as an argument and checks
     if the given date matches the given DOB requirements.
This method would return a true or false boolean
Format: nn/nn/nnnn

Example program1:
String dateOfBirth = “01/21/1999”;
Program: true

Example program2:
String dateOfBirth = “1/20/1991”;
Program: false

Example program3:
String dateOfBirth = “10/2/1991”;
Program: false

Example program4:
String dateOfBirth = “12-20 2000”;
Program: false

Example program5:
String dateOfBirth = “12/16/19500”;
Program: false
     */

    public static boolean isDateFormatValid(String dateOfBirth){
        return Pattern.matches("(0[1-9]|1[0-2])\\/(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/((19|20)\\d\\d)",dateOfBirth);
        // "([0][1-9]|[1][0-2])\/([0][1-9]|[12][0-9]|[3][0-1])\/(19[0-9]{2}|20[01][0-9]|202[0-2])"

    }

    /** ------------------ Task 6 -------------------
    Requirement:
Write a method named isEmailFormatValid() that takes a String email as an argument and checks
     if the given email matches the given email requirements.
This method would return a true or false boolean.
Format: <2+chars>@<2+chars>.<2+chars>
NOTE: Do not use any type of loop. Use Regex

Example program1:
String email = “abc@gmail.com”;
Program: true

Example program2:
String email = “abc@student.techglobal.com”;
Program: true

Example program3:
String email = “a@gmail.com”;
Program: false

Example program4:
String email = “abcd@@gmail.com”;
Program: false

Example program5:
String email = “abc@gmail”;
Program:false

     */
    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w\\d._-]{2,}@[\\w\\d]{2,}.[\\w\\d.].{2,}", email);
    }

    // [\w.#$]{2,}@[\w.]{2,}\.[\w]{2,} - recap option
    // correct -> [a-zA-Z]{2,}@[a-zA-Z]{2,}.[a-zA-Z.].{2,}  -> includes letters only
    //         -> [\w]{2,}@[\w]{2,}.[\w.].{2,}              -> includes letters only
    //         -> [\w\d]{2,}@[\w\d]{2,}.[\w\d.].{2,}        -> includes letters,digits only
    //         -> [\w\d._-]{2,}@[\w\d]{2,}.[\w\d.].{2,}     -> includes letters, digits, dots, hyphen, underscore

    // Alternate partial solutions
    // [A-Za-z0-9+_.-]+@(.+)$
    // ^(.+)@(.+)$
    // \w{2,}@\w{2,}.[A-Za-z.]{2,}
    // [a-zA-Z]{2,}@[a-zA-Z]{2,}.[a-zA-Z.]{2,}
    // [\w\d]{2,}+@[\w\d(.)+].[\w\d(.)+].{2,}$

    public static void main(String[] args) {

        System.out.println("\nTask 1 Test\n");

        String task1A = "hello";
        System.out.println(countConsonants(task1A));
        String task1B = "JAVA";
        System.out.println(countConsonants(task1B));
        String task1C = "";
        System.out.println(countConsonants(task1C));


        System.out.println("\nTask 2 Test\n");

        String task2A = "hello";
        System.out.println(Arrays.toString(wordArray(task2A)));
        String task2B = "java is  fun";
        System.out.println(Arrays.toString(wordArray(task2B)));
        String task2C = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(task2C)));


        System.out.println("\nTask 3 Test\n");

        String task3A = "hello";
        System.out.println(removeExtraSpaces(task3A));
        String task3B = "java is  fun";
        System.out.println(removeExtraSpaces(task3B));
        String task3C = "Hello, nice to meet you!!";
        System.out.println(removeExtraSpaces(task3C));


        System.out.println("\nTask 4 Test\n");

        String task4A = "I go to TechGlobal";
        System.out.println(count3OrLess(task4A));
        String task4B = "Hi, my name is John Doe";
        System.out.println(count3OrLess(task4B));


        System.out.println("\nTask 5 Test\n");
        String task5A = "01/21/1999";
        System.out.println(isDateFormatValid(task5A)); // true = true

        String task5B = "1/20/1991";
        System.out.println(isDateFormatValid(task5B)); // false = false

        String task5C = "10/2/1991";
        System.out.println(isDateFormatValid(task5C)); // false = false

        String task5D = "12-20 2000";
        System.out.println(isDateFormatValid(task5D)); // false = false

        String task5E = "12/16/19500";
        System.out.println(isDateFormatValid(task5E)); // false = false


        System.out.println("\nTask 6 Test\n");

        String task6A = "abc@gmail.com";
        System.out.println(isEmailFormatValid(task6A));// true = true

        String task6B = "abc@student.techglobal.com";
        System.out.println(isEmailFormatValid(task6B)); // true = true

        String task6C = "a@gmail.com"; //
        System.out.println(isEmailFormatValid(task6C)); // false = false

        String task6D = "abcd@@gmail.com";
        System.out.println(isEmailFormatValid(task6D)); // false = false

        String task6E = "abc@gmail";
        System.out.println(isEmailFormatValid(task6E)); // false = false
    }

}


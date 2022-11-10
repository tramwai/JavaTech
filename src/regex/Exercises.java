package regex;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\w\\- ]{8,15}", "JohnDoe_123 ")); // true
        System.out.println(Pattern.matches("[\\d\\- ]{8,15}", "12345678")); // true
        System.out.println(Pattern.matches("[\\D\\- ]{8,15}", "12345678")); // false
        System.out.println(Pattern.matches("[\\D\\- ]{8,15}", "asdfghjk")); // true
        System.out.println(Pattern.matches(".+", "JohnDoe_123")); // true


        System.out.println("======Task1======");
        // SSN format NNN-NN-NNNN
        System.out.println("SSN");
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000")); // true

        System.out.println("======Task2======");
        // Phone number format (XXX)-XXX-XXXX
        System.out.println("Phone number");
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(630)-123-4567"));

        System.out.println("======Task3======");
        // How much wood a wood chuck chuck if a wood chuck could chuck would
        // replace wood with ****

        String str= " How much wood a wood chuck chuck if a wood chuck could chuck would";
        System.out.println(str.replaceAll("wood", "****"));

        System.out.println("======Task4======");
        //replace all special characters and spaces
        String str1 = " abc 123 $#^ ";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]", "")); // best way
        System.out.println(str1.replaceAll("[ $#^]", "")); // hard coded, not dynamic
        System.out.println(str1.replaceAll("[\\W_]", "")); // good

        String str2 = "Mihail.Hariton@gmail.com";
        System.out.println(Pattern.matches("^(.+)@(\\S+)$", str2));

        System.out.println("======Task5======");
        // create a Regex pattern that checks for a first and last name
        System.out.println(Pattern.matches("[a-zA-Z]{2,} [a-zA-Z]{2,}", "John Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+","John Doe"));

        System.out.println("======Task6======");
        /**
        Assume you are given a String that contains Letters and numbers
        Using REGEX, print out 2 Arrays, one with the letters of the string and 1 with
        the numbers
        TestData1:
        String str = “A1b2C#”;
        Program:
        [A, b, C]
        [1, 2, 3]
        TestData2:
        String str = “%ABC123#”;
        Program:
        [A, B, C]
        [1, 2, 3]
        TestData3:
        String str = “abc”;
        Program:
        [a, b, c]
        []
         */

        ArrayList<String> task6 = new ArrayList<>();
        String str3 = "##A1%%b2#$%C^&3";
        System.out.println(Arrays.toString(str3.replaceAll("[^A-Za-z]", "").toCharArray())); // AbC
        System.out.println(Arrays.toString(str3.replaceAll("[\\D]", "").split(""))); // A123






    }
}

package homeworks.projects;

import utilities.ScannerHelper;

public class Project04 {
    public static void main(String[] args) {
        /**
        TASK-1
        Write a program that asks user to enter a String, and swaps first and last 4 characters of this String and
         print the modified String

        Test data:
        TechGlobal

        Expected output:
        obalGlTech

        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String’s length is less than 8,
        then print message “This String does not have 8 characters”
         */
        System.out.println("==============Task 1=============");

        String strTask1 = ScannerHelper.getAString();
        if (strTask1.length() >= 8)
            System.out.println(strTask1.substring(strTask1.length() - 4) + //string tail
                    strTask1.substring(4, strTask1.length() - 4) + strTask1.substring(0, 4)); // middle + front
        else
            System.out.println("This String does not have 8 characters");


        System.out.println("\n==============Task 2=============\n");
        /**
        TASK-2
            Write a program that asks user to enter a sentence, and swaps first and last words of this sentence and print the modified sentence

            Test data:
            Selenium is an automation tool

            Expected output:
            tool is an automation Selenium

            NOTE: Write a program that handles any sentence
            NOTE: First check if the sentence has at least 2 words, if the sentence has only one or no word, then print message “This sentence does not have 2 or more words to swap”
         */
        String strTask2 = ScannerHelper.getAString();
        if (strTask2.trim().contains(" "))
            System.out.println(strTask2.substring(strTask2.lastIndexOf(' ')) + // tail added to front
                    strTask2.substring(strTask2.indexOf(' '), strTask2.lastIndexOf(' '))

                    + " " + strTask2.substring(0, strTask2.indexOf(' '))); // front added at the end

        else System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println("\n==============Task 3=============\n");
        /**
        TASK-3
        Assume that you are given some Strings as below, and you want to replace bad words with good words.

            String str1 = “These books are so stupid”;
            String str2 = “I like idiot behaviors”;
            String str3 = “I had some stupid t-shirts in the past and also some idiot look shoes”;

        Write a Java program that checks any given String and replace bad words like “stupid” and “idiot” with “nice” keyword

        Expected output:
        These books are so nice
        I like nice behaviors
        I had some stupid t-shirts in the past and also some idiot look shoes

        NOTE: Write a program that handles any String
//         */
        String str1Task3 = "These books are so stupid";
        String str2Task3 = "I like idiot behaviors";
        String str3Task3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1Task3.replace("stupid", "nice"));
        System.out.println(str2Task3.replace("idiot", "nice"));
        System.out.println(str3Task3.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("\n==============Task 4=============\n");
        /**
        TASK-4
        Write a program that asks user to enter their name.
        First check if length of name is more than 2 and is even or odd
        If length of name is less than 2, then print “Invalid input!!!”
        If length of name is odd, then print middle character from the name
        If length of name is even, then print middle 2 characters from the name

        Test data:
        J
        Expected output:
        Invalid input!!!
        Test data:
        Lionel
        Expected output:
        on
        Test data:
        James
        Expected output:
        m
         */
        String strTask4 = ScannerHelper.getAName();
        if (strTask4.length() > 2)
            if (strTask4.length() % 2 == 1)
                System.out.println(strTask4.charAt(strTask4.length() / 2)); // middle char
            else System.out.println("" + strTask4.charAt(strTask4.length() / 2 - 1) + strTask4.charAt(strTask4.length() / 2)); // when even
        else System.out.println("Invalid input!!!");

        System.out.println("\n==============Task 5=============\n");
        /**
        TASK-5
        Write a program that asks user to enter a country.
        First check if length of country is more than 5. If not, then print “Invalid input!!!”
        If length of country is more than 5, then print country name without first 2 and last 2 characters

        Test data:
        Peru
        Expected output:
        Invalid input!!!
        Test data:
        Brazil
        Expected output:
        az
         */
        String strTask5 = ScannerHelper.getAString();
        if (strTask5.length() > 5)
            System.out.println(strTask5.substring(2,strTask5.length() - 2));
        else System.out.println("Invalid input");


        System.out.println("\n==============Task 6=============\n");
        /**
        TASK-6
        Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements

        Test data:
        2860 S River Rd Suite 350, Des Plaines IL 60018
        Expected output:
        2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018
         */
        String strTask6 = ScannerHelper.getAnAddress();
        System.out.println(strTask6.replace('a', '*').replace('e', '#')
                .replace('i', '+').replace('u', '$').replace('o', '@')
                .replace("A","*" ).replace("E", "#").
                replace("I","+" ).replace("U", "$").replace("O", "@"));

        System.out.println("\n==============Task 7=============\n");
        /**
        TASK-7
        Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included),
         Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.

        Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;
        Expected output:
        4 – 6 – 7 – 8 – 9 – 11 – 12
         */
        int random1 = (int) (Math.random() * 26);
        int random2 = (int) (Math.random() * 26);
        String result = "";
        for (int i = Math.min(random1, random2); i <= Math.max(random1, random2) ; i++) {
            if (i % 5 != 0)
                result += i + " - ";
        }

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(result.substring(0, result.length() - 3));
        System.out.println("\n==============Task 8=============\n");
        /**
        TASK-8
        Write a program that asks user to enter a sentence as a String, and count how many words that sentence has,
         and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just print “This sentence does not
         have multiple words”.

        Test data 1:
        Java is fun
        Expected output 1:
        This sentence has 3 words.
        Test data 2:
        Hello World
        Expected output 2:
        This sentence has 2 words.
        Test data 3:
        Hi
        Expected output 3:
        This sentence does not have multiple words.
         */

        String strTask8 = ScannerHelper.getAString();
        int wordCount = 1;
        char emptySpace;
        if (strTask8.contains(" ")){
            for (int i = 0; i < strTask8.length(); i++) {
                emptySpace = strTask8.charAt(i);
                if (Character.isWhitespace(emptySpace)) wordCount++;
            }
            System.out.println("This sentence has " + wordCount + " words");
        } else System.out.println("This sentence does not have multiple words.");

        System.out.println("\n==============Task 9=============\n");
        /**
        TASK-9
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the numbers divided by 2,
         “Bar” for the numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.

        Test data:
        6
        Expected output:
        1
        Foo
        Bar
        Foo
        5
        FooBar
         */
        int positiveNum = ScannerHelper.getAPositiveNumber();
        for (int i = 0; i <= positiveNum; i++) {
            if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 3 == 0) {
                    System.out.println("Bar");
            } else if (i % 6 == 0){
                System.out.println("FooBar");
            }
            else System.out.println(i);
        }

        System.out.println("\n==============Task 10=============\n");
        /**
        TASK-10
        Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward
        •EX/ kayak, civic, madam

        NOTE: Write a program that handles any String
        NOTE: First check if the given String has at least 1 character, if the String does not have at least one character, then print message “This word does not have 1 or more characters”

        Test data 1:
        T
        Expected output 1:
        This word is palindrome
        Test data 2:
        civic
        Expected output 2:
        This word is palindrome
        Test data 3:
        Madam
        Expected output 3:
        This word is not palindrome
        Test data 4:
        Hello
        Expected output 4:
        This word is not palindrome
        Test data 5:
        Expected output 5:
        This word does not have 1 or more characters
         */
        String givenWord = ScannerHelper.getAWord();
        String reversedWord = "";
        if (givenWord.length() >= 1) {
            for (int i = givenWord.length() - 1; i >= 0; i--) {
                reversedWord += givenWord.charAt(i);
            }
            if (givenWord.equals(reversedWord))
                System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        } else System.out.println("This word does not have 1 or more characters");

        System.out.println("\n==============Task 11=============\n");
        /**
         TASK-11
         Write a program that asks user to enter a sentence as a String and count how many a or A letters
         that sentence has and print it with given below message.
         NOTE: Write a program that handles any String
         NOTE: First check if the given sentence has 1 character at least. If not, then just print
         “This sentence does not have any characters”.

         Test data 1:
         Expected output 1:
         This sentence does not have any characters.
         Test data 2:
         Apple is one of the largest IT companies.
         Expected output 2:
         This sentence has 3 a or A letters.
         Test data 3:
         I like banana and pineapple.
         Expected output 3:
         This sentence has 5 a or A letters.
         */

        String strTask10 = ScannerHelper.getAString();
        int countA = 0;
        if (strTask10.length() >= 1){
            for (int i = 0; i < strTask10.length(); i++) {
                if (strTask10.toLowerCase().charAt(i) == 'a') countA++;
            }
            System.out.println("This sentence has " + countA + " a or A letters");
        }else System.out.println("This sentence does not have any characters.");

    }
}

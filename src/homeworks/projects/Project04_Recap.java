package homeworks.projects;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Project04_Recap {
    public static void main(String[] args) {
        System.out.println("Task 11");
        /**
        TASK-11
Write a program that asks user to enter a sentence as a String and count how many a or A letters that sentence has and print it with given below message.

NOTE: Write a program that handles any String
NOTE: First check if the given sentence has 1 character at least. If not, then just print “This sentence does not have any characters”.

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

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string");
        String s11 = input.nextLine().toLowerCase();
        int counter = 0;
        if(s11.isEmpty() || (!s11.contains("a") || !s11.contains("A"))) System.out.println("This sentence doesn't have any characters");
        else{
            for (int i = 0; i < s11.length(); i++) {
            if (s11.charAt(i) == 'a' && s11.charAt(i) == 'A') counter++;
        }
            System.out.println("This sentence has " + counter + " a or A letters");
        }
        System.out.println("Task 10");
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

        System.out.println("Please enter a word");
        String s10 = input.nextLine();
        boolean isPalindrome = true;
        if (s10.length() < 1){
            System.out.println("This word does not have 1 or more characters");
        }else {
            for (int i = 0, j = s10.length() - 1; i < s10.length() / 2; i++, j--) {
                if (s10.charAt(i) != s10.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println("This word is a palindrome");
            else System.out.println("This word is not a palindrome");
        }
        System.out.println("Task 9");
        /**
        TASK-9
Write a program that asks user to enter a positive number.
Print all the number starting from 1 to given number. But, print “Foo” for the numbers divided by 2, “Bar” for the
         numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.

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
        System.out.println("Please enter a positive number");
        int s9 = input.nextInt();
        for (int i = 1; i <= s9; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 3 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);

        }

        System.out.println("Task 8");
        /**
        TASK-8
Write a program that asks user to enter a sentence as a String, and count how many words that sentence has, and print it with given below message.
NOTE: Write a program that handles any String
NOTE: First check if the given sentence has 2 words at least. If not, then just print “This sentence does not have multiple words”.

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
        System.out.println("Please enter a sentence");
        input.nextLine();
        String s8 = input.nextLine().trim();
        if (s8.contains(" ")){
            String[] array8 = s8.split(" ");
            System.out.println("This sentence has " + array8.length);
        } else {
            System.out.println("This sentence does not have multiple words.");
        }

        System.out.println("Task 7");
        /**
        TASK-7
Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included), Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.

Test data:
int randomNumber1 = 12;
int randomNumber1 = 4;
Expected output:
4 – 6 – 7 – 8 – 9 – 11 – 12
         */
        String ans7 = "";
        int num7A = RandomNumberGenerator.getARandomNUmber(0, 25);
        int num7B = RandomNumberGenerator.getARandomNUmber(0, 25);
        for (int i = Math.min(num7A, num7B); i <= Math.max(num7A,num7B); i++) {
            if(i % 5 != 0 ) {
                ans7 += i;
                if (i + 1 == Math.max(num7A,num7B) && i % 5 != 0) break;
                else {
                    ans7 += " - ";
                }
            }
        }
        System.out.println(num7A);
        System.out.println(num7B);
        System.out.println(ans7);

        System.out.println("Task 2");
        System.out.println("Please enter a sentence");
        String s2 = input.nextLine();
        if(s2.contains(" ")){
            String firstWord = s2.substring(0, s2.indexOf(" "));
            String lastWord = s2.substring(s2.lastIndexOf(" ") + 1);
            System.out.println(lastWord +
                    s2.substring(s2.indexOf(" "), s2.lastIndexOf(" ") + 1) +
                    firstWord);
        }else {
            System.out.println("This sentence does not have 2 or more words to swap");
        };
    }
}

package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("SDET");
        Matcher matcher = pattern.matcher("TechGlobal provides students a complete educational" +
                " program to be a competitive SDET in the professional IT field. With the course," +
                " students learn all the fundamental technologies needed to become an SDET professional and how " +
                "important testing is in the Software Development Life Cycle (SDLC)… Learn more about the technologies " +
                "that TechGlobal provides to its participants below and feel free to reach out to us with any questions.");
        System.out.println(matcher.matches()); // false

        int counter = 0;
        while (matcher.find()){
            counter++;
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
        System.out.println(counter);



        System.out.println("======task1==========");
        /**
        Ask the user to enter a sentence and count how many words are in the sentence.
The regex pattern for a single word is [A-Za-z]{1,}
print out how many words are in the sentence.
Scenario 1:
Program: Please enter a sentence
User: Hello, my name is John.
Program:
Hello
my
name
is
john
doe
This sentence contains 6 words
Scenario 2:
Program: Please enter a username
User:
Program: This sentence contains 0 words
         */

        String str = ScannerHelper.getAString();
        pattern = Pattern.compile("[A-Za-z]{1,}");
        matcher = pattern.matcher(str);
        int wordCount = 0;
        while (matcher.find()){
            System.out.println(matcher.group());
            wordCount++;
        }

        System.out.println("This sentence contains " + wordCount + " words");
        System.out.println("[A-Za-z0-9_-]{8,15}");
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{9,15}", "TechGlobal"));

    }
}

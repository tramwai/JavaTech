package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClasses {
    public static void main(String[] args) {
        // need to create a pattern object
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        // print as an object
        System.out.println(pattern);

        // print as a string
        System.out.println(pattern.pattern());
        System.out.println(pattern.toString());

        //print using the matches() method
        System.out.println(Pattern.matches(pattern.pattern(),"hello world"));

        String str = "I go to school at TechGlobal and I love it";
        String[] arr = str.split(" [a-z0-9]{5,10}");
        System.out.println(Arrays.toString(arr));

        // exercise
        System.out.println("========EX1=========");
        String username = ScannerHelper.getAName();
        pattern = Pattern.compile("[a-zA-z09]{5,10}");

        if (Pattern.matches(pattern.toString(), username))
            System.out.println("Valid Username");
        else System.out.println("Error! Username must be 5 to 10 characters long");

        System.out.println("========another way=========");
        if (username.matches("[a-zA-z09]{5,10}"))
            System.out.println("Valid Username");
        else System.out.println("Error! Username must be 5 to 10 characters long");


    }

}

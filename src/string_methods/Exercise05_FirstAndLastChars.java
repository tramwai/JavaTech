package string_methods;

import utilities.ScannerHelper;

public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {

        String s1;
        System.out.println(s1 = ScannerHelper.getAString());
        char char1 = s1.charAt(0);
        System.out.println("First character in the name is = " + char1 );
        String s2 = null;
        System.out.println(s1 = ScannerHelper.getAString());
        char char2 = s2.charAt(s2.length());
        System.out.println("Last character in the name is = " + s2.indexOf(s2.length() - 1));

        // Alternative solutions
        String name = ScannerHelper.getAString();
        System.out.println("First character in the name is = " + s1.charAt(0));
 //       "Last character in the name is = " + s2.charAt(s2.length());



    }
}

package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "2860 south river road des plaines il";
        String s2 = "12334 @!%$ TechGlobal";
        String s3 = "12334 @!%$ TECHGLobal" ;
        System.out.println("String: \"" + s1 + "\" has " + countLetters(s1) + " characters");
        System.out.println("String: \"" + s2 + "\" has " + countLetters(s2) + " characters");
        System.out.println("String: \"" + s3 + "\" has " + countUpperCases(s3) + " upper case characters");

        String s = "Given 12334 @!#$!@ TechGlobal";

    }

    /*
    Create a public static method which will take a string and returns the number of letters
    2860 south river road des plaines il -> 26
     12334 @!%$ TechGlobal
     */
    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    /*
    Create a public static method which will take a string and count the upper case letters and returns it
     */
    public static int countUpperCases(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    /*
    Create public static method named as printStringAttributes() takes a String as parameter
    and prints the message dynamically for the string
    Print output -> "Given "(string)" has:
                    x amount of upper cases
                    x amount of lower cases
                    x amount of letters
                    x amount of digits
                    x amount of spaces
                    x amount of specials"
       Example Output:
       Given "12345 @!#$!@ TechGlobal" has:
             2 amount of upper cases
             8 amount of lower cases
             10 amount of letters
             5 amount of digits
             2 amount of spaces
             6 amount of specials
     */

    public static void printStringAttributes(String s) {
        int upperC = 0, lowerC = 0, letterC = 0, digitC = 0, spaceC = 0, specialC = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                letterC++;
                if (Character.isUpperCase(c)) {
                    upperC++;
                } else {
                    lowerC++;
                }
            } else if (Character.isDigit(c)) {
                digitC++;
            } else if (Character.isWhitespace(c)) {
                spaceC++;
            } else {
                specialC++;
            }
        }

        System.out.println("Given \"" + s + "\"has:\n"
                + upperC + " amount of upper cases\n"
                + lowerC + " amount of lower cases\n"
                + letterC + " amount of letters\n"
                + digitC + " amount of digits\n"
                + spaceC + " amount of spaces\n"
                + specialC + " amount of special characters.");

    }

}


package loops;

public class Exercise05_FindTheIndexOf {
    public static void main(String[] args) {

        System.out.println("1. " + findFirstIndexOf("I love Java", 'a'));
        System.out.println("1. " + findLastIndexOf("I love Java", 'a'));
        System.out.println("1. " + clearChar("I love Java", 'a'));
        System.out.println(frontAndBack("abcxxxxabc"));
        System.out.println(frontAndBack("abxxxxab"));
        System.out.println(frontAndBack("wordxxxxword"));
        System.out.println(mostRepeatedChar("Banana"));

    }

    /*
    Create a public static method named as findFirstIndexOf() and it will take a string and a char then it will return
    the index of the first occurrence of the char.If char doesn't exist in the string then return -1
    example
    "I love Java", 'a' -> 8
    "Banana", 'a' -> 1
    "Banana", 't' -> -1

      */
    public static int findFirstIndexOf(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
/*
    Create a public static method named as findLastIndexOf() and it will take a string and a char then it will return
    the index of the first occurrence of the char.If char doesn't exist in the string then return -1
    example
    "I love Java", 'a' -> 8
            "Banana", 'a' -> 1
            "Banana", 't' -> -1
    */

    public static int findLastIndexOf(String s, char c) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as clearChar() and it will take a string and a char then it will return
    the string without the given char.
     */

    public static String clearChar(String s, char c){
        String newStr ="";
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != c){
               newStr += s.charAt(i);
            }
        }
        return newStr;
    }

    /*
    Create a public static method named as clearWord() and it will take two String and a char then it will return
    the string without the second string. If the second string is bigger tha then the first one , return empty
     */

    public static String clearWord(String s, String word, char c){
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i).startsWith(word)){
                newString += s.charAt(i);
            }
            else {
                i += word.length() - 1;
            }
        }
        return newString;
    }


    /*
        Create a public static method named as frontAndBack() and it will take a String, then it will return a string
        which has the most common words from start tot end
        example:
        "abcdabc" -> "abc"
        "abcbc" -> "ab"
        "aba" - > "a"
        "wordxxxword" -> "word"
     */
    public static String frontAndBack(String s){
        /*
        1. Create a container
        2. Create a fori loop
            start point: 0
            end point: s.length / 2
        3. get the substring and check if it is ending with. if it is ending, update the container
         */
        String newS = "";
        for (int i = 0; i < s.length() / 2 ; i++) {
            if (s.endsWith(s.substring(0, i + 1))){
                newS = s.substring(0, i + 1);
            }
        }
        return newS;

    }

    /*
    Create a public static method named as mostRepeatedChar() and it will take a String, then it will return a string
        which has the most repeated char from string. If there is same amount of repetition, return the first one.
        Example
        "I love java" - > "v"
        "banana" -> "a"
        "Python" -> "P"
     */

    public static char mostRepeatedChar(String s){
        /*
        1.container
        2.fori loop - check every letter
        3.if the current char has the bigger repetition, update the container
        4. return the container
         */
        char mostRepeated = ' ';
        int mostAmountOfRepetition = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) continue;
           if (countChar(s,s.charAt(i)) > mostAmountOfRepetition) {
               mostRepeated = s.charAt(i);
               mostAmountOfRepetition= countChar(s,s.charAt(i));
           }
        }
        return mostRepeated;
    }

    // supporting char method, it will take a String and a char, then it will return the number of occurrences of that char
        public static int countChar(String s, char c){
           int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) counter ++;
            }
            return counter;
        }



}




package practice.methods;

public class MethodPractices {
    public static void main(String[] args) {


//    public static void main(String[] args) {
//        printStringDescriptions("John");
//        printStringDescriptions("");
//        printStringDescriptions("JavaScript");
//        printStringDescriptions("Scrpt");
//        String str = null;
//        MethodPractices.printHasVowels(str);
//        MethodPractices.printMiddle("toyota");
//        MethodPractices.printMiddle("civic");
//        MethodPractices.printFirstLastMiddle("java");
//        MethodPractices.printFirstLastMiddle("J");
//        MethodPractices.printFirstLastMiddle("JavaScript");
MethodPractices.printIsFirstLastTwoSame("x");
    }

    public static void printStringDescriptions(String str) {
        /*
        check if it is empty -> length is zero
        else
            if it is not empty
                print the length
                print the first char
                print the last char
                check if it has vowel
         */

        // "JavaScript" , some action -> 't' index 9, length 10
        // "Java" -> 'a' index 3, length 4
        if (str.isEmpty()){
            System.out.println("Length is zero");
        }else {
            System.out.println("The length is = " + str.length() );
            System.out.println("\nThe first char is = " + str.charAt(0));
            System.out.println("\nThe last char is = " + str.charAt(str.length() - 1)); // str.substring(str.length() - 1
        }
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
            System.out.println("\nThis String is vowel ");
        }
        else{
            System.out.println("\nThe String doesn't have vowel");
        }
    }
    public  static void printHasVowels (String str){
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
            System.out.println("\nThis String is vowel ");
        }
        else{
            System.out.println("\nThe String doesn't have vowel");
        }
    }
//    public static void printMiddle(String str) {
//        if(str.length() < 3){
//            System.out.println("length is less than 3");
//        } else {
//            // if the length is even get the middle 2 chars else get the middle char
//            if (str.length() % 2 == 0) {
//                System.out.println("Middle character for even length is = " + str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
//            }else
//                System.out.println("Middle character for odd length is = " + str.substring(str.charAt(str.length() / 2)));
//        }
//        // ternary condition ? option if true : option 2 if false
//        System.out.println((str.length() % 2 == 0) ? str.substring(str.length() / 2 - 1, str.length() / 2 + 1) : str.substring(str.charAt(str.length() / 2));
//    }

        public static void printFirstLastMiddle(String input){
        if(input.length() < 4){
            System.out.println("Invalid method");
        }
        else {
            if(input.length() >= 4){
                System.out.println("First two characters are = " + input.substring(0,2));
                System.out.println("\nLast 2 characters are = " + input.substring(input.length() - 2));
                System.out.println("\nThe other characters are " + input.substring(2, input.length() - 2));
            }
        }
        }

        public static void printIsFirstLastTwoSame(String string){
//        if(string.length() < 2) {
//            System.out.println("Length is less than 2");
//        }
//        else {
//            if(string.length() >= 2){
//                if(string.substring(0,2).equals(string.substring(string.length()-2))){
//                    System.out.println("true");
//                }else {
//                    System.out.println("false");
//                }
//            }
//        }
        // ternary
            System.out.println(
                    string.length() < 2 ?
                            "Length is less than 2" :
                            string.substring(0,2).equals(string.substring(string.length()-2))
            );
        }

    }


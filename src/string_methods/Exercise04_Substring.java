package string_methods;

public class Exercise04_Substring {
    public static void main(String[] args) {
        /**
        TASK-1
            Assume you are given below sentence
            "The best is Java"
            Write a Java program that extracts "Java" from given sentence
            And store extracted value in another String
            Finally, print the extracted String
         */
        String s1 = "The best is Java";
        String s2 = s1.substring(12);
        System.out.println(s2);
        // Alternative
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.substring(s1.indexOf("Java")));
        System.out.println(s1.length() - 4);
        System.out.println(s1.substring(s1.length() - 4));

        /**
            TASK-2
            Assume you are given below sentence
             "Java is an object-oriented programming language"
            Write a Java program that extracts "Java" and "object-oriented" from given sentence
            And store extracted values in separate Strings
            Finally, print the extracted Strings
        */

        String str1 = "Java is an object-oriented programming language";
        System.out.println(str1.substring(0,4));
        System.out.println(str1.substring(11,26));

        // Alternative solutions
        String java = "Java";
        String oo = "object-oriented";
        System.out.println(str1.substring(str1.indexOf(oo) + oo.length()));
        System.out.println(str1.substring(str1.indexOf(java), java.length()));




    }
}

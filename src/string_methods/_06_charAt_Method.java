package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /**
        1.return type
        2.returns a char at given index
        3.non - static
         4. Takes one int as index
         */
    String sentence = "Java is fun";
    char c1 = sentence.charAt(3);
    char c2 = sentence.charAt(4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(sentence.charAt(9));

        // Note: Runtime error - StringIndexOutOfBoundsException
//        System.out.println(sentence.charAt(-5));
//        System.out.println(sentence.charAt(50));
//        System.out.println(sentence.charAt(1).toUpperCase); Not possible - compiler error
///       primitives cannot be used with string methods unless they are cast
        System.out.println("End of program");

    }
}

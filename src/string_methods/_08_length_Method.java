package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {
        /**
         * 1. return type
         * 2. returns an int - total count of the characters in the string
         * 3. non-static
         * 4. does not take any argument
         */
        String s = "John";
        System.out.println(s.length());
        // also
        int len = s.length();
        System.out.println(len);
        System.out.println("".length()); // 0
        System.out.println("  ".length()); // 2

    }
}

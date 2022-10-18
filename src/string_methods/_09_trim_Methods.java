package string_methods;

public class _09_trim_Methods {
    public static void main(String[] args) {
        /**
         * 1. return type
         * 2. returns a string
         * 3. non - static
         * 4. doesn't take arguments. Not overloading method
         */
        String s1 = "  Hello   ";
        System.out.println(s1.length());
        System.out.println(s1.trim().length());
        System.out.println("  Hello World  ".trim());

    }
}

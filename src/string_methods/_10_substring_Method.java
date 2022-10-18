package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
        /**
         * 1. return type
         * 2. returns partial string
         * 3. non - static
         * 4. overloaded, takes either one or two int index arguments
         */
        String s = "TechGlobal";

        // Get Global
        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1);

        // Get Tech
        String s2 = s.substring(0,4);
        System.out.println(s2);
        System.out.println(s.substring(0,15)); // StirngOutOfBoundsExcpeption


    }
}

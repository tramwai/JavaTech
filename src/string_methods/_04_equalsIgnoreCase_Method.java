package string_methods;

public class _04_equalsIgnoreCase_Method {
    public static void main(String[] args) {
        /**
         * 1. return type - if it comes with a result , it's a return type
         * 2. returns boolean
         * 3. non - static
         * 4. not overloaded and takes one string as asn argument
         */
        System.out.println("hello".equals("Hello") ); // false
        System.out.println("hello".equalsIgnoreCase("Hello")); // true
    }
}

package string_methods;

public class _14_isEmpty_Method {
    public static void main(String[] args) {
        /**
        1. return type
        2. returns boolean
        3. non-static
        4. it doesn't take any arguments

         */
        String s1 = "Hello";
        String s2 = " ";
        String s3 = ""; // length is equal to zero
        System.out.println(s1.isEmpty()); // false
        System.out.println(s2.isEmpty()); // false
        System.out.println(s3.isEmpty()); // true

    }
}

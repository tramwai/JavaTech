package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        1. return tyoe
        2. returns boolean
        3. non static
        4. takes  one an argument as CharSequence , like a strign
         */
        String s = "TechGlobal School";
        System.out.println(s.contains("Tech")); // true
        System.out.println(s.contains("School")); // true
        System.out.println(s.contains("a")); // true
        System.out.println(s.contains("E")); // false

        // Edge cases
        System.out.println(s.contains("")); // true
        System.out.println(s.contains(s)); // true
        System.out.println(s.contains("Education")); // false

    }
}

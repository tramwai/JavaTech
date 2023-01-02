package recursion;

public class Practice02_ReverseString {

    // reverse a string recursively
    public static String reverseRecursive(String str) {
        if (str.length() < 2) return str;
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseRecursive("Hello"));

    }
}

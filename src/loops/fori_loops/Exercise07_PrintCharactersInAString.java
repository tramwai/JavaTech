package loops.fori_loops;

public class Exercise07_PrintCharactersInAString {
    public static void main(String[] args) {

        // Create a program that prints each letter separately from the given string
        String str = "TechGlobal School";
        for (int i = 0; i <= str.length() - 1 ; i++) {
            System.out.println(str.charAt(i));
        }
    }
}

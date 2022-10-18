package casting;

public class CastingChars {
    public static void main(String[] args) {
        int i1 = 65;
        char c1 = (char) i1;
        System.out.println(c1);
        System.out.println((char)51);
        System.out.println((char)123);
        System.out.println((char)32);
        System.out.println((char)1020);
        char char1 = 'A'; //65
        char char2 = 97; // 'a'
        System.out.println(char1 + char2 + 3); // 65 + 97 + 3 = 165
        System.out.println("" + char1 + char2); // A + a = Aa
        System.out.println("" + (char1 + char2) + 3); // 1623 as string
        System.out.println(char1 + char2 + ""); // 162 as a string
        System.out.println(char1 + "" + char2);
        int i5 = 'A';
        System.out.println(i5);





    }
}

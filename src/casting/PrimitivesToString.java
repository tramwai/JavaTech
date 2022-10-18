package casting;

public class PrimitivesToString {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1 + num2); // 15 - primitive
        System.out.println("" + num1 + num2); //510 - String
        System.out.println("" + (num1 + num2)); // 15 - String
        System.out.println(String.valueOf(num1) + String.valueOf(num2)); // 510 string
        System.out.println(String.valueOf(23)+5); //235 String
        System.out.println();


    }
}

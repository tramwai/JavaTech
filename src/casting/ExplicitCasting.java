package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        // Explicit Casting = Narrowing = downCasting
        int age = 25;
        byte b = (byte) age;  // explicit casting
        System.out.println(b);
        // but we lose data if bigger primitive holds a datatype that can't be stored
        int num1 = 5000;
        byte num2 = (byte) num1; // risky
        System.out.println(num2);

    }
}

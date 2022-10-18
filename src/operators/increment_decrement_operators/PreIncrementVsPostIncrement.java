package operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
        //post increment
        int num1 = 5;
        num1++; // increase by 1 and assign it later
        System.out.println(num1);
        // pre Increment
        int num2 = 5;
        ++num2; // increase by 1 and assign now
        System.out.println(num2);
        // understanding the difference
        byte b1 = 5;
        byte b2 = 5;
        System.out.println(b1++); // increased in the future
        System.out.println(++b2); // increased and assigned now in this line
    }
}

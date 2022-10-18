package operators.logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean b1 = 3 < 5; // true
        boolean b2 = 5 != 5; // false
        boolean b3 = 2 == 2; // true

        boolean b4 = b1 || b2 || b3; // true
        boolean b5 = b1 && b2 && b3; // false

        System.out.println(b1); //true
        System.out.println(!b1); //false

        System.out.println(!b2 && b1 || b3); //true
        System.out.println(3 < 5 && !(5 > 10) && (3 ==3 || 5 !=5) || 4!=5); //true
        System.out.println(false || false && true || false); //false
        System.out.println(!(false || false && true || false)); // true

    }
}

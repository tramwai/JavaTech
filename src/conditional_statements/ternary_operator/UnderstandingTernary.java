package conditional_statements.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {
        // F -female ->Jane
        // M - male -> John
        char gender = ' ';
        String name = gender == 'F' || gender == 'f' ? "Jane" : "John";
        System.out.println(name);
    }
}

package conditional_statements.if_else_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /*
        -if or else statements are used to control the flow of the program based on conditions
        -conditions are always boolean statements
        -the if block can be used without the else block
        -the else block can never be used without if
         */
        boolean condition = false;

        if (condition){
            // this is the if block and it executes if the condition is true
            System.out.println("AAA");
        }else {
            // this is the else block and it executes if the condition is false
            System.out.println("BBB");
        }
        System.out.println("End of the program");

    }
}

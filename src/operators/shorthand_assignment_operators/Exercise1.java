package operators.shorthand_assignment_operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double balance,firstTransaction,secondTransaction,thirdTransaction;

        System.out.println("Hey user, please enter your balance: ");
        balance = inputReader.nextDouble();

        System.out.println("Now, please tell your first transaction: ");
        firstTransaction = inputReader.nextDouble();
        balance -= firstTransaction;
        System.out.println("Balance after 1st transaction is = $" + balance);

        System.out.println("Now, please tell your 2nd transaction: ");
        secondTransaction = inputReader.nextDouble();
        balance -= secondTransaction;
        System.out.println("Balance after 2nd transaction is = $" + balance);

        System.out.println("Now, please tell your 3rd transaction: ");
        thirdTransaction = inputReader.nextDouble();
        balance -= thirdTransaction;
        System.out.println("Balance after 3rd transaction is = $" + balance);



    }
}

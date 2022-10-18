package scanner_programs;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();               // move the cursor to next line of input ( bug fix)
        System.out.println("Please enter your address ");
        String address = scanner.nextLine();
        System.out.println("Age is = " + age);
        System.out.println("Address is = " + address);

    }
}

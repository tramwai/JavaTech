package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

       int age = ScannerHelper.getAnAge();
       if (age > 16) System.out.println("You are welcome to join the club");
       else  throw new RuntimeException("This is just for fun");

       int num = ScannerHelper.getAnumber();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Staurday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new IllegalStateException(num + " does not reflect any day");
        }
        System.out.println("End of the program");
    }
}

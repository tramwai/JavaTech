package exception_handling.try_catch;

import utilities.ScannerHelper;

public class TryCatch_Practice02 {
    public static void main(String[] args) {

        int number1 = ScannerHelper.getAnumber();
        int number2 = ScannerHelper.getAnumber();
        try {
            System.out.println(number1/number2);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("End of Program");
        }
    }


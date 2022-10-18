package mathClass;

public class MinAndMaxMethods {
    public static void main(String[] args) {
        int maxNumber1 = Math.max(80,27);
        int maxNumber2 = Math.max(maxNumber1,45);
        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("maxNumber is " + maxNumber1);
        System.out.println("maxNumber2 " + maxNumber2);
        System.out.println("maxNumber3 " + maxNumber3);

        System.out.println("minNumber is " + Math.min(80,27));
        int minNumber2 = Math.min(Math.min(80,27), 2);
        System.out.println("minNumber2 " + minNumber2 );

        int minOfTwoNeg = Math.min(-40, -60);
        System.out.println("minOfTwoNeg " + minOfTwoNeg);

        double maxOfTwoDecimals = Math.max(1.7 , 2.1);
        System.out.println("maxOfTwoDecimals is " + maxOfTwoDecimals);

        double maxOfTwoDecimalsNegative = Math.max(-5.4, -27.2);
        System.out.println("maxOfTwoDecimalsNegative" + maxOfTwoDecimalsNegative);
        // Task
        int numbersMax = Math.max(6,9);
        System.out.println("max value of the given numbers is " + numbersMax);

        int numbers2Max = Math.max(17,49);
        System.out.println("max value of the given numbers is " + numbers2Max);

        double numbers3Max = Math.max(34.2, 4.5);
        System.out.println("max value of the given numbers is " + numbers3Max);

        int negNumbersMax = Math.max(-14, -32);
        System.out.println("max value of the given numbers is " + negNumbersMax);

        int maxNum1 = Math.max(17,49);
        int maxNum2 = Math.max(maxNum1,125);

        System.out.println("Max value is " + maxNum2);


        System.out.println("Max value is " + Math.max(6,9));
        System.out.println("Max value is " + Math.max(17,49));
        System.out.println("Max value is " + Math.max(34.2, 12.5));
        System.out.println("Max value is " + Math.max(-14, 32));
        System.out.println("Max value is " + Math.max(Math.max(17, 49), 125));
        System.out.println("Max value is " + Math.min(Math.min(17,49), 125));
        System.out.println("Max value is " + Math.min(Math.min(45, 32), Math.min(56, 89) ));









    }
}

package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractices {
    public static void main(String[] args) {
        /*
        generate 5 random numbers and find their average
        First - between 5 and 15
        Second - between 3 and 10
        third - between 50 and 55
        fourth - between 6 and 63
        fifth - between 100 and 113
         */
        int r1 = RandomNumberGenerator.getARandomNUmber(5, 15);
        int r2 = RandomNumberGenerator.getARandomNUmber(3, 10);
        int r3 = RandomNumberGenerator.getARandomNUmber(50, 55);
        int r4 = RandomNumberGenerator.getARandomNUmber(6, 63);
        int r5 = RandomNumberGenerator.getARandomNUmber(100, 113);

        System.out.println("NUmber 1 = " + r1);
        System.out.println("NUmber 2 = " + r2);
        System.out.println("NUmber 3 = " + r3);
        System.out.println("NUmber 4 = " + r4);
        System.out.println("NUmber 5 = " + r5);

        System.out.println("The average is = " + (r1 + r2 + r3 + r4 + r5) / 5);
    }
}

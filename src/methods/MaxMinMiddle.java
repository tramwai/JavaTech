package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class MaxMinMiddle {
    public static void main(String[] args) {
        /*
        Write a program that generates 3 random numbers between 25 and 35, then find min, max and middle number
         */
        int r1 = RandomNumberGenerator.getARandomNUmber(25, 34);
        int r2 = RandomNumberGenerator.getARandomNUmber(25, 34);
        int r3 = RandomNumberGenerator.getARandomNUmber(25, 34);
        System.out.println("Random 1 is = " + r1);
        System.out.println("Random 2 is = " + r2);
        System.out.println("Random 3 is =  " + r3);

        System.out.println("The max is = " +  MathHelper.maxOfThree(r1, r2, r3));
        System.out.println("The min is = " + MathHelper.minOfThree(r1, r2, r3) );
        System.out.println("The middle is =" + MathHelper.middleOfThree(r1, r2, r3));


    }
}

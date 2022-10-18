package loops;

import utilities.RandomNumberGenerator;

public class Exercise03_GuessingNumber {
    public static void main(String[] args) {
        // write a program that guesses how many guesses it takes to guess the number
        int number = 3;

        int random = RandomNumberGenerator.getARandomNUmber(1,10);
        int attempt = 1;
        while (random != number){
           random = RandomNumberGenerator.getARandomNUmber(1,10);
           attempt ++;
        }
        System.out.println("It took " + attempt + " times to generate " + number);
        System.out.println("End of program");

    }
}

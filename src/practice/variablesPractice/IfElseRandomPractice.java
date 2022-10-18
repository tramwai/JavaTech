package practice.variablesPractice;

import java.util.Random;
import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number between 0 and 50(both zero and 50 are included)
        Print true if number is in between 10 and 25(10 and 25 included). Print false otherwise
         */
        Random random = new Random();
        int myRandom = (int) Math.random() * 51;
        // alternative int myRandom = (int) (Math.random() * 51;
        System.out.println("My random number is " + myRandom);
        if (myRandom >= 10 && myRandom <= 25)
            System.out.println("true");
        else
            System.out.println("false");
        // Ternary solution
        System.out.println((myRandom >= 10 && myRandom <= 25) ? "true" : "false");

        // boolean
        System.out.println((myRandom >= 10 && myRandom <= 25));

        System.out.println("===========task 2============");
        /*
        Write a program that generates a random number between 1 and 100(both 1 and 100 are included)
        find which quarter and half is the number in
        1st quarter is 1-25
        2nd quarter is 26-50
        3rd quarter is 51-75
        4th quarter is 76-100
        Test data
        34
        |Expected Result
        34 is in the 1st half
        34 is in the 2nd quarter
         */

        int myRandomNumber = (int) (Math.random() * 101);
        if (myRandomNumber <= 50) {
            System.out.println(myRandomNumber + " is in the 1st half");
            if (myRandomNumber <= 25) {
                System.out.println(myRandomNumber + " is in the 1st quarter");
            } else {
                System.out.println(myRandomNumber + " is in the 2nd quarter");
            }
        } else {
            System.out.println(myRandomNumber + " is in the 2nd half");
            if (myRandomNumber <= 75) {
                System.out.println(myRandomNumber + " is in the 3rd quarter");
            } else {
                System.out.println(myRandomNumber + " is in the 4th quarter");
            }
        }

        /*
// Scanner//
Is it raining (true/false)
Do you have umbrella? (true/false)
Are you hungry? (true/false)

// if elses //
it is raining -> it is raining outside
    if you have umbrella -> you can go outside
    otherwise -> you stay home

it is not raining -> it is not raining outside
    if you are hungry -> you go to chick-fil-a
    otherwise -> you are riding a bike
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it raining? ");
       boolean isRaining = scanner.nextBoolean();
        System.out.println("Do you have an umbrella? ");
        boolean hasUmbrella = scanner.nextBoolean();
        System.out.println("Are you hungry ");
        boolean isHungry = scanner.nextBoolean();

        if(isRaining){
            System.out.println("it is raining outside");
            if(hasUmbrella){
                System.out.println("You can go outside");
            }else {
                System.out.println("Stay home");
            }
        }else {
            System.out.println("It is not raining outside");
            if(isHungry){
                System.out.println("You go to chick fil a");
            }else System.out.println("you are riding a bike");
        }
    }
}


package conditional_statements.nested_if_else_statements;

public class Exercise1_GoldNumber {
    public static void main(String[] args) {
        /**
         * Write a program that generates a random number between -50 and 50
         * if the number is positive, then we will win 10 points
         * if the number is more than 25, then we will win extra 10 points
         * if number is -7, then we will win extra 10 points
         * if it is 7(gold number), then bonus 100 points
         */
        int randomNumber = (int)(Math.random() * 101) - 50;
        int points = 0;
        if(randomNumber > 0){
            points += 10;
            if(randomNumber > 25){
                points += 10;
            }else if(randomNumber == 7){
                points += 100;
            }
        }
        else{
            if(randomNumber == -7){
                points += 10;
            }
        }
        System.out.println("The random number is = " + randomNumber);
        System.out.println("The points we got is = " + points);
        }
    }





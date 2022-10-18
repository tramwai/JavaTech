package practice.ifElseStatements;

import java.util.Random;

public class IfElsePractice {
    public static void main(String[] args) {
        int myInt = 0;
        if(myInt >= 0 && myInt <= 24 ){
            System.out.println("first quarter");
        }else if(myInt >= 25 && myInt <= 49){
            System.out.println("second quarter");
        } else if (myInt >= 50 && myInt <= 74) {
            System.out.println("third quarter");
        }

        /*
        if the number is in between -50 and -1 "number is in negative part
        if the number is 0  "number is zero"
        if between 1 and 50 "number is in positive part"
         */
    if(myInt >= -50 && myInt <= -1){
        System.out.println("number is in negative part");
    } else if (myInt >= 1 && myInt <= 50) {
        System.out.println("number in positive part");
    }else if(myInt == 0){
        System.out.println("zero");
    }


    }
}

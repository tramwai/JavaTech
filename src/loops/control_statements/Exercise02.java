package loops.control_statements;

import utilities.ScannerHelper;

public class Exercise02 {
    /*
Write a Java program that asks user to enter 2 different integers
between 0 to 10 ( 0 and 10 are included)

Print all the numbers between given 2 integers starting
from smallest to biggest (given numbers are included)
HOWEVER, do not print the number of 5

6, 8 ->
6
7
8

4, 7 ->
4
6
7
*/

    public static void main(String[] args) {
        int givenNumber1 = ScannerHelper.getAnumber();
        int givenNumber2 = ScannerHelper.getAnumber();
        for (int i = Math.min(givenNumber1,givenNumber2); i < Math.max(givenNumber1,givenNumber2) ; i++) {
            if (i == 5) continue;;
            System.out.println(i);
        }
    }
}

package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {
        /**
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print the array
        EXPECTED:
        [#, $, 5, A, b, H]
         */


        System.out.println("===========Task 1==============");
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        String arrayAsString = Arrays.toString(characters);
        System.out.print(arrayAsString);

        /**
TASK-2
Print the size of the array with a message

EXPECTED:
The size of the array is = 6
 */

        System.out.println("\n----------TASK-2-----------\n");
        System.out.println("The size of the array is = " + characters.length);

        /**
TASK-3
Print each element using fori loop
EXPECTED:
#
$
5
A
b
H
*/

        System.out.println("\n----------TASK-3-----------\n");

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
        /**
         TASK-4
         Print each element using for each loop
         EXPECTED:
         #
         $
         5
         A
         b
         H
         */
        System.out.println("\n----------TASK-4-----------\n");
        for (char element : characters) {
            System.out.println(element);
        }

        /**
        Task 5
        Print each element that are letters
        A
        b
        h
         */
        System.out.println("\n----------TASK-5-----------\n");
        // for each loop
        for (char element : characters) {
            if (Character.isLetter(element))
                System.out.println(element);
        }
        // fori loop
        for (int i = 0; i < characters.length; i++) {
           if(Character.isLetter(characters[i])) System.out.println(characters[i]);
        }

        /**
        TASK-6
        Count how many uppercase characters you have in the array

        EXPECTED:
        2
         */
        System.out.println("\n----------TASK-6-----------\n");
        //for each loop
        int upperCase1 = 0;
        for (char element : characters) {
            if (Character.isUpperCase(element)) upperCase1++;
        }
        System.out.println(upperCase1);
        // fori loop
        int upperCase2 = 0;
        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i])) upperCase2++;
        }
        System.out.println(upperCase2);

        /**
        Additional tasks
         Count lowercase, specials, digits,spaces
         */

    }
}

package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("============Task1===========");
        /**
        Requirement:
        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list
        Expected Result:
        23
        10
        67
        [10, 23, 67, 23, 78]
         */
        ArrayList<Integer> task1 = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));
        System.out.println(task1.get(3));
        System.out.println(task1.get(0));
        System.out.println(task1.get(2));
        System.out.println(task1);


        System.out.println("\n============Task2===========");
        /**
        Requirement:
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple
        THEN:
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list
        Expected Result:
        Brown
        White
        Purple
        [Blue, Brown, Red, White, Black, Purple]
         */
        ArrayList<String> task2 = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(task2.get(1));
        System.out.println(task2.get(3));
        System.out.println(task2.get(5));
        System.out.println(task2);

        System.out.println("\n============Task3===========");
        /**
        Requirement:
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire list
        -Print the entire list sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */
        ArrayList<Integer> task3 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(task3);
        Collections.sort(task3);
        System.out.println(task3);

        System.out.println("\n============Task4===========");
        /**
        Requirement:
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        Expected Result:
        [Istanbul, Berlin, Madrid, Paris]
        [Berlin, Istanbul, Madrid, Paris]
         */
        ArrayList<String> task4 = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));
        System.out.println(task4);
        Collections.sort(task4);
        System.out.println(task4);

        System.out.println("\n============Task5===========");
        /**
        Requirement:
        -Create an ArrayList and store Marvel characters below
        Spider Man, Iron Man, Black Panter, Deadpool, Captain America
        THEN:
        -Print the entire list
        -Then, check if it contains Wolwerine
            if it contains Wolwerine, then print true
            if it does not contain Wolwerine, print false
        Expected Result:
        [Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
        false
         */
        ArrayList<String> task5 = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));
        System.out.println(task5);
        if (task5.contains("Wolverine")) System.out.println("true");
        else System.out.println("false");

        System.out.println("\n============Task6============");
        /**
        Requirement:
        -Create an ArrayList and store Avengers characters below
        Hulk, Black Widow, Captain America, Iron Man
        THEN:
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
            if it contains both, then print true
            if it does not contain both, print false
        Expected Result:
        [Black Widow, Captain America, Hulk, Iron Man]
        true
         */
        ArrayList<String> task6 = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        Collections.sort(task6);
        System.out.println(task6);
       boolean hasHulk = false;
       boolean hasIronMan = false;
        for(String name : task6){
            if (name.equals("Hulk")) hasHulk = true;
            else if(name.equals("Iron Man")) hasIronMan = true;
            if (hasHulk && hasIronMan) break;
        }
        System.out.println(hasIronMan && hasHulk);


        System.out.println("\n============Task 7============");
        /**
        Requirement:
        -Create an ArrayList and store characters below
        A, x, $, %, 9, *, +, F, G
        THEN:
        -Print the entire list
        -Print each element
        Expected Result:
        [A, x, $, %, 9, *, +, F, G]
        A
        x
        $
        %
        9
        *
        +
        F
        G
         */
        ArrayList<Character> task7 = new ArrayList<>();
        task7.add('A');
        task7.add('x');
        task7.add('$');
        task7.add('%');
        task7.add('9');
        task7.add('*');
        task7.add('+');
        task7.add('F');
        task7.add('G');
        System.out.println(task7);
        for (Character element : task7){
            System.out.println(element);
        }

        System.out.println("\n============Task 8============");
        /**
                Requirement:
        -Create an ArrayList and store below objects
        Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        -Count objects that starts with M or m
        -Count objects that does not have A or a or E or e
        Expected Result:
        [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
        [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
        3
        1
         */
        ArrayList<String> task8 = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(task8);
        Collections.sort(task8);
        System.out.println(task8);
        int startsMOrm = 0;
        int noAEOre = 0;
        for (String element : task8) {
            if (element.toLowerCase().startsWith("m")) startsMOrm++;
            if (!element.toLowerCase().contains("a") && !element.toLowerCase().contains("e")) noAEOre++;
        }
        System.out.println(startsMOrm);
        System.out.println(noAEOre);

        System.out.println("\n============Task 9============");
        /**
        Requirement:
        -Create an ArrayList and store below kitchen objects
        Plate, spoon, fork, Knife, cup, Mixer
        THEN:
        -Print the entire list
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
        -Print how many elements starts or ends with P or p
        Expected Result:
        [Plate, spoon, fork, Knife, cup, Mixer]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 3
        Elements having P or p= 3
        Elements starting or ending with P or p = 2
         */
        ArrayList<String> task9 = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(task9);
        int startUpper = 0;
        int startLower = 0;
        int hasPOrp = 0;
        int startEndPOrp = 0;
        for (String element : task9) {


            if (element.toLowerCase().contains("p")) hasPOrp++;
            if (element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) startEndPOrp++;
        }
        System.out.println("Elements starts with uppercase = " + startUpper);
        System.out.println("Elements starts with lowercase = " + startLower);
        System.out.println("Elements having P or p= " + hasPOrp);
        System.out.println("Elements starting or ending with P or p = " + startEndPOrp);

        System.out.println("\n============Task 10=============");
        /**
        Requirement:
        -Create an ArrayList and store below numbers
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire list
        -Print how many element can be divided by 10
        -Print how many even numbers are greater than 15
        -Print how many odd numbers are less than 20
        -Print how many elements are less than 15 or greater than 50
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that can be divided by 10 = 4
        Elements that are even and greater than 15 = 3
        Elements that are odd and less than 20 = 4
        Elements that are less than 15 or greater than 50 = 8
         */
        ArrayList<Integer> task10 = new ArrayList<>();
        task10.add(3);
        task10.add(5);
        task10.add(7);
        task10.add(10);
        task10.add(0);
        task10.add(20);
        task10.add(17);
        task10.add(10);
        task10.add(23);
        task10.add(56);
        task10.add(78);
        System.out.println(task10);
        int dividedBy10 = 0;
        int evenGreaterThan15 = 0;
        int oddLessThan15 = 0;
        int lessThan15Greater50 = 0;
        for (Integer element : task10) {
            if (element % 10 == 0) dividedBy10++;
            if (element % 2 == 0 && element > 15) evenGreaterThan15++;
            if (element % 2 == 1 && element < 20) oddLessThan15++;
            if (element < 15 || element > 50) lessThan15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = "+ evenGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddLessThan15);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThan15Greater50);

    }
}

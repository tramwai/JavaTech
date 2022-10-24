package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex" ,"Regina"},
                {"Abdallah", "Newer"}
        };
        System.out.println(students[0][1]); // Mehmet
        System.out.println(students[1][1]);
        System.out.println(students.length);// 3


        // print the inner array with fori loops
        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));
        }
        // print the inner array with for each loop
        for (String[] group : students) {
            System.out.println(Arrays.toString(group));
        }
        // print the multi-dimmensional array
        System.out.println(Arrays.deepToString(students)); // [[Ali, Mehmet, Alex], [Alex, Regina], [Abdallah, Newer]]

        /*
        Print each member in different lines
        ali,
        Mehmet,
        ...
         */
        //  print each student with for each loop
        for(String[] group : students){     // first loop for the student group
            for(String student : group) {   // second loop for students in each group
                System.out.println(student);
            }
        }
        // print each student with fori loop
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);
            }
        }
    }
}

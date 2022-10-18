package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {
        // create program to print backward starting from 100 to 0(100 and 0 included)
        // start point: 100
        //end point: 0
        // update: decrement
        for (int i = 100; i >= 0; i--) { // pay attention to decrement
            System.out.println(i);
        }
    }
}

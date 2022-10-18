package loops.fori_loops;

public class exercise04_PrintNumbersDividedBy5 {
    public static void main(String[] args) {

        // Create program that finds numbers divisible by 5 from 1 to 50
        // start point 1
        //end point 50
        // Update increment
        for (int i = 1; i <= 50 ; i++) {
            if(i % 5 == 0)
                System.out.println(i);
        }
    }
}

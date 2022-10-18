package loops.fori_loops;

public class Exercise03_PrintEvenNumbers {
    public static void main(String[] args) {

        /*
        create program that prints only even numbers from 0 to 10 (0 and 10  are included)
         */
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
        // another way - not recommended
        for (int i = 0; i <= 10; i += 2) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}

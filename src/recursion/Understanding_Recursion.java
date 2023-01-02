package recursion;

public class Understanding_Recursion {
    public static void print() {
        System.out.println("Hello");
        print();
    }

    // create a method that prints number from 1 to given positive number
    // iterative way
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
        // recursive way
        public static void printNumbersRecursively(int end){
        if (end == 0) return;
            printNumbersRecursively(end - 1);
            System.out.println(end);
        }


    public static void main(String[] args) {
        printNumbers(5);
        printNumbersRecursively(5);
    }
}

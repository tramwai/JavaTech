package recursion;

public class Practice01_SumOfNumbers {
    /**
Create a public static method called as sum
It takes an int which is a positive number
It returns the sum of numbers starting from 1 to given int
5 -> 1+2+3+4+5 -> 15
 */

    //Iterative way
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumRecursive(int end){
       if (end != 0) return end + sumRecursive(end - 1);
       return 0;
    }


    /**
    Create a public static method called as productRecursively
    It takes an int which is a positive number
    It returns the product of numbers starting from 1 to given int

    5 -> 1*2*3*4*5 -> 120
    4 -> 24
 */
    public static int productRecursive(int end){
        if (end != 1) return end * productRecursive(end - 1);
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sumRecursive(5));
        System.out.println(productRecursive(4));
    }
}

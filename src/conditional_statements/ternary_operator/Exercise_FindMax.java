package conditional_statements.ternary_operator;

public class Exercise_FindMax {
    public static void main(String[] args) {
        /*
        Task
        write a program that generates 2 random numbers between 1 and 25. Find and print the greatest number
         */
        int num1 = (int)(Math.random() * 25) +1;
        int num2 = (int)(Math.random() * 25) +1;
        System.out.println("The random number 1 is = " + num1);
        System.out.println("The random number 2 is = " + num2);

        System.out.println("\n===========Solution with Math Class===============");
        int max1 = Math.max(num1, num2);
        System.out.println(max1);

        System.out.println("\n===========Solution with if-else===============");
        int max2 = Integer.MIN_VALUE;
        System.out.println(max2); // max2 now holds -2147483648

        if(num1 > num2) max2 = num1;
        else max2 = num2;
        System.out.println(max2);

        System.out.println("\n===========Solution with ternary operator===============");

        int max3 = num1 > num2 ? num1 : num2;
        System.out.println(max3);





    }
}

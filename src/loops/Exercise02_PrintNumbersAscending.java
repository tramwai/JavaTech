package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {

        // program that prints numbers from 1 to 10 as below
        // 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10

        System.out.println("----Proper way-------");
        String result = "";
        for (int i = 1; i <= 10 ; i++) {
            result += i + " - ";
        }
        System.out.println(result.substring(0, result.length() - 3));


        System.out.println("Another way");
        for (int i = 1; i <= 10 ; i++) {
            if(i != 10) System.out.print(i + " - ");
            else System.out.println(i);
        }



    }
}

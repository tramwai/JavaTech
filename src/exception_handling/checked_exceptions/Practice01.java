package exception_handling.checked_exceptions;

public class Practice01 {
    public static void main(String[] args)  {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

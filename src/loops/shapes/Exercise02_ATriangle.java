package loops.shapes;

public class Exercise02_ATriangle {
    public static void main(String[] args) {
        /*
Write a program that prints below triangle
A
AA
AAA
AAAA
AAAAA
AAAAAA
 */
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}

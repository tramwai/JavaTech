package loops.fori_loops;

public class Exercise08_CountCharachtersInAString {
    public static void main(String[] args) {

        /*
            create a program that counts how many times the letter 'o' is in the string
        */
        String str = "TechGlobal School";
        int counter = 0;
        for (int i = 0; i <= str.length() - 1 ; i ++) {
            if(str.charAt(i) == 'o')
           counter ++;
        }
        System.out.println(counter);
    }
}

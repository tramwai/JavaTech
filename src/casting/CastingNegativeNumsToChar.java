package casting;

public class CastingNegativeNumsToChar {
    public static void main(String[] args) {
        int negative = -65;
        char myChar = (char) negative;
        char zero = 48;
        char upperA = 65;
        char upperZ = 90;
        char myCharO = 'O';
        int oAsciiValue = myCharO;


        System.out.println("Zero = " + zero);
        System.out.println(myChar);
        System.out.println("Upper case A = " + upperA);
        System.out.println("Upper case Z = " + upperZ);
        System.out.println("Upper case O is = " + myCharO);
        System.out.println("O Ascii value = " + oAsciiValue);

        if (oAsciiValue >= 65 && oAsciiValue <= 90)
            System.out.println("Your char is upper case");
        else
            System.out.println("Your char is not upper case");


    }
}

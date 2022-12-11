package exception_handling.try_catch;

import utilities.ScannerHelper;

import java.util.Scanner;

public class TryCatch_Practice01 {
    public static void main(String[] args) {
        String name = ScannerHelper.getAName();

       try {
           System.out.println(name.charAt(3));
       }
       catch (StringIndexOutOfBoundsException e ){
           e.printStackTrace();
       }
        System.out.println("Hello " + name);


    }
}

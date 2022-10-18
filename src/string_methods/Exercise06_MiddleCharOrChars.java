package string_methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import utilities.ScannerHelper;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {
    //

        // for odd numbers -  s.charAt((s.length) / 2); formula to find the middle
        // for even numbers - s.substring(s.length / 2 - 1, s.substring(s.length / 2  + 1) //
//                            s.substring(s.length(left side of the name, right side of the name)

        // Write a program that asks user to enter a name and find middle charcater if the name has odd count of char
        //                                                  find middle char if name has even count of chars

        // Better solution
        String name = ScannerHelper.getAName();
        if (name.length() % 2 == 0){
            System.out.println("Middle char is = " + name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
        }
        else
            System.out.println("Middle char is = " + name.charAt(name.length() / 2));
    }

}


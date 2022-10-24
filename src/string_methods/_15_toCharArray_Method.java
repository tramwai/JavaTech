package string_methods;

import java.util.Arrays;

public class _15_toCharArray_Method {
    public static void main(String[] args) {
        /**
        return type
        returns a char array
        non-static(we call it with object name)
        it doesn't take any args
         not overloaded
         */
        String s = "TechGlobal School";
        System.out.println(Arrays.toString(s.toCharArray()));
    }
}

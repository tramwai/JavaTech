package string_methods;

import java.util.Arrays;

public class _16_split_Methods {
    /*
    return type
    returns a String array
    non-static , called with object
    takes regex as argument
    regex - regular expression or pattern
     */
    public static void main(String[] args) {
        String s = "Today is Sunday and the weather is nice";
        String[] arr1 = s.split(" "); //[Today, is, Sunday, and, the, weather, is, nice]
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(s.split("is"))); //[Today ,  Sunday and the weather ,  nice]

    }
}

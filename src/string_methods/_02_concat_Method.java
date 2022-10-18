package string_methods;

public class _02_concat_Method {
    public static void main(String[] args) {
        /**
        1. return type -  - if you are able to return a result and put it in a different variable, then it's return type
        2. returns a String
        3. non-static
        4. takes one argument as string
         */
        String str1= "Tech";
        String str2 = "Global";
        String str3 =str1.concat(str2); // ->
        System.out.println(str3);

    }
}

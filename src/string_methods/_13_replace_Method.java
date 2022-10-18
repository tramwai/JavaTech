package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /**
        1. return type
        2. returns a string
        3. non - static
        4. There are overloaded methods - one takes 2 chars to be replaced, the other takes  two strings to be replaced
         */
        String s = "Can I can a can";
        String s1 = s.replace('c', 'x');
        System.out.println(s1); // Can I xan a xan
        System.out.println(s.replace("can", "xxx")); // Can I xxx a xxx
        System.out.println(s.toLowerCase().replace("can", "xxx")); //xxx i xxx a xxx

        // Edge Cases
        String str1 = "John";
        str1 = str1.replace("o", "oooo");
        System.out.println(str1);
        String str2 = "apple";
        str2 = str2.replace("abc", "xyz");
        System.out.println(str2);
        String str3 = "Orange";
        str3 = str3.replace("Orange", "");
        System.out.println(str3);


    }
}

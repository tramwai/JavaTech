package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        /**
         * 1. return type
         * 2. returns int which is matching the index
         * 3. non - static - we call the method with an object
         * 4. It takes a char or String. There are overloaded methods
         */
        String company = "TechGlobal School";
        int firstIndexOfo = company.indexOf('o'); // 6
        System.out.println(firstIndexOfo);
        int lastIndexOfo = company.lastIndexOf('o');
        System.out.println(lastIndexOfo);

        // find the first and last indexes of l
        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf("X")); // -1 == NOT FOUND
        System.out.println(company.indexOf("School"));


    }
}

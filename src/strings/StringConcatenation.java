package strings;

public class StringConcatenation {
    public static void main(String[] args) {
//        // Declaration
//        String city;
//        city = "Berlin"; // assignment of empty string
//        city = "Brugge";
//        System.out.println(city);
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // assignement
        System.out.println("\n-----------Concatenation with + operator-------");
        String firstName = "Mihai";
        String lastName = "Hariton";
        String fullName =firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("\n-----------Concatenation with concat() method operator-------");

        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);

        

    }
}

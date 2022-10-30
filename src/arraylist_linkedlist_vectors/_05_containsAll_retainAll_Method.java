package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Collections;

public class _05_containsAll_retainAll_Method {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        /**
        Check if the countries ArrayList contains Spain
        print true if it does, false otherwise
         */
        System.out.println(countries.contains("Spain"));

        /**
        Check if it contains Sweden and Denmark
         */
        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));
        // Long way
        boolean hasSweden = false; boolean hasDenmark = false;
        for (String country : countries) {
            if (country.equals("Sweden")) hasSweden = true;
            else if(country.equals("Denmark")) hasDenmark = true;

            if(hasDenmark && hasSweden) break; // eliminating redundant checks after both are found
        }
        System.out.println(hasDenmark && hasSweden);

        /**
         Check if it contains Sweden, Spain, Germany, Portugal
         */
        ArrayList<String> europeCountries = new ArrayList<>();
        europeCountries.add("Sweden");
        europeCountries.add("Spain");
        europeCountries.add("Germany");
        europeCountries.add("Portugal");
        europeCountries.add(("Italy"));
        System.out.println("\n contains all");
        System.out.println(europeCountries.containsAll(europeCountries));

        // retainAll() method
        countries.retainAll(europeCountries);
        System.out.println(countries);
        Collections.sort(countries);
        System.out.println(countries);
    }
}

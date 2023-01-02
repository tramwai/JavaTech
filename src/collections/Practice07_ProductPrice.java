package collections;

import java.util.*;

public class Practice07_ProductPrice {
    public static void main(String[] args) {

        /*
        iPhone ->       1000
        Macbook Pro ->  1300
        iMac ->         1500
        AirPods     ->  200
        iPad        ->  700
        Find the most expensive product and print it as below
        Expected:
        iMac is the most expensive with the price of $1500.0
         */

        /*
        pseudoCode:
        1. Store the items in a HashMap
        2. find the max price value from HashMap values
        3. Loop and find the item which has the value equals max price value
         */

        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("Macbook Pro ", 1300.0);
        products.put("iMac", 1500.0);
        products.put("AirPods", 200.0);
        products.put("iPad", 700.0);

        Map.Entry<String, Double> mostExpensiveEntry = products.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(mostExpensiveEntry);
//        double maxPrice = new TreeSet<>(products.values()).last();
//        for (Map.Entry<String, Double> entry : products.entrySet()) {
//            if (entry.getValue() == maxPrice){
//                System.out.println(entry.getKey() + " is the most expensive with the price of $" + entry.getValue());
//                break;
//            }
//        }
    }
}

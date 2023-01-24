package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {


    /**
    // Task 1
    Requirement:
    Write a method called as parseData() which takes a String has some keys in {} and values after between }{
     and returns a collection that has all the keys and values as entries.
    NOTE: The keys should be sorted!

    Test Data:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}London

    Expected Output:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}

     */

    public static Map<Integer, String> parseData(String data) {
        Map<Integer, String> result = new TreeMap<>();
        String[] parts = data.split("\\}");
        for (String part : parts) {
            String[] keyValue = part.split("\\{");
            if (keyValue.length == 2) {
                result.put(Integer.parseInt(keyValue[1]), keyValue[1]);
            }
        }
        return result;
    }




    /**
    Task2
    Requirement:
    Write a method called as calculateTotalPrice1() which takes a Map of some shopping items with their amounts
    and calculates the total prices as double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25

    Test Data 1:
    {Apple=3, Mango = 1}

    Expected Output 1:
    10.99

    Test Data 2:
    {Apple=2, Pineapple = 1, Orange=3}

    Expected Output 2:
    19.12

     */

    public static double calculateTotalPrice1(Map<String, Integer> fruits) {
        double totalSum = 0;

        Map<String, String> prices = new HashMap<>();

        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        prices.put("Pineapple", "$5.25");

        for (String product : fruits.keySet())
            for (int i = 0; i < fruits.get(product); i++)
                totalSum += Double.parseDouble(prices.get(product).substring(1));
        return (double) Math.round(totalSum * 100) / 100;
    }

        /**
         Task3
         Requirement:
         Write a method calculateTotalPrice2() which takes a Map of some shopping items with their
         amounts and calculates the total prices as double. Item prices are given below
         Apple = $2.00
         Orange = $3.29
         Mango = $4.99

         BUT there will be some discounts as below
         There will be %50 discount for every second Apple
         There will be 1 free Mango if customer gets 3. So, fourth one is free.

         Test Data 1:
         {Apple=3, Mango = 5}

         Expected Output 1:
         24.96

         Test Data 2:
         {Apple=4, Mango = 8, Orange=3}

         Expected Output 2:
         45.81

         */

        public static double calculateTotalPrice2(Map<String, Integer> items) {
            double totalPrice = 0.0;
            final double APPLE_PRICE = 2.00;
            final double ORANGE_PRICE = 3.29;
            final double MANGO_PRICE = 4.99;

            if (items.containsKey("Apple")) {
                int appleCount = items.get("Apple");
                int appleDiscountCount = appleCount / 2;
                totalPrice += (appleCount - appleDiscountCount) * APPLE_PRICE;
            }
            if (items.containsKey("Orange")) {
                totalPrice += items.get("Orange") * ORANGE_PRICE;
            }
            if (items.containsKey("Mango")) {
                int mangoCount = items.get("Mango");
                int mangoDiscountCount = mangoCount / 4;
                totalPrice += (mangoCount - mangoDiscountCount) * MANGO_PRICE;
            }
            return totalPrice;
        }



    public static void main (String[]args){

        System.out.println("=================Task1=================\n");
        Map<Integer, String> result = parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London");
        System.out.println(result + "\n");


        System.out.println("=================Task2=================\n");
        Map<String, Integer> Task2Items1 = new HashMap<>();
        Task2Items1.put("Apple", 3);
        Task2Items1.put("Mango", 1);
        double totalPrice1Task2 = calculateTotalPrice1(Task2Items1);
        System.out.println("Total Price 1: $" + totalPrice1Task2);

        Map<String, Integer> Task2Items2 = new HashMap<>();
        Task2Items2.put("Apple", 2);
        Task2Items2.put("Pineapple", 1);
        Task2Items2.put("Orange", 3);
        double totalPrice2Task2 = calculateTotalPrice1(Task2Items2);
        System.out.println("Total Price 2: $" + totalPrice2Task2);


        System.out.println("=================Task3=================\n");
        Map<String, Integer> items1 = new HashMap<>();
        items1.put("Apple", 3);
        items1.put("Mango", 5);
        double totalPrice1Task3 = calculateTotalPrice2(items1);
        System.out.println("Total Price 1: $" + totalPrice1Task3);

        Map<String, Integer> items2 = new HashMap<>();
        items2.put("Apple", 4);
        items2.put("Mango", 8);
        items2.put("Orange", 3);
        double totalPrice2Task3 = calculateTotalPrice2(items2);
        System.out.println("Total Price 2: $" + totalPrice2Task3);

    }
}

package homeworks;

import java.util.HashMap;

public class Homework16_Recap {

    public static void main(String[] args) {

        System.out.println("=============Task 1================");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("=============Task 2================");
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Apple", 3);
        hm1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(hm1));

        System.out.println("=============Task 3================");
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("Apple", 4);
        hm2.put("Mango", 8);
        hm2.put("Orange", 3);
        System.out.println(calculateTotalPrice2(hm2));

    }


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

    public static HashMap<Integer, String> parseData(String str){
        HashMap<Integer, String> hm = new HashMap<>();
        String[] arr = str.split("[{}]");

        for (int i = 1; i < arr.length; i++) {
            hm.put(Integer.parseInt(arr[i]), arr[i + 1]);
            i++;
        }
        return hm;
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

    public static double calculateTotalPrice1(HashMap<String, Integer> hm){
        double price = 0.0;
        for (String s : hm.keySet()) {
            switch (s){
                case "Apple":
                    price += hm.get("Apple") * 2.00;
                    break;
                case "Mango":
                    price += hm.get("Mango") * 4.99;
                    break;
                case "Orange":
                    price += hm.get("Orange") * 3.29;
                    break;

                case "Pineapple":
                    price += hm.get("Pineapple") * 5.25;
                    break;
            }
        }
        return price;
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

    public static double calculateTotalPrice2(HashMap<String, Integer> hm){
        double price = 0.0;
        for (String s : hm.keySet()) {
            switch (s){
                case "Apple":
                    for (int i = 1; i <= hm.get("Apple") ; i++) {
                        if (i % 2 == 0) price += 1.00;
                        else price += 2.00;
                    }
                    break;
                case "Mango":
                    for (int i = 1; i <= hm.get("Mango"); i++) {
                        if (i % 4 != 0) price += 4.99;
                    }
                    break;
                case "Orange":
                    price += hm.get("Orange") * 3.29;
                    break;
            }
        }
        return price;
    }



}

package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _07_Map_Implementations {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Beyza");
        map.put(1, "Malek");
        System.out.println(map.size());
        System.out.println(map);
        map.put(2, "Malek");
        System.out.println(map.size());
        System.out.println(map);

        map.put(null, "Andrii");
        map.put(null, "Vlad");
        System.out.println(map);
        map.put(3, "Viktoriia");
        map.put(4, null);
        map.put(5, null);
        map.put(6, null);
        map.put(-5, "Ashraf");
        map.put(0, "filiz");
        System.out.println(map);




    }
}

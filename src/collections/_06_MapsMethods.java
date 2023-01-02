package collections;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.*;

public class _06_MapsMethods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println(capitals);

        System.out.println("\n==========Retrieve values with their keys\n");
        System.out.println(capitals.get("Spain"));
        System.out.println(capitals.get("Belgium"));
        System.out.println(capitals.getOrDefault("Belgium", "Does not exist"));

        System.out.println("\n==========Check map if it contains keys or values\n==================");
        System.out.println(capitals.containsKey("Portugal"));
        System.out.println(capitals.containsKey("Germany"));
        System.out.println(capitals.containsValue("Berlin"));
        System.out.println(capitals.containsValue("Istanbul"));

        System.out.println("\n==========Update values for their key===========\n");
        System.out.println(capitals.replace("Ukraine", "Kyiv"));
        System.out.println(capitals.replace("Germany", "berlin", "Munich")); // false
        System.out.println(capitals.replace("Germany", "Berlin", "Munich")); // true
        capitals.put("Turkey", "Ankara");
        System.out.println(capitals);
        capitals.put("Turkey", "Istanbul");
        System.out.println(capitals);
        System.out.println(capitals.keySet());

        System.out.println("\n==========remove keys==========\n");
        capitals.remove("France");
        System.out.println(capitals);

        capitals.remove("US");
        capitals.remove("Germany", "Munich");
        System.out.println(capitals);

        System.out.println("\n========== advanced map methods==========\n");

        TreeSet<String> treeSet = new TreeSet<>(capitals.keySet());
        System.out.println(treeSet);
        // keys: Turkey, Italy, Spain
        Set<String> set = capitals.keySet();
        System.out.println(set);
        Collection<String> collection = capitals.values();
        System.out.println(collection);
        ArrayList<String> list = new ArrayList<>(capitals.values());
        System.out.println(list);

        System.out.println("\n========== Iterating entries==========\n");
        for (String s : capitals.keySet()) {
            System.out.println(s);
        }

        for (String value : capitals.values()) {
            System.out.println(value);
        }

        System.out.println("\n========== Getting all the entries==========\n");
        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}

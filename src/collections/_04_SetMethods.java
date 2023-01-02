package collections;

import java.util.*;

public class _04_SetMethods {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Foo");
        set.add("Bar");
        set.add("foo");
        set.add("bar");
        set.add("abc");
        set.add("xxx");
        System.out.println(set); // [Bar, bar, abc, Foo, foo, xxx]
        System.out.println(set.size()); // 6
        System.out.println(set.isEmpty()); // false
        System.out.println(set.contains("bar")); // true
        System.out.println(set.remove("AAA")); // false
        System.out.println(set.remove("xxx")); // true
        System.out.println(set); // [Bar, bar, abc, Foo, foo]
        System.out.println(set.equals(set)); // true
        set.removeIf(e -> e.toLowerCase().startsWith("b"));
        System.out.println(set);
        // print with for each lambda
        set.forEach(System.out::println);
        // same
        Iterator<String> it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());

        set.removeAll(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set);

    }
}

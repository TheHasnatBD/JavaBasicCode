package HashMap_HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<String>();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");

        System.out.println(strings);
        System.out.println("Size: "+strings.size());

        strings.remove("2");
        System.out.println(strings);

        strings.clear();
        System.out.println(strings);

        boolean b = strings.isEmpty();
        System.out.println("Is Empty? >> "+b);

    }
}

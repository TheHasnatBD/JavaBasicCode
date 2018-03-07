package HashMap_HashSet;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> student = new HashMap<Integer, String>();

        student.put(1,"Hasnat");
        student.put(2,"Abu Huraira");
        student.put(3,"Moin Uddin");

        System.out.println(student.get(2));
        System.out.println(student.get(3));
    }
}

package LinkedList.Basic;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<String>();

        //---------------------ADD---------------
        strings.add("DU");
        strings.add("BU Main");
        strings.add("CU");
        strings.add("KU");
        strings.add("EU");
        strings.add("BU 1");
        strings.add("BU 2");
        strings.add("BU 3");

        //add to 3 number index
        strings.add(3, "JU");

        //Add to first
        strings.addFirst("RU");

        //add to last
        strings.addLast("SU");


        //-----------------REMOVE-----------
        //Remove linked list
        strings.remove("BU 3");
        strings.remove(3);
        strings.removeFirst();
        strings.removeLast();


        //------------------ PRINT --------------
        //All collection print
        System.out.println("Linked List All [] = "+strings);
        System.out.println("Linked List Size = "+strings.size()+"\n");

        for (String versity : strings){
            System.out.println(versity);
        }

        //------------GET---------
        System.out.println("Linked List First value >> "+strings.getFirst());
        System.out.println("Linked List Last value >> "+strings.getLast());

        //--------CLEAR-------
        strings.clear();
        System.out.println("After clearing Linked List >> "+strings);

    }
}

package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {
        /*
        ArrayList - LinkedList
        LinkedList - ArrayList
        Vector - ArrayList
        ArrayList - Vector
        Vector - LinkedList
        LinkedList - Vector
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        //Converting ArrayList to a LinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);

        System.out.println("The LinkedList is = " + numbers2);

        //Converting LinkedList to ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);

        System.out.println("The ArrayList(converted from LinkedList) is = " + numbers3);

        //Vector
        //It is "Thread Safe" Aka can be used in multiple different/concurrent operations
        //*High level**Understand don't memorize*
        //REMEMBER Vector is like ArrayList but "Thread Safe"
        String[] namesArr = {"Kaly","Torrie","Taylor"};
        Vector<String> names = new Vector<>(Arrays.asList(namesArr));
        System.out.println("The Vector is = " + names);




    }
}

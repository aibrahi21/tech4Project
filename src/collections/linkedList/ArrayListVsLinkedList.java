package collections.linkedList;

import java.util.*;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {


        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);
//Looping LinkedList
        for(Double d: numbers){
            System.out.println(d);
        }
        // fori loop
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        //some methods
        System.out.println(numbers.get(0));
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        //more methods
        System.out.println("Peek");
        System.out.println(numbers.peek()); //same as getFirst
        System.out.println(numbers.peekFirst()); // 10.5
        System.out.println(numbers.peekLast()); // 17.7
        System.out.println("Whole array");
        System.out.println(numbers);
        System.out.println("Poll");
        System.out.println(numbers.poll()); //retrieves the first element and removes it
        System.out.println(numbers.pollFirst()); //retrieves the first element and removes it
        System.out.println(numbers.pollLast()); //retrieves & removes the last element
        System.out.println("Push");
        numbers.push(5.7); // adds the object to the hat/ to the first index ( index 0)
        numbers.push(8.9); // moves in front of 5.7 b/c ^^^
        System.out.println(numbers);
        System.out.println("Pop");
        System.out.println(numbers.pop()); // pulls the first element our of the array
        System.out.println(numbers);

    }
}

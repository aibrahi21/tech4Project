package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        Create a List and store below data ~ Countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal
         */
        System.out.println("\n--------TASK 1--------\n");
        String[] countries$ = {"USA","Brasilia","Argentina","France","Belgium","Germany","Portugal"};

        //WAY--1 to convert Array to List (ArrayList or LinkedList)
        System.out.println("\n--------Way 1--------\n");
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries$));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries$));
        System.out.println(countries1);
        System.out.println(countries2);
        /*
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Brasilia");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");
        System.out.println(countries);
         */

        //WAY--2 to convert Array to List (ArrayList or LinkedList)
        //Using Collections.addAll(ArrayList/LinkedList, Array);
        System.out.println("\n--------Way 2--------\n");
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();
        Collections.addAll(countries3, countries$);
        Collections.addAll(countries4, countries$);

        System.out.println(countries3);
        System.out.println(countries4);

        //WAY--3 Manual way
        System.out.println("\n--------Way 3--------\n");

        int[] numbers = {1,2,3,4,5};

        List<Integer> numbersList = new ArrayList<>(); // or LinkedList

        for(int i : numbers){
            numbersList.add(i);
        }
        System.out.println(numbersList);
    }
}

package collections;
import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a list to store the below data
        {"Berlin","Chicago","Dallas","Miami","Brugge","Kiev"}
        TASK 1
        Remove Miami and Dallas
         */
        System.out.println("\n--------TASK 1--------\n");
        String[] city = {"Berlin","Chicago","Dallas","Miami","Brugge","Kiev"};
        List<String> cities = new LinkedList<>(Arrays.asList(city));
        System.out.println(cities);
        cities.remove("Miami");
        cities.remove("Dallas");
        System.out.println(cities);

    }
}

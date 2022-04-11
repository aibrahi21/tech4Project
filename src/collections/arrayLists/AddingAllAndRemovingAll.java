package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("Mercedes");
        germanCars.add("BMW");
        germanCars.add("VolksWagon");
        System.out.println("German cars = " + germanCars);

        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Lexus");
        japaneseCars.add("Nissan");
        japaneseCars.add("Toyota");
        System.out.println("Japanese cars = " + japaneseCars);

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Mercedes Maybach branch");
        luxuryCars.add("Rolls Royce");
        luxuryCars.add("Rivian");
        System.out.println("Luxury cars = " + germanCars);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Odds = "+count);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);
        int countU= 0;
        for (String color : colors) {
            if (Character.isUpperCase(color.charAt(0)))
            countU++;
        }
        System.out.println(countU);
    }
}







package oop_principles.class_objects;

import java.util.*;

public class AppleTest {
    public static void main(String[] args) {
        //Create 2 Apple objects
        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;
        System.out.println(apple1); //oop_principles.class_objects.Apple@1540e19d
        System.out.println(apple1.color); // Red
        System.out.println(apple1.taste); // Sweet
        System.out.println(apple1.price); // .99
        //My way
        System.out.println("\n---MY WAY---\n");
        System.out.println(apple1.colors[0]);
        System.out.println(apple1.tastes[1]);
        System.out.println(apple1.prices[0]);
        System.out.println();
        Apple apple2 = new Apple();
        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;
        System.out.println(apple2); //oop_principles.class_objects.Apple@677327b6
        System.out.println(apple2.color); // Green
        System.out.println(apple2.taste); // Sour
        System.out.println(apple2.price); // 1.29
        //My way
        System.out.println("\n---MY WAY---\n");
        System.out.println(apple2.colors[2]);
        System.out.println(apple2.tastes[0]);
        System.out.println(apple2.prices[1]);

        //NOTE don't have to do .toString SPECIFICALLY (IN THIS CASE)
        System.out.println();
        System.out.println(apple1);
        System.out.println(apple2);

        Apple apple3 = new Apple();
        apple3.color = "Yellow";
        apple3.price = .95;
        apple3.taste = "Sweet";
        System.out.println(apple3);

        //apple1, apple2, apple3
        Apple[] myApples = {apple1, apple2, apple3};
        System.out.println(Arrays.toString(myApples));
        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples));
        System.out.println(myAppleList);
        for (Apple apple : myAppleList) {
            System.out.println("My Apple is =" + apple);
        }
        for (Apple apple : myAppleList) {
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
        }
    }
}

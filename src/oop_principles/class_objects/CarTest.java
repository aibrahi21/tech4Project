package oop_principles.class_objects;


import java.util.*;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1); // Class location // UNTIL toString IS ADDED TO THE CAR CLASS

       System.out.println(car1.getClass().getName()); // Class Name
        car1.make = "Tesla";
        car1.model = "S";
        car1.year = 2022;
        car1.color = "Red";



        System.out.println(car1.make); // Tesla
        System.out.println(car1.model); // S
        System.out.println(car1.year); // 2022
        System.out.println(car1.color); // Red
        System.out.println();

        Car car2 = new Car();
        car2.color = "White";
        car2.make = "BMW";
        System.out.println(car2.make); // BMW
        System.out.println(car2.model); // S
        System.out.println(car2.year); // 2022
        System.out.println(car2.color); // White
        System.out.println();

        Car car3 = new Car();
        car3.make = "Audi";
        System.out.println(car3.make); // null
        System.out.println(car3.model); // null
        System.out.println(car3.year); // 0
        System.out.println(car3.color); // null

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.drives(); // This car drives
        car2.drives(); // ""
        car3.drives(); // ""

        car1.honks(); // This car honks
        car2.honks(); // ""
        car3.honks(); // ""

        Car car4 = new Car();
        car4.make = "Tesla";
        car4.model = "X";
        car4.year = 2022;
        car4.color = "black";

        System.out.println("\n________Cars List________\n");
        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);
        myCars.add(car4);

        //Print which of the cars are "Tesla"
        //NOTE if anything checked is null, it throws a null point error at you
        for (Car myCar: myCars) {
            if (myCar.make.equals("Tesla"))
                System.out.println(myCar);
        }



    }
}

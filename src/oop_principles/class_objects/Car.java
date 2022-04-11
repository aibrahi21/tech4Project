package oop_principles.class_objects;

public class Car {

    //default constructor
    public Car(){

    }


    /*
    Attributes of a car
    make, model, year, color
     */
    // "Template"
    public int year;
    public String make;
    public String model;
    public String color;


    //Defining some behaviors of the car objects
    //WHAT THE CAR DOES
    public void drives(){
        System.out.println("This car drives");
    }

    public void honks(){
        System.out.println("This car honks");
    }

    //Override toString() method that comes from Object class
    //Overriding is implementing another body for the parent method
    //RIGHT CLICK -> GENERATE -> toString
    // NOTE THAT THIS IS BEING CALLED OUTSIDE THE CURLY BRACES FOR THE CAR OBJECT
    @Override // Annotation
    public String toString() {
        return "Car{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

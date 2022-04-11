package oop_principles.class_objects;

public class Apple {
    //class members
    /*
    1. attributes
    2. methods
    3. blocks
    4. constructors - helps us to create objects
     */

    // This is the default constructor
    // NOTE : THE DEFAULT CONSTRUCTOR IS ONLY PRESENT(Without being called) WHEN NO CUSTOM CONSTRUCTORS HAVE BEEN CREATED
    // IF A CUSTOM CONSTRUCTOR IS CREATED, MANUALLY CALL THE DEFAULT IF THE DEFAULT IS REQUIRED
    //default constructor
    public Apple (){

    }

    //Define instance variables (color, taste, price)
    public String color;
    public String[] colors = {"Red", "Yellow", "Green", "Pink"};
    public String taste;
    public String[] tastes = {"Sour", "Sweet"};
    public double price;
    public double[] prices = {0.99, 1.29};



    public String toString (){
        return "Apple{" + "color='" + color + "', " + "taste='" + taste + "', " + "price='" + price +"'}";
    }

}

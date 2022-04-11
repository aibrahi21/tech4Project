package oop_principles.class_objects;

public class Fruit {
    //Instance variables
    public static boolean hasColor; //false
    public String name; //null
    public String shape; //null
    public boolean isSweet; //false
    static{
        hasColor = true;
    }
    {
        isSweet = true;
        shape = "Round";
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

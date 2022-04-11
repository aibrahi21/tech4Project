package homework;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.awt.*;

public class Homework09 {
    public static void main(String[] args) {
        //Task 1
        String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.substring(0,1));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
        if(name.startsWith("a") || name.startsWith("A"))
            System.out.println("You are in the club!");
        else
            System.out.println("Sorry, you are not in the club");
        System.out.println();

        //Task 2
        String address = ScannerHelper.getAddressFromUser();
        if (address.contains("Chicago")||address.contains("chicago"))
            System.out.println("You are in the club.");
        else if (address.contains("Des Plaines"))
            System.out.println("You are welcome to join the club.");
        else
            System.out.println("Sorry, you will never be in the club.");
        System.out.println();

        //Task 3
        String color = ScannerHelper.getColorFromUser();
        color = color.toUpperCase();
        if (color.contains("GREEN") && color.contains("RED"))
        System.out.println("Green and red are in the list");
        else if (color.contains("GREEN") || color.contains("RED"))
            if (color.contains("GREEN"))
                System.out.println("Green is in the list");
            else
                System.out.println("Red is in the list");
        else
        System.out.println("Green and red are not in the list");

        //Task 4
        String str = " Java is FUN ";
        String str1 = str.substring(0,5);
        String str2 = str.substring(5,8);
        String str3 = str.substring(9,12);
        System.out.println("The first word in the str is = " + str1.trim());
        System.out.println("The second word in the str is = " + str2.trim());
        System.out.println("The third word in the str is = " + str3.toLowerCase());


    }
}
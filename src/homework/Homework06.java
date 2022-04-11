package homework;

import java.util.Arrays;
import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {
        //Task 1
        String s1 = "5";
        String s2 = "10";
        int x1 = Integer.valueOf(s1);
        int x2 = Integer.valueOf(s2);
        System.out.println("Sum of 5 and 10 is = " + (x1 + x2));
        System.out.println("Product of 5 and 10 is = " + (x1 * x2));
        System.out.println("Division of 5 and 10 is = " + (x1 / x2));
        System.out.println("Subtraction of 5 and 10 is = " + (x1 - x2));
        System.out.println("Remainder of 5 and 10 is = " + (x1 % x2));
        System.out.println("\n");
        //Task 2
        String ss1 = "200";
        String ss2 = "-50";
        int xx1 = Integer.valueOf(ss1);
        int xx2 = Integer.valueOf(ss2);
        int avg = (xx1 + xx2) / 2;
        System.out.println("The greatest value is = " + Math.max(xx1, xx2));
        System.out.println("The smallest value is = " + Math.min(xx1, xx2));
        System.out.println("The average is = " + avg);
        System.out.println("The absolute difference is = " + Math.abs(xx1 - xx2));
        System.out.println("\n");
        //Task 3
        double total = (.25 * 3) + (.10) + (.05 * 2) + (.01);
        System.out.println(Math.round(24/total) + " days");
        System.out.println(Math.round(168/total) +" days");
        System.out.println("$" + (150 * total));
        System.out.println("\n");
        //Task 4
        System.out.println((int) (1250/62.5));
        //Task 5
        int carTotal = 14265;
        double option1 = carTotal / 475.50;
        double option2 = carTotal / 951;

        System.out.println("Option 1 will take " + (int) option1 + " months");
        System.out.println("\n");
        System.out.println("Option 2 will take " + (int) option2 + " months");
        System.out.println("\n");
        //Task 6


        System.out.println("Please enter 2 numbers");
        int number1 = 15;
        int number2 = 2;
        double result = ((double) number1/number2);
        System.out.println(result);




    }
}

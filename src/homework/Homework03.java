package homework;
//Scanner imported
import java.util.Scanner;


public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Task 1
        System.out.println("Enter 2 numbers.");
        //Ask for the numbers and store them in these variables
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        //get the sum of the numbers
        int sum = firstNumber + secondNumber;
        System.out.println("The number 1 entered by user is = " + firstNumber);
        System.out.println("The number 2 entered by user is = " + secondNumber);
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum);

        //Task 2
        //Obtain numbers from user
        System.out.println("Enter 2 numbers.");
        //Store the user input
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        //Print
        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The division of number 1 and 2 by user is = " + (number1 / number2));

        //Task 3
        //just do the math lol
        System.out.println(-10 + 7 * 5);
        System.out.println((72+24)% 24);
        System.out.println(10 + -3*9/9);
        System.out.println(5+18/3*3-(6%3));
        System.out.println("\n");
        //Task 4
        //Obtain numbers from user
        System.out.println("Enter 2 numbers.");
        //Store the user input
        float numberOne = input.nextFloat();
        float numberTwo = input.nextFloat();
        //Print
        System.out.println("The sum of the given numbers is = " + numberOne + numberTwo);
        System.out.println("The product of the given numbers is = " + numberOne * numberTwo);
        System.out.println("The subtraction of the given numbers is = " + (numberOne - numberTwo));
        System.out.println("The division of the given numbers is = " + numberOne / numberTwo);
        System.out.println("The remainder of the given numbers is = " + numberOne % numberTwo);
        System.out.println("\n");
        //Task 5
        //Basically just math again
        double width = 7.5;
        double height = 10.5;
        System.out.println("The area of the rectangle = " + (width*height));
        System.out.println("The perimeter of the rectangle is = " + 2*(width+height));
        System.out.println("\n");
        //Task 6
        double salary = 90000;
        System.out.println("A software Engineer in Test can earn "+ (salary * 3) + " in 3 years");


    }
}

package homework;

import java.util.Arrays;
import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner scanner = new Scanner (System.in);

        //Task 1
        System.out.println("Input 2 numbers please");
        int firstNum = input.nextInt();
        int secNum = input.nextInt();
        int avg = (firstNum + secNum)/2;
        System.out.println("The average of the given 2 numbers is: " + avg);
        //Task 2
        System.out.println("Please enter 2 numbers");
        int fNum = input.nextInt();
        int sNum = input.nextInt();
        int prod = fNum * sNum;
        System.out.println("The product of the given 2 numbers is: " + prod);
        //Task 3
        System.out.println("Please enter 3 numbers");
        int inputOne = input.nextInt();
        int inputTwo = input.nextInt();
        int inputThree = input.nextInt();
        System.out.println("The "+inputOne+" multiplied with "+inputOne+" is:" + (inputOne*inputOne));
        System.out.println("The "+inputTwo+" multiplied with "+inputTwo+" is:" + (inputTwo * inputTwo));
        System.out.println("The "+inputThree+" multiplied with "+inputThree+" is:" + (inputThree*inputThree));
        //Task 4
        System.out.println("Please input 2 numbers");
        int rInputOne = input.nextInt();
        int rInputTwo = input.nextInt();
        int remainder = rInputOne % rInputTwo;
        System.out.println("The remainder of "+ rInputOne + " % " + rInputTwo +" = " + remainder);
        //Task 5
        System.out.println("Please enter 5 numbers");
        int bigFirst = input.nextInt();
        int bigSecond = input.nextInt();
        int bigThird = input.nextInt();
        int bigFourth = input.nextInt();
        int bigFifth = input.nextInt();
        int average = (bigFirst + bigSecond + bigThird + bigFourth + bigFifth) / 5;
        System.out.println("The average of the given 5 numbers is: " + average);
        //Task 6
        System.out.println("Please enter a number");
        int theOne = input.nextInt();
        System.out.println(
            theOne + " * 1 = " + (theOne * 1) +     "\n" +
            theOne + " * 2 = " + (theOne * 2) +     "\n" +
            theOne + " * 3 = " + (theOne * 3) +     "\n" +
            theOne + " * 4 = " + (theOne * 4) +     "\n" +
            theOne + " * 5 = " + (theOne * 5) +     "\n" +
            theOne + " * 6 = " + (theOne * 6) +     "\n" +
            theOne + " * 7 = " + (theOne * 7) +     "\n" +
            theOne + " * 8 = " + (theOne * 8) +     "\n" +
            theOne + " * 9 = " + (theOne * 9) +     "\n" +
            theOne + " * 10 = " + (theOne * 10)
        );
        //Task 7
        System.out.println("Please enter the length of the side of a square");
        int sqrSide = input.nextInt();
        int areaOfSqr = (sqrSide * sqrSide);
        int perOfSq = (sqrSide * 4);
        System.out.println("Perimeter of the square = " + perOfSq + "\n" +
                "Area of the square = " + areaOfSqr);

    }
}

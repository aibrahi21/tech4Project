package homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Task 1
        double n1 = (Math.random() * 11);
        double n2 = (Math.random() * 11);
        double n3 = (Math.random() * 11);
        double n4 = (Math.random() * 11);

        System.out.println
                ("Number 1 = " + ((int) n1) + "\n" +
                ("Number 2 = " + ((int) n2))+ "\n" +
                ("Number 3 = " + ((int) n3))+ "\n" +
                ("Number 4 = " + ((int) n4)));
        System.out.println(
                "Absolute difference of "+((int) n1)+" and 5 is = "+ Math.abs((int) n1 - 5) +
                "\n"+"Absolute difference of "+((int) n2)+" and 5 is = "+ Math.abs((int) n2 - 5) +
                "\n"+"Absolute difference of "+((int) n3)+" and 5 is = "+ Math.abs((int) n3 - 5) +
                "\n"+"Absolute difference of "+((int) n4)+" and 5 is = "+ Math.abs((int) n4 - 5));
        System.out.println("Greatest number is = " + (int) Math.max(n1, Math.max(n2, Math.max(n3, n4))));
        System.out.println("Smallest number is = " + (int) Math.min(n1, Math.min(n2, Math.min(n3, n4))) + "\n");
        //Task 2
        double n1$ = (Math.random() * (51 -(-51)) + (-51));
        double n2$ = (Math.random() * (51 -(-51)) + (-51));
        double n3$ = (Math.random() * (51 -(-51)) + (-51));
        double n4$ = (Math.random() * (51 -(-51)) + (-51));
        double n5$ = (Math.random() * (51 -(-51)) + (-51));
        double n6$ = (Math.random() * (51 -(-51)) + (-51));
        double n7$ = (Math.random() * (51 -(-51)) + (-51));
        double n8$ = (Math.random() * (51 -(-51)) + (-51));
        double theGreatest = (int) Math.max(n1$, Math.max(n2$, Math.max(n3$, Math.max(n4$,
                Math.max(n5$, Math.max(n6$, Math.max(n7$, n8$)))))));
        double theSmallest = (int) Math.min(n1$, Math.min(n2$, Math.min(n3$, Math.min(n4$,
                Math.min(n5$, Math.min(n6$, Math.min(n7$, n8$)))))));
        System.out.println(
                         "Number 1 = " + ((int) n1$) + "\n" +
                        ("Number 2 = " + ((int) n2$))+ "\n" +
                        ("Number 3 = " + ((int) n3$))+ "\n" +
                        ("Number 4 = " + ((int) n4$))+ "\n" +
                        ("Number 5 = " + ((int) n5$) + "\n" +
                        ("Number 6 = " + ((int) n6$))+ "\n" +
                        ("Number 7 = " + ((int) n7$))+ "\n" +
                        ("Number 8 = " + ((int) n8$))));
        System.out.println("Greatest number is = " + (int) theGreatest);
        System.out.println("Smallest number is = " + (int) theSmallest);
        System.out.println("Average of the 8 numbers is = " + (int) (n1$ + n2$ + n3$ + n4$ + n5$ + n6$ + n7$ + n8$)/8);
        System.out.println("The absolute difference between the smallest and the greatest is = " + (int) Math.abs( theGreatest - theSmallest));

        if (n3$ > 0)
            System.out.println("Third number is positive = True");
        else
            System.out.println("Third number is positive = False");

        if (n5$ < 0)
            System.out.println("Fifth number is negative = True");
        else
            System.out.println("Fifth number is negative = False");

        boolean atLeastOneZero = (n1$ == 0 || n2$ == 0 || n3$ == 0 || n4$ == 0 || n5$ == 0 || n6$ == 0 || n7$ == 0 || n8$ == 0);

        System.out.println("There is at least one zero among those numbers = " + atLeastOneZero);
        System.out.println("\n");
        //Task 3
        System.out.println("Please input 7 numbers between 0 and 50");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);
        System.out.println("Greatest number is = " + Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, Math.max(num5, Math.max(num6, num7)))))));
        System.out.println("Smallest number is = " + Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, Math.min(num5, Math.min(num6, num7)))))));
        System.out.println("The average of the 7 numbers is = " + ((num1 + num2 + num3 + num4 + num5 + num6 + num7)/7));
        if (num1 >= 10)
            System.out.println("First number is greater or equal to 10 = True");
        else
            System.out.println("First number is greater or equal to 10 = False");
        if (num7 <= 40)
            System.out.println("Last number is less than or equal to 40 = True");
        else
            System.out.println("Last number is less than or equal to 40 = False");
        boolean firstAndLast = (num1 > 25 && num7 > 25);
        System.out.println("Both first and last numbers are greater than 25 = " + firstAndLast);
        boolean zeroOrFifty = (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 ||
                num1 == 50 || num2 == 50 || num3 == 50 || num4 == 50 || num5 == 50 || num6 == 50 || num7 == 50);
        System.out.println("At least one of those numbers is 0 or 50 = " + zeroOrFifty);
        boolean fortyOrFifty = (num1 >= 40 && num1 <= 50 || num2 >= 40 && num2<= 50 || num3 >= 40 && num3 <=50 || num4 >= 40 &&
                num4 <= 50 || num5 >= 40 && num5 <= 50 || num6 >= 40 && num6 <= 50 || num7 >= 40 && num7 <= 50);
        System.out.println("There is no number between 40 and 50 = " + fortyOrFifty);
        System.out.println("\n");

        //Task 4
        double r1 = (Math.random() * 100);
        double r2 = (Math.random() * 100);
        double r3 = (Math.random() * 100);
        boolean outPut = (r1 > 25 && r2 > 25 && r3 > 25);
        System.out.println(outPut);
        System.out.println("\n");

        //Task 5
        System.out.println("Please input a number between 1 and 7");
        int userInput = input.nextInt();
        if (userInput == 1)
            System.out.println("The number entered returns MONDAY");
        else if (userInput == 2)
            System.out.println("The number entered returns TUESDAY");
        else if (userInput == 3)
            System.out.println("The number entered returns WEDNESDAY");
        else if (userInput == 4)
            System.out.println("The number entered returns THURSDAY");
        else if (userInput ==5)
            System.out.println("The number entered returns FRIDAY");
        else if (userInput == 6)
            System.out.println("The number entered returns SATURDAY");
        else if (userInput == 7)
            System.out.println("The number entered returns SUNDAY");
        System.out.println("\n");

        //Task 6
        System.out.println("Please enter a number between -10 and 10");
        int userInput2 = input.nextInt();
        if (userInput2 > 0)
            System.out.println("Number entered is POSITIVE");
        else if (userInput2 < 0)
            System.out.println("Number entered is NEGATIVE ");
        else
            System.out.println("Number entered is ZERO");
        if(userInput2%2 == 0)
            System.out.println("Number entered is EVEN");
        else
            System.out.println("Number entered is ODD");
        System.out.println("\n");

        //Task 7
        System.out.println("Tell me your exam results?");
        int fScore = input.nextInt();
        int sScore = input.nextInt();
        int tScore = input.nextInt();
        int aVg = ((fScore + sScore + tScore)/3);
        if (aVg >= 70)
            System.out.println("YOU PASSED!");
        else
            System.out.println("YOU FAILED!");
        System.out.println("\n");

        //Task 8
        System.out.println("Please input 3 numbers");
        int theFirst = input.nextInt();
        int theSecond = input.nextInt();
        int theThird =  input.nextInt();
        if (theFirst == theSecond && theSecond == theThird)
            System.out.println("TRIPLE MATCH");
        if (theFirst == theSecond || theSecond == theThird || theFirst == theThird)
            System.out.println("DOUBLE MATCH");
        else
            System.out.println("NO MATCH");

    }
}
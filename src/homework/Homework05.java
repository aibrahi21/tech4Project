package homework;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner scanner = new Scanner (System.in);


        //Task 1
        System.out.println("Please input 3 values");
        int firstVal = input.nextInt();
        int secondVal = input.nextInt();
        int thirdVal = input.nextInt();
        System.out.println("Max value = " + Math.max (firstVal, Math.max(secondVal, thirdVal)));
        System.out.println("Min value = " + Math.min (firstVal, Math.min(secondVal, thirdVal)));
        //Task 2
        System.out.println("Please input 5 values");
        int valFirst = input.nextInt();
        int valSecond = input.nextInt();
        int valThird = input.nextInt();
        int valFourth = input.nextInt();
        int valFifth = input.nextInt();
        int maxValFirst = Math.max(valFirst, valSecond);
        int maxValSecond = Math.max(valThird, valFourth);
        int almostDone = Math.max(maxValFirst, maxValSecond);
        int finallyDone = Math.max(almostDone, valFifth);

        int minValFirst = Math.min(valFirst, valSecond);
        int minValSecond = Math.min(valThird, valFourth);
        int almostDone2 = Math.min(minValFirst, minValSecond);
        int finallyDone2 = Math.min(almostDone2, valFifth);

        System.out.println("Max value = " + finallyDone);
        System.out.println("Min value = " + finallyDone2);

        //Task 3
        System.out.println("Please enter 2 numbers");
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(val1 - val2));


        System.out.println("\n");
        //Task 4
        System.out.println("Number 1 = " + ((int) (Math.random() * 50) + 50));
        System.out.println("Number 2 = " + ((int) (Math.random() * 50) + 50));
        System.out.println("Number 3 = " + ((int) (Math.random() * 50) + 50));




        //Task 5
        double alexMon = 125;
        double mikeMon = 220;
        double alexMonR = alexMon - 25.5;
        double mikeMonR = mikeMon + 25.5;

        System.out.println("Alex's money: $" + alexMonR );
        System.out.println("Mike's money: $" + mikeMonR );

        System.out.println("\n");
        //Task 6
        double bikeC = 390;
        double davidMon = 15.60;

        System.out.println("How many days it would take for Dave to get his beloved bike: " + bikeC / davidMon);





    }
}

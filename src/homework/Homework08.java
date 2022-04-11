package homework;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        //Task 1
        int random1 = (int) (Math.random() * 50);

        System.out.println("Random number = " + random1);
        boolean isItTrue = random1 >= 10 && random1 <= 25;
        System.out.println(isItTrue + "\n");

        //Task 2
        int random2 = (int) (Math.random() * 100);
        System.out.println("Random number = " + random2);
        if (random2 >= 1 && random2 <= 50) {
            System.out.println(random2 + " is in the 1st half.");
            if (random2 <= 25)
                System.out.println(random2 + " is in the first quarter.");
            else if (random2 > 25 && random2 <= 50)
                System.out.println(random2 + " is in the second quarter.");
        else
                System.out.println(random2 + " is in the 2nd half.");
            if (random2 > 50 && random2 <= 75)
                System.out.println(random2 + " is in the third quarter.");
            else if (random2 > 75 && random2 <= 100)
                System.out.println(random2 + " is in the fourth quarter.");
            System.out.println();

/*
            //Task 3
            Scanner input = new Scanner(System.in);
            System.out.println("Please input 5 numbers between 1 and 10.");
            int in1 = input.nextInt();
            int in2 = input.nextInt();
            int in3 = input.nextInt();
            int in4 = input.nextInt();
            int in5 = input.nextInt();
            boolean withinRange1 = in1 >= 1 && in1 <= 10;
            boolean withinRange2 = in2 >= 1 && in2 <= 10;
            boolean withinRange3 = in3 >= 1 && in3 <= 10;
            boolean withinRange4 = in4 >= 1 && in4 <= 10;
            boolean withinRange5 = in5 >= 1 && in5 <= 10;
            int in12;
            int in22;
            int in32;
            int in42;
            int in52;
            if (withinRange1)
                in12 = in1 * 5;
            else
                in12 = 0;
            if (withinRange2)
                in22 = in2 * 4;
            else
                in22 = 0;
            if (withinRange3)
                in32 = in3 * 3;
            else
                in32 = 0;
            if (withinRange4)
                in42 = in4 * 2;
            else
                in42 = 0;
            if (withinRange5)
                in52 = in5;
            else
                in52 = 0;
            System.out.println(in12 + in22 + in32 + in42 + in52);

 */
        }
    }
}
package projects;
import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {

        //Task 1
        Scanner input = new Scanner (System.in);
        String s1 = "24";
        String s2 = "5";
        int s1Int = Integer.parseInt(s1);// String --> int
        int s2Int = Integer.parseInt(s2);// String --> int
        double resultD = s1Int / s2Int;
        System.out.println(s1Int + s2Int);
        System.out.println(s1Int - s2Int);
        System.out.println(resultD);
        System.out.println(s1Int * s2Int);
        System.out.println(s1Int % s2Int);
        System.out.println();



        //Task 2
        double r1 = (int) (Math.random() * 35);
        System.out.println((int) r1);

        boolean theTruth = (r1 == 2 || r1 == 3 || r1 == 5 || r1 == 7 || r1 == 11 || r1 == 13 || r1 == 17 || r1 == 19 || r1 == 23 || r1 == 29 || r1 == 31);
        if (theTruth)
            System.out.println("THE NUMBER IS A PRIME NUMBER");

        else
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        System.out.println();
        //Task 3
        int rand1 = (int) (Math.random() * 50);
        int rand2 = (int) (Math.random() * 50);
        int rand3 = (int) (Math.random() * 50);

        if (rand1 > rand2 && rand2 > rand3) // a > b > c
            System.out.println("Greatest number is: " + rand1 + "\n" + "Middle number is: " + rand2 + "\n"
                    + "Smallest number: " + rand3);
        else if (rand1 > rand3 && rand3 > rand2) // a > c > b
            System.out.println("Greatest number is: " + rand1 + "\n" + "Middle number is: " + rand3 + "\n"
                    + "Smallest number: " + rand2);
        else if (rand2 > rand1 && rand1 > rand3) // b > a > c
            System.out.println("Greatest number is: " + rand2 + "\n" + "Middle number is: " + rand1 + "\n"
                    + "Smallest number: " + rand3);
        else if (rand2 > rand3 && rand3 > rand1) // b > c > a
            System.out.println("Greatest number is: " + rand2 + "\n" + "Middle number is: " + rand3 + "\n"
                    + "Smallest number: " + rand1);
        else if (rand3 > rand1 && rand1 > rand2) // c > a > b
            System.out.println("Greatest number is: " + rand3 + "\n" + "Middle number is: " + rand1 + "\n"
                    + "Smallest number: " + rand2);
        else // c > b > a
            System.out.println("Greatest number is: " + rand3 + "\n" + "Middle number is: " + rand2 + "\n"
                    + "Smallest number: " + rand1);
        System.out.println();

        //Task 4
        char c = '5'; //To test, put whatever variable desired in ''
        int t1 = (int) c;

        if (65 <= t1 && t1 <= 90)
            System.out.println("The letter is uppercase");
        else if (97 <= t1 && t1 <= 122)
            System.out.println("The letter is lowercase");
        else
            System.out.println("Invalid character detected!");
        System.out.println();


        //Task 5
        char d = '@'; //To test, put whatever variable desired in ''
        int t2 = (int) d;

        if (65 <= t2 && t2 <= 90 || 97 <= t2 && t2 <= 122)
            if (t2 == 65 || t2 == 69 || t2 == 73 || t2 == 79 || t2 == 85 || t2 == 97|| t2 == 101 || t2 == 105 || t2 == 111 || t2 == 117)
                System.out.println("The letter is a vowel");
            else
                System.out.println("The letter is a consonant");
        else
            System.out.println("Invalid character detected!!");
        System.out.println();

        //Task 6
        char e = ' ';
        int t3 = (int) e;
        if (t3 >= 0 && t3 <= 32 || t3 >= 48 && t3 <= 57 || 65 <= t3 && t3 <= 90 || 97 <= t3 && t3 <= 122)
            System.out.println("Invalid character detected!!!");
        else
            System.out.println("Special character is " + e);
        System.out.println();
        //Task 7
        char f = 'g';
        int t4 = (int) f;
        if (65 <= t4 && t4 <= 90 || 97 <= t4 && t4 <= 122)
            System.out.println("Character is a letter");
        else if (t4 >= 48 && t4 <= 57)
            System.out.println("Character is a digit");
        else
            System.out.println("Character is a special character");

        /*
        If you would like me to specify only the special characters that can be typed rather than generalizing, please let me know. I can do the same thing i did earlier, just reverse engineer it to apply to special characters.
         */

        }

}

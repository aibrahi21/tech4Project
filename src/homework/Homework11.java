package homework;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        //Task 1
        for (int i = 1; i <= 100; i++)
            if(i%7 == 0)
                System.out.print(i + " - ");
        System.out.println("\b\b\b");
        System.out.println();

        //Task 2
        for (int i = 1; i <= 50; i++)
            if(i%2 == 0 && i%3 ==0)
                System.out.print(i + " - ");
        System.out.println("\b\b\b");
        System.out.println();

        //Task 3
        for (int i = 100; i >= 50; i--)
            if(i%5 == 0)
                System.out.print(i + " - ");
        System.out.println("\b\b\b");
        System.out.println();

        //Task 4
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i*i));
        }
        System.out.println();

        //Task 5
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
        System.out.println();

        //Task 6
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int n1 = scan.nextInt();
        int total = 1;
        for(int i = 1; i <= n1; i++)
            total *= i;
        System.out.println(total);
        System.out.println();

        //Task 7
        System.out.println("Please enter your first and last name");
        String firstAndLast = scan.next();
        firstAndLast += " " + scan.next();
        int num_vowels = 0;
        for (int i = 0; i < firstAndLast.length(); i++)
            if (firstAndLast.substring(i,i+1).equalsIgnoreCase("a") ||
                firstAndLast.substring(i,i+1).equalsIgnoreCase("e") ||
                firstAndLast.substring(i,i+1).equalsIgnoreCase("i") ||
                firstAndLast.substring(i,i+1).equalsIgnoreCase("o") ||
                firstAndLast.substring(i,i+1).equalsIgnoreCase("u"))
                num_vowels++;
        System.out.println("There are " +num_vowels+ " vowel letters in this full name");
        System.out.println();

        //Task 8
        System.out.println("Please enter a number");
        int sum = scan.nextInt();
        if (sum < 100) {
            while (sum < 100) {
                System.out.println("Please enter a number");
                sum += scan.nextInt();
            }
            System.out.println("Sum of the entered numbers is at least 100");
        }
        else
            System.out.println("This number is already more than 100");
        System.out.println();

        //Task 9
        int t9 = 20;
        int[] fib = new int[t9];
        fib[0] = 0;
        System.out.print(fib[0] + " - ");
        fib[1] = 1;
        System.out.print(fib[1] + " - ");
        for(int i = 2; i < t9; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " - ");
        }
        System.out.println("\b\b\b");
        System.out.println();

        //Task 10
        System.out.println("Please enter a name");
        String t10 = scan.next().toLowerCase();
        while(!t10.startsWith("j")) {
            System.out.println("Please enter a name");
            t10 = scan.next().toLowerCase();
        }
        System.out.println("End of Program");
    }
}

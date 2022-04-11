package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Task 1
        System.out.println("Enter 3 numbers.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println("The product of the numbers entered is = " + (number1)*(number2)*number3);

        //Task 2
        System.out.println("What is your first name?");
        String firstName = input.next();

        System.out.println("What is your last name?");
        String lastName = input.next();

        System.out.println("What is your birth year?");
        int birthYear = input.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - birthYear));

        //Task 3
        System.out.println("What is your full name?");
        input.nextLine();
        String fullNameTask3 = input.nextLine();

        System.out.println("What is your weight?");
        int weight = input.nextInt();

        System.out.println(fullNameTask3 + "'s weight is = " + (weight * 2.205)+" lbs.");

        //Task 4
        System.out.println("What is your full name?");
        input.nextLine();
        String fullName41 = input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("What is your full name?");
        input.nextLine();
        String fullName42 = input.nextLine();

        System.out.println("What is your age?");
        int age2 = input.nextInt();

        System.out.println("What is your full name?");
        input.nextLine();
        String fullName43 = input.nextLine();

        System.out.println("What is your age?");
        int age3 = input.nextInt();

        double average = ((age + age2 + age3) /3);


        System.out.println(fullName41 + "'s age is " + age);

        System.out.println(fullName42 + "'s age is " + age2);

        System.out.println(fullName43 + "'s age is " + age3);

        System.out.println("The average age is " + average);

        System.out.println("The eldest age is " + Math.max(age, Math.max(age2, age3)));

        System.out.println("The youngest age is " + Math.min(age, Math.min(age2, age3)));


    }
}

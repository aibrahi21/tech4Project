package homework;
//scanner imported
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        ///Task 1
        //Code
        //Scanner input
        Scanner input = new Scanner (System.in);
        //Ask user for input & recieve it
        System.out.println("My first name is = ");
        String firstName = input.nextLine();
        System.out.println("My last name is = ");
        String lastName = input.nextLine();
        System.out.println("My age is = ");
        int age = input.nextInt();
        System.out.println("My email is = ");
        String email = input.nextLine();
        email = input.nextLine();
        System.out.println("My phone # is = ");
        String phoneNumber = input.nextLine();
        System.out.println("My address is = ");
        String address = input.nextLine();
        // This is useless: it doesn't intake data unless it is labeled/assigned.
        // input.nextLine();
        //Print
        System.out.print("User who joined this program is " + firstName + ". ");
        System.out.print(firstName + "'s age is " + age + ". ");
        System.out.print(firstName + "'s email address is " + email + ", phone number "  + phoneNumber + ", and address is " + address + ".");
        //Task 2
        //Code
        System.out.println("\n");
        System.out.println("Your favorite book is?" );
        String favoriteBook = input.nextLine();
        System.out.println("Your favorite color is?");
        String favoriteColor = input.nextLine();
        System.out.println("Your favorite number is?");
        int favoriteNumber = input.nextInt();
        //Display
        System.out.println(firstName + "'s favorite book is: "+ favoriteBook + "\n" + firstName + "'s favorite color is: " + favoriteColor + "\n" + firstName + "'s favorite number is: " + favoriteNumber);
    }
}

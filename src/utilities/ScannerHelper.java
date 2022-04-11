package utilities;
import java.util.Scanner;
public class ScannerHelper {
    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

        public static String getANameFromUser(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a name: ");
            String name = scan.nextLine();
            return name;
        }
    public static String getASentenceFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sen = scanner.nextLine();
        return sen;
    }
        public static String getACountryFromUser() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input a country: ");
            String country = scanner.nextLine();
            return country;
        }
        public static String getAnAddressFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an address: ");
        String addy = scanner.nextLine();
        return addy;
    }

        public static String getAStringFromUser(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a string: ");
            String string = scanner.nextLine();
            return string;
    }
        public static String getAddressFromUser(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your address: ");
            String address = scanner.nextLine();
            return address;
    }
        public static String getColorFromUser(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a color(or colors): ");
            String color = scanner.nextLine();
            return color;
    }
}
package methods;
import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumberIsPOsNegOrZero {
    public static void main(String[] args) {
     /*
    ask user to enter any number
    - Print "the number is positive" if the user enters a positive number
    - Print "the number is negative" if the user enters a negative number
    - Print "the number is zero" if the user enters a zero number
     */
      int num = ScannerHelper.getNumberFromUser();//returns an int
      if (MathHelper.isPositive(num))
            System.out.println("The number is positive");
      else if (MathHelper.isNegative(num))
          System.out.println("The number is negative");
      else
          System.out.println("The number is zero");

    }



}

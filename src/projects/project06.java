package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import utilities.StringHelper;
import java.util.Scanner;

public class project06 {
    public static void main(String[] args) {
        //Task 1
        String s1 = ScannerHelper.getASentenceFromUser();
        String s1Trim = s1.trim();
        int count = 0, curSpaceIdx = 0;

        for (int i = 0; i < s1Trim.length(); i++) {
            char sp = s1Trim.charAt(i);
            if (sp == ' ')
                count++;
        }
        if (s1Trim.length() == 0)
            System.out.println("This sentence does not have multiple words.");
        else
            System.out.println("This sentence has " + (count + 1) + " words.");

        System.out.println();
        //Task 2
        String s2 = ScannerHelper.getAStringFromUser();
        boolean isPalindrome=false;
        if (s2.length() == 1)
            System.out.println("This is a palindrome");
        else {
            int d = 0, iCount = 0;
            if (s2.length() % 2 == 0) {
                for (int i = s2.length()-1; i >= 0; i--) {
                    if (s2.charAt(d) == s2.charAt(i)) {
                        d++;
                    }
                    else{
                        iCount = i;
                        break;
                    }

                }
                if(iCount==0)
                    isPalindrome =true;
            }

            d = 0;
            if (s2.length() % 2 != 0) {
                for (int i = s2.length()-1; i >= 0; i--) {
                    if (s2.charAt(d) == s2.charAt(i)) {
                        d++;

                        if(iCount == (s2.length()/2 +1))
                        break;
                    }
                    iCount = i;

                }
                if(iCount == (s2.length()/2 +1))
                    isPalindrome=true;
            }
            if(isPalindrome)
                System.out.println("This is a palindrome");
            else
                System.out.println("not");
        }


            //Task 3
            String s3 = ScannerHelper.getASentenceFromUser();
            String s3Trim = s3.trim();
            int count2 = 0;
            for (int i = 0; i < s3Trim.length(); i++) {
                char s3l = s3Trim.charAt(i);
                if (s3l == 'a' || s3l == 'A')
                    count2++;
            }
            if (s3Trim.length() == 0)
                System.out.println("This sentence does not have any characters");
            else
                System.out.println("This sentence has " + (count2) + " a or A letters.");
            System.out.println();
            //Task 4
            int num1 = ScannerHelper.getNumberFromUser();
            for (int i = 1; i <= num1; i++)
                if (i % 2 == 0 && i % 3 == 0)
                    System.out.println("FooBar");
                else if (i % 3 == 0)
                    System.out.println("Bar");
                else if (i % 2 == 0)
                    System.out.println("Foo");
                else
                    System.out.println(i);

        }
    }


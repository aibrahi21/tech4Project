package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Project05 {
    public static void main(String[] args) {
        //Task 1
        String str = ScannerHelper.getAStringFromUser();
        String s1 = str.substring(0, 4);
        String s2 = str.substring(str.length() - 4);
        if (str.length() >= 8)
            System.out.println(((s2.concat(str.substring(4, str.length() - 4)).concat(s1))));
        else
            System.out.println("This String does not have 8 characters");
        System.out.println();

        //Task 2
        String sen = ScannerHelper.getASentenceFromUser();
        if (sen.trim().contains(" ")) {
            String sen1 = sen.substring(0, sen.indexOf(32));
            String sen2 = sen.substring(sen.indexOf(32), sen.lastIndexOf(32) + 1);
            String sen3 = sen.substring(sen.lastIndexOf(32) + 1);
            System.out.println(sen3 + sen2 + sen1);
        } else System.out.println("This sentence does not have 2 or more words to swap");
        System.out.println();

        //Task 3
        String ins1 = "I like idiot behaviors";
        String ins2 = "I like idiot behaviors";
        String ins3 = "I had some stupid t-shirts in the past and also some idiot looking shoes";

        if (ins1.contains("stupid") || ins1.contains(("idiot"))) {
            System.out.println(ins1.replace("stupid", "nice").replace("idiot", "nice"));
        } else System.out.println(ins1);

        //Task 4
        String name = ScannerHelper.getANameFromUser();
        int nameLen = name.length();
        if (nameLen < 2) System.out.println("Invalid Input!!!");
        else
            System.out.println(StringHelper.getMiddle(name));
        System.out.println();

        //Task 5
        String country = ScannerHelper.getACountryFromUser();
        if (country.length() < 5) System.out.println("Invalid Input!!!");
        else System.out.println(country.substring(2, country.length() - 2));
        System.out.println();

        //Task 6
        String address = ScannerHelper.getAnAddressFromUser();

        System.out.println(address.replace("a", "*").replace("A", "*").replace("e", "#")
                .replace("E", "#").replace("i", "+").replace("I", "+").replace("u", "$")
                .replace("U", "$").replace("o", "@").replace("O", "@"));
        System.out.println();

        //Task 7

        int r1 = RandomNumberGenerator.getRandomNumber(0, 25);
        int r2 = RandomNumberGenerator.getRandomNumber(0, 25);

        for (int numb = r1; numb <= r2; numb++) {
            if (numb % 5 != 0) {
                System.out.println(numb);
            }
        }

        for (int numb = r2; numb <= r1; numb++) {
            if (numb % 5 != 0) {
                System.out.println(numb);
            }
        }
    }
}
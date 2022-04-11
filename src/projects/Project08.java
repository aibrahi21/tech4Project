package projects;

import java.util.*;

public class Project08 {
    //Task 1
    public static int multiWord(String[] s) {
        String[] s1 = {"foo", "", " ", "foo bar", "Java is fun", "ruby"};
        int count = 0;
        for (String a : s1) {
            if (a.trim().contains(" ")) {
                count++;
            }
        }
        return (count);
    }

    //Task 2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (Integer b : numbers) {
            if (b >= 0) {
                numbers1.add(b);
            }
        }
        return (numbers1);
    }
    //Task 3
    public static boolean validatePassword(String test) {
        if (!test.contains(" ") && test.length() < 17 && test.length() > 7) {
            boolean hasLowerCase = false, hasUpperCase = false, hasDigit = false, hasSpecial = false;
            for (int i = 0; i < test.length(); i++) {
                char c = test.charAt(i);
                if (Character.isLetter(c)) {
                    if (Character.isLowerCase(c)) {
                        hasLowerCase = true;
                    } else if (Character.isUpperCase(c)) {
                        hasUpperCase = true;
                    }
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else hasSpecial = true;
            }
            return (hasDigit && hasLowerCase && hasUpperCase && hasSpecial);

        } else return false;
    }
    //Task 4
    public static boolean validateEmailAddress(String email){
            if (email.contains(" ")) return false;
            if (email.contains("@") && email.contains(".")) {
                String[] split1 = email.split("@");
                String[] split2 = split1[1].split("\\.");
                return split1[0].length() > 2 && split2[0].length() > 2 && split2[1].length() > 2;
            }
            return false;
        }

        public static void main (String[]args){
            String[] s1 = {"foo", "", " ", "foo bar", "Java is fun", "ruby"};
            System.out.println(multiWord(s1));
            System.out.println();
            ArrayList<Integer> numbers2 = new ArrayList<>();
            numbers2.add(2);
            numbers2.add(-5);
            numbers2.add(6);
            numbers2.add(7);
            numbers2.add(-10);
            numbers2.add(-78);
            numbers2.add(0);
            numbers2.add(15);
            System.out.println(removeNegatives(numbers2));

            System.out.println(validatePassword("Abcd123!"));

            System.out.println(validateEmailAddress("abcd@gmail.com"));

        }
    }

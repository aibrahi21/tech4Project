package homework;

import java.util.*;

public class Homework14 {
    public static void main(String[] args) {
        //Task 1
        boolean n1 = false;
        int n = 0;
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        //Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[j]);
                    n1 = true;
                    break;
                }
            }
            if(n1)
                break;
        }
        if (!n1)
            System.out.println("There is no duplicate");
        System.out.println();

        //Task 2

        String words[] = {"Z", "abc", "Z", "123", "#"};
        boolean n2 = false;
        for (int i = 0;i < words.length; i++){
            for(int j = i + 1; j< words.length; j++){
                if(words[i].equals(words[j])){
                    System.out.println(words[i]);
                    n2 = true;
                    break;
                }
            }
            if (n2)
                break;
        }
        if (!n2)
            System.out.println("There is no duplicates");
        System.out.println();

        //Task 3
        int[] numbers2 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        boolean n3 = false;
        for (int i = 0; i <= numbers2.length-1; i++) {
            for (int j = i + 1; j <= numbers2.length-2; j++) {
                if (numbers2[i]==numbers2[j]){
                    n3 = true;
                    System.out.println(numbers2[i]);
                    break;
                }
            }
        }
        if (!n3) System.out.println("There is no duplicates");
        System.out.println();

        //Task 4
        String[] words2 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        boolean n4 = false;
        for (int i = 0; i <= words2.length-1; i++) {
            for (int j = i + 1; j <= words2.length-2; j++) {
                if (words2[i].equalsIgnoreCase(words2[j])){
                    n4 = true;
                    System.out.println(words2[i]);
                    break;
                }
            }
        }
        if (!n4) System.out.println("There is no duplicates");
        System.out.println();
        //Couldn't figure out how to make it not print out an extra a

        //Task 5
        String[] str = {"abc", "foo", "bar"};
        ArrayList<String> reverse = new ArrayList<>();
        for (int i = str.length - 1; i >= 0; i--) {
            reverse.add(str[i]);
        }
        System.out.println(reverse);
        System.out.println();

        //Task 6
        String s = "Frank Ocean";
        String[] opposite = s.split(" ");
        Arrays.toString(opposite);
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }

        //I would like to mention that Kaly and Karam were a big help with this homework.
        //Campus is great
    }
}

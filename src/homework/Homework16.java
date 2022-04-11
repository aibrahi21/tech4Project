package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.*;

public class Homework16 {
    //Task 1
    public static int countWords(String s){
        s = s.trim();
        int countA = 1;
        for(int i = 0; i <= s.length()-1; i++){
            if( s.charAt(i) == ' ') countA++;
        }
        return countA;
    }
    //Task 2
    public static int countA(String a) {
        a = a.trim();
        int countB = 0;
        for(int i = 0; i <= a.length()-1; i++){
            if( a.charAt(i) == 'a' || a.charAt(i) == 'A')
                countB++;
        }
        return countB;
    }
    //Task 3
    public static int countPos(ArrayList<Integer> a){
        int countC = 0;
        for (int i = 0; i < a.size(); i++){
            if(a.get(i) > 0){
                countC++;
            }
        }
        return countC;
    }
    //Task 4
    public static ArrayList removeDuplicates(ArrayList<Integer> b){
        for (int i = 0; i < b.size()-1; i++){
            for (int j = i+1; j < b.size(); j++){
                if (b.get(i).equals(b.get(j))){
                    b.remove(j);
                    j--;
                }
            }
        }
        return b;
    }
    //Task 5
    public static ArrayList removeDuplicateElements(ArrayList<String> b){
        for (int i = 0; i < b.size()-1; i++){
            for (int j = i+1; j < b.size(); j++){
                if (b.get(i).equals(b.get(j))){
                    b.remove(j);
                    j--;
                }
            }
        }
        return b;
    }
    //Task 6
    public static String removeExtraSpaces(String b){
        StringBuilder sb = new StringBuilder(b.trim());
        for(int i = 0; i < sb.length()-1; i++){
            if (sb.charAt(i) == ' ' && sb.charAt(i+1) == ' '){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    //Task 7
    public static int[] add(int[] array1, int[] array2){
        int larger_size = Math.max(array1.length, array2.length);
        int[] array3 = new int[larger_size];
        int i = 0;
        while(i < array1.length && i < array2.length){
            array3[i] = array1[i] + array2[i];
            i++;
        }
        while(i < array1.length){
            array3[i] = array1[i];
            i++;
        }
        while(i < array2.length){
            array3[i] = array2[i];
            i++;
        }
        return array3;
    }

    //Task 8
    public static int findClosestTo10(int[] numbers){
        int p = Integer.MAX_VALUE;
        int lol = -1;
        Arrays.sort(numbers);
        for(int n : numbers){
            if(n == 10)
                continue;
            if(Math.abs(n-10) < p) {
                p = Math.abs(n - 10);
                lol = n;
            }
        }
        return lol;
    }



    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();
        list.add(-45);
        list.add(0);
        list.add(0);
        list.add(34);
        list.add(5);
        list.add(67);
        ArrayList list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(35);
        list2.add(20);
        list2.add(35);
        list2.add(60);
        list2.add(70);
        list2.add(60);
        ArrayList list3 = new ArrayList<String>(Arrays.asList("java","C#","ruby","JAVA","ruby","C#","C++"));
        int[] numbers = {10, -13, 5, 70, 15, 57};
        int[] numbers2 = {10, -13, 8, 12, 15, -20};
        String str = "   I    am     learning    Java      ";
        System.out.println(countWords("Hello World!")); // Display the string.
        System.out.println(countA("QA stands for Quality Assurance"));
        System.out.println(countPos(list));
        System.out.println(removeDuplicates(list2));
        System.out.println(removeDuplicateElements(list3));
        System.out.println(removeExtraSpaces(str));
        System.out.println(findClosestTo10(numbers2));
    }
}
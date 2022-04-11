package homework;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        //Task 1
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                if (i % 5 == 0)
                    System.out.println("FooBar");
                else
                    System.out.println("Foo");
            }
            else if (i % 5 == 0)
                System.out.println("Bar");
            else
                System.out.println(i);
        }
        System.out.println();

        //Task 2
        int n1=0;
        int n2=0;
        int[] numbers = {0,-4,-7,0,5,10,45};
        for(int i = numbers.length-1; i>=0; i--) {
            if (numbers[i] > 0 && numbers[i] != 0)
                n1 = numbers[i];
            else if (numbers[i] < 0)
                n2 = numbers[i];
        }
        System.out.println("First positive number is: " + n1);
        System.out.println("First negative number is: " + n2);
        System.out.println();

        //Task 3
        int r1 = 0;
        int[] ra1 = {0, 0, 0, 0, 0};
        for (int i = 0; i < ra1.length; i++){
            r1 = (int) (Math.random()*10 )+ 1;
            r1 = ra1[i];
        }
        for(int i = 0; i < ra1.length; i++){
            if (ra1[i] == 2 || ra1[i] == 3)
                System.out.println(false);
            else
                System.out.println(false);
        }

        System.out.println();
        //Task 4
        String[] list = {"banana", "orange", "Apple"};
        for (String s : list){
            if (s.equalsIgnoreCase("apple"))
            System.out.println("true");
            else
                System.out.println("false");
        }
        System.out.println();

        //Task 5
        int[] numbers1 = {10,20,30,50,70};
        int[] numbers2 = {20,50,70,100,300};
        for(int i = 0; i < numbers1.length; i++){
            for (int j = 0; j < numbers2.length; j++){
                if (numbers1[i] == numbers2[j])
                    System.out.println(numbers1[i]);
            }
        }
        System.out.println();

        //Task 6
        String str = "baNana";
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j))
                    System.out.println(str.charAt(i));
            }
        }




    }
}

package projects;

import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {
        //Task 1
        int[] i1 = {10, 7, 7, 10, -3, 10, -3};
        Arrays.sort(i1);
        System.out.println("Smallest = " + i1[1]);
        System.out.println("Greatest = " + i1[i1.length - 1]);
        System.out.println();

        //Task 2
        int[] i2 = {10, 7, 7, 10, -3, 10, -3};
        int number = i2.length;
        int curMin = Integer.MAX_VALUE;
        int curMax = Integer.MIN_VALUE;

        for (int i = 1; i < number; i++) {
            if (i2[i] > curMax)
                curMax = i2[i];
            if (i2[i] < curMin)
                curMin = i2[i];
        }


        System.out.println("Smallest = " + curMin);
        System.out.println("Greatest = " + curMax);
        System.out.println();

        //Task 3
        int[] i3 = {10, 5, 6, 7, 8, 5, 15, 15};
        Arrays.sort(i3);
        int storedMax = i3[i3.length - 1];
        int storedMin = i3[0];
        for (int i = 0; i < i3.length; i++) {
            if (i3[i] == storedMax)
                i3[i] = Integer.MIN_VALUE;
        }
        Arrays.sort(i3);
        System.out.println("Second Greatest = " + i3[i3.length - 1]);
        for (int i = 0; i < i3.length; i++) {
            if (i3[i] == storedMin)
                i3[i] = Integer.MAX_VALUE;
            if (i3[i] == Integer.MIN_VALUE)
                i3[i] = Integer.MAX_VALUE;
        }
        Arrays.sort(i3);
        System.out.println("Second Smallest = " + i3[0]);
        System.out.println();

        //Task 4
        int[] i4 = {10, 5, 6, 7, 8, 5, 15, 15};
        int sMax = Integer.MIN_VALUE;
        int sMin = Integer.MAX_VALUE;


        for (int i = 0; i < i4.length; i++) {
            if (i4[i] > sMax)
                sMax = i4[i];
            if (i4[i] < sMin)
                sMin = i4[i];
        }

        for (int i = 0; i < i4.length; i++) {
            if (i4[i] == sMax)
                i4[i] = Integer.MIN_VALUE;
        }

        sMax = Integer.MIN_VALUE;
        for (int i = 0; i < i4.length; i++) {
            if (i4[i] > sMax)
                sMax = i4[i];
        }

        for (int i = 0; i < i4.length; i++) {
            if (i4[i] == storedMin)
                i4[i] = Integer.MAX_VALUE;
            if (i4[i] == Integer.MIN_VALUE)
                i4[i] = Integer.MAX_VALUE;
        }
        sMin = Integer.MAX_VALUE;
        for (int i = 0; i < i4.length; i++) {
            if (i4[i] < sMin)
                sMin= i4[i];
        }

        System.out.println("Smallest = " + sMin);
        System.out.println("Greatest = " + sMax);
        System.out.println();

        //Task 5
        String[] str = {"foo","bar", "Foo","bar","6","abc","6","xyz"};
        for (int j = 0; j < str.length; j++){
            for(int i = j+1; i < str.length; i++)
                if (str[j].equals(str[i]))
                    System.out.println(str[j]);
        }
        System.out.println();

        //Task 6
        String[] strArry = {"pen","eraser","pencil","pen","123","abc","pen","eraser"};
        String maxDup="";
        int dupCount= 0;
        int curDupCount = 0;
        for(int i = 0; i < strArry.length-1; i++) {
            for (int j = i+1; j< strArry.length-1; j++) {
                if(strArry[i].equals(strArry[j]))
                    curDupCount+=1;
            }
            if(curDupCount > dupCount) {
                maxDup = strArry[i];
                dupCount = curDupCount;
            }
        }
        System.out.print(maxDup);
    }
}
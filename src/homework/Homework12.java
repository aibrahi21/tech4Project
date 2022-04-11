package homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework12 {
    public static void main(String[] args) {

        //Task 1
        int[] t1 = {89,0,23,0,12,0,15,34,0,7};
        System.out.println(t1[3]);
        System.out.println(t1[0]);
        System.out.println(t1[9]);
        System.out.println(Arrays.toString(t1));
        System.out.println();

        //Task 2
        String[] s1 = {"null","abc","null","null","xyz"};
        System.out.println(s1[3]);
        System.out.println(s1[0]);
        System.out.println(s1[4]);
        System.out.println(Arrays.toString(s1));
        System.out.println();

        //Task 3
        int[] a1 = {23,-34,-56,0,89,100};
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        //Task 4
        String[] cntry = {"Germany","Argentina","Ukraine","Romania"};
        System.out.println(Arrays.toString(cntry));
        Arrays.sort(cntry);
        System.out.println(Arrays.toString(cntry));
        System.out.println();

        //Task 5
        String[] cTn = {"Scooby Doo","Snoopy","Blue","Pluto","Dino","Sparky"};
        System.out.println(Arrays.toString(cTn));
        System.out.println(Arrays.toString(cTn).contains("Pluto"));
        System.out.println();

        //Task 6
        String[] cCat = {"Garfield", "Tom", "Sylvester","Azrael"};
        Arrays.sort(cCat);
        System.out.println(Arrays.toString(cCat));
        if (Arrays.toString(cCat).contains("Garfield") && Arrays.toString(cCat).contains("Felix"))
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println();


        //Task 7
        double[] d1 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(d1));
        for(int i = 0; i <= 4; i++)
            System.out.println(d1[i]);

        System.out.println();

        //Task 8
        char[] c1 = {'A','b','G','H','7','5','&','*','e','@','4'};
        System.out.println(Arrays.toString(c1));
        int numL = 0, numUL = 0, numLL = 0, numD = 0, numSC = 0;
        for (int i = 0; i <c1.length; i++){
            if ((int) c1[i] >= 65 && (int) c1[i] <= 90){
                numUL++;
                numL++;
            }
            else if ((int) c1[i] >= 97 && (int) c1[i] <= 122){
                numL++;
                numLL++;
            }
            else if ((int) c1[i] >= 48 && (int) c1[i] <= 57)
                numD++;
            else
                numSC++;
        }
        System.out.println("Letters = "+numL);
        System.out.println("Uppercase letters = "+numUL);
        System.out.println("Lowercase letters = "+numLL);
        System.out.println("Digits = "+numD);
        System.out.println("Special Characters = "+numSC);
        System.out.println();

        //Task 9
        String[] bag = {"Pen","notebook","Book","paper","bag","pencil","Ruler"};
        System.out.println(Arrays.toString(bag));
        int numUP = 0, numLO = 0, numBP = 0, numW = 0;
        for (String b: bag){
            if (b.toLowerCase().contains("book")||b.toLowerCase().contains("pen"))
                numW++;
            if (b.toLowerCase().startsWith("b")||b.toLowerCase().startsWith("p"))
                numBP++;
            if ((int) b.charAt(0) >=65 && (int) b.charAt(0) <= 90)
                numUP++;
            if ((int) b.charAt(0) >=97 && (int) b.charAt(0) <=122)
                numLO++;
        }

        System.out.println("Elements starts with uppercase = "+ numUP);
        System.out.println("Elements starts with lowercase = "+ numLO);
        System.out.println("Elements starts with B or P = "+ numBP);
        System.out.println("Elements having \"book\" or \"pen\" = " + numW);
        System.out.println();

        //Task 10
        int[] nLol = {3,5,7,10,0,20,17,10,23,56,78};
        System.out.println(Arrays.toString(nLol));
        int n1 = 0, n2 = 0, n3 = 0;
        for (int n : nLol){
            if (n > 10)
                n1++;
            else if (n < 10)
                n2++;
            else
                n3++;
        }
        System.out.println("Elements that are more than 10 = " + n1);
        System.out.println("Elements that are less than 10 = " + n2);
        System.out.println("Elements that are 10 = " + n3);
        System.out.println();

        //Task 11
        int[] i1 ={5,8,13,1,2};
        int[] i2 ={9,3,67,1,0};
        int[] i3 ={0,0,0,0,0};
        for (int i = 0; i < i3.length; i++){
            if (i1[i] > i2[i])
                i3[i] = i1[i];
            else
                i3[i] = i2 [i];
        }
        System.out.println("1st array is = "+Arrays.toString(i1));
        System.out.println("2nd array is = "+Arrays.toString(i2));
        System.out.println("3rd array is = "+Arrays.toString(i3));
    }
}

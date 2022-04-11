package homework;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        //Task 1
        List<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(23);
        n1.add(67);
        n1.add(23);
        n1.add(78);
        System.out.println(n1.get(3));
        System.out.println(n1.get(0));
        System.out.println(n1.get(2));
        System.out.println(n1);
        System.out.println();

        //Task 2
        List<String> n2 = new ArrayList<>();
        n2.add("Blue");
        n2.add("Brown");
        n2.add("Red");
        n2.add("White");
        n2.add("Black");
        n2.add("Purple");
        System.out.println(n2.get(1));
        System.out.println(n2.get(3));
        System.out.println(n2.get(5));
        System.out.println(n2);
        System.out.println();

        //Task 3
        List<Integer> n3 = new ArrayList<>();
        n3.add(23);
        n3.add(-34);
        n3.add(-56);
        n3.add(0);
        n3.add(89);
        n3.add(100);
        System.out.println(n3);
        Collections.sort(n3);
        System.out.println(n3);
        System.out.println();

        //Task 4
        List<String> n4 = new ArrayList<>();
        n4.add("Istanbul");
        n4.add("Berlin");
        n4.add("Madrid");
        n4.add("Paris");
        System.out.println(n4);
        Collections.sort(n4);
        System.out.println(n4);
        System.out.println();

        //Task 5
        List<String> n5 = new ArrayList<>();
        n5.add("Spider Man");
        n5.add("Iron Man");
        n5.add("Black Panther");
        n5.add("Deadpool");
        n5.add("Captain America");
        System.out.println(n5);
        System.out.println(n5.contains("Wolverine"));
        System.out.println();

        //Task 6
        List<String> n6 = new ArrayList<>();
        n6.add("Hulk");
        n6.add("Black Widow");
        n6.add("Captain America");
        n6.add("Iron Man");
        Collections.sort(n6);
        System.out.println(n6);
        System.out.println(n6.contains("Hulk") && n5.contains("Iron Man"));
        System.out.println();

        //Task 7
        List<String> n7 = new ArrayList<>();
        n7.add("A");
        n7.add("x");
        n7.add("$");
        n7.add("%");
        n7.add("9");
        n7.add("*");
        n7.add("+");
        n7.add("F");
        n7.add("G");
        System.out.println(n7);
        for ( String n : n7) {
            System.out.println(n);
        }
        System.out.println();

        //Task 8
        List<String> n8 = new ArrayList<>();
        int startsM = 0;
        n8.add("Desk");
        n8.add("Laptop");
        n8.add("Mouse");
        n8.add("Monitor");
        n8.add("Mouse-Pad");
        n8.add("Adapter");
        int s = n8.size();
        System.out.println(n8);
        Collections.sort(n8);
        System.out.println(n8);
        for (String  n : n8){
            if (n.startsWith("M") || n.startsWith("m"))
                startsM++;
            if(n.contains("A") || n.contains("a") || n.contains("E") || n.contains("e"))
                 s--;
        }
        System.out.println(startsM);
        System.out.println(s);
        System.out.println();

        //Task 9
        List<String> n9 = new ArrayList<>();
        n9.add("Plate");
        n9.add("spoon");
        n9.add("fork");
        n9.add("Knife");
        n9.add("cup");
        n9.add("Mixer");
        int p = 0;
        int startsOrEnds = 0;
        int startsU = 0;
        int size = n9.size();
        System.out.println(n9);
        for (String l :
             n9) {
            if(l.charAt(0) > 64 && l.charAt(0) < 98 ) {
                startsU++;
            }
            if(l.contains("P") || l.contains("p")){
                p++;
                if (l.startsWith("P") || l.startsWith("p") || l.endsWith("P") || l.endsWith("p")){
                    startsOrEnds++;
                }
            }

        }
        System.out.println("Elements starts with uppercase = " + startsU);
        System.out.println("Elements starts with lowercase = " + (size-startsU));
        System.out.println("Elements having P or p = "+ p);
        System.out.println("Elements starting or ending with P or p = "+startsOrEnds);
        System.out.println();

        //Task 10
        List<Integer> n10 = new ArrayList<>();
        n10.add(3);
        n10.add(5);
        n10.add(7);
        n10.add(10);
        n10.add(0);
        n10.add(20);
        n10.add(17);
        n10.add(10);
        n10.add(23);
        n10.add(56);
        n10.add(78);
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        System.out.println(n10);
        for (Integer i:n10) {
            if (i % 10 == 0) {
                p1++;
            }
            if (i % 2 == 0 && i > 15) {
                p2++;
            }
            if (i % 2 != 0 && i < 20) {
                p3++;
            }
            if(i < 15 || i > 50){
                p4++;
            }
        }
        System.out.println("Elements that can be divided by 10 = " + p1);
        System.out.println("Elements that are even and greater than 15  = " + p2);
        System.out.println("Elements that are odd and less than 20  = " + p3);
        System.out.println("Elements that are less tha  15 or greater than 50 = " + p4);


    }
}

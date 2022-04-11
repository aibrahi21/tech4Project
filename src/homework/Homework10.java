package homework;

public class Homework10 {
    public static void main(String[] args) {
        //Task 1
        String s1 = "JavaScript";
        String[] sA = {"a", "e", "i", "o", "u"};
        // String s2 = "";
        if (s1.length() <= 0) {
            System.out.println("Length is 0");
        }
        else {
            System.out.println("Length is = " + s1.length());
            System.out.println("First char is = " + s1.substring(0, 1));
            System.out.println("Last char is = " + s1.substring(s1.length() - 1));
            if (s1.contains("a") || s1.contains("e") || s1.contains("i") || s1.contains("o") || s1.contains("u"));
            System.out.println("This string has a vowel");
        }
        System.out.println();

        //Task 2
        String m1 = "civic";
        int len_m1 = m1.length();
        if (len_m1 >= 3)
            if (len_m1%2 == 0)
                System.out.println(m1.substring(len_m1/2 - 1, len_m1/2+ 1));
            else
                System.out.println(m1.charAt(len_m1/2));
        else
            System.out.println("Length is less than 3");
        System.out.println();

        //Task 3
        String c1 = "abc";
        String c2 = "Java";
        String c3 = "Python";
        if (c1.length() > 4) {
            System.out.println("First 2 characters are = " + c3.substring(0,2));
            System.out.println("Last 2 characters are = " + c3.substring(c3.length()-2));
            System.out.println("The other characters are = " + c3.substring(2, c3.length()-2));
        }
        else
        System.out.println("INVALID INPUT");
        System.out.println();

        //Task 4
        String t4 = "xy";
        if (t4.length() < 2)
            System.out.println("Length is less than 2");
        else
            if(t4.substring(0,2).equals(t4.substring(t4.length()-2)))
                System.out.println("true");
            else
                System.out.println("false");

        System.out.println();

        //Task 5
        String t1 = "Blue";
        String t2 = "123456";
        if (t1.length() >= 2 && t2.length() >= 2) {
            String e1 = t1.substring(1, t1.length() - 1);
            String e2 = t2.substring(1, t2.length() - 1);
            System.out.println(e1 + e2);
        }
        else
            System.out.println("Invalid input!");
        System.out.println();
        //Task 6
        String x1 = "green";
        if (x1.length() >= 4) {
            boolean x3 = (x1.substring(0, 2).equals("xx") && x1.substring(x1.length() - 2).equals("xx"));
            System.out.println(x3);
        }
        else
                System.out.println("INVALID INPUT");
        System.out.println();
    }
}

package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java"; // [J, a, v, a]

        s.toCharArray();

        char[] chars = s.toCharArray();
//      ^^^^^^^^^^^^^^^^^ These lines are all combined in line 16
        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o]


    }
}

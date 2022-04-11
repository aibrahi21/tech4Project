package operators.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;
        boolean isANotEqualToB = a != b; //a is not equal to b

        System.out.println("a = b : " + isAEqualToB); // false
        System.out.println("\n");
        System.out.println("A != b : " +isANotEqualToB); // true

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterThanOrEqualToB = a >= b;
        boolean isALessThanOrEqualToB =  a <= b;
        System.out.println("a > b :" + isAGreaterThanB);           //false
        System.out.println("a < b :" + isASmallerThanB);           //true
        System.out.println("a >= b :" + isAGreaterThanOrEqualToB) ;//false
        System.out.println("a <= b :" + isALessThanOrEqualToB);    //true
        int x = 3;
        int y = 5;
        int z = 9;

        boolean bool = x + y == --z; // 3 + 5 = 9 - 1
//        bool = x + y + 1 == z;       // 3 + 5 + 1 = 9

        System.out.println("Naim's question: " + x + (y == --z));
        //Naim's question: 3false

    }
}

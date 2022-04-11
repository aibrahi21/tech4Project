package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {
        // Math.max (a:5, b:1, 5); Compiler error

       int max = MathHelper.maxOfThree(5, 2, 6);

        System.out.println("Max of 3 numbers is = " + max);

        MathHelper.maxOfThree(1.1, 1.3, 1.5);

        byte b1 = (byte)(Math.random()*10);
        byte b2 = (byte)(Math.random()*10);
        byte b3 = (byte)(Math.random()*10);
        System.out.println("random 1 = " + b1);
        System.out.println("random 2 = " + b2);
        System.out.println("random 3 = " + b3);
        MathHelper.minOfThree(b1, b2, b3);
        System.out.println(MathHelper.minOfThree(b1, b2, b3));


    }
}

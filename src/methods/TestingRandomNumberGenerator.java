package methods;
import utilities.Calculator;
import utilities.RandomNumberGenerator;

public class TestingRandomNumberGenerator {
    public static void main (String[] args){
        /*
        Write a program that generates 2 random number between 37 and 63 and finds their division
         */
        int rN1 = RandomNumberGenerator.getRandomNumber(37, 63);
        int rN2 = RandomNumberGenerator.getRandomNumber(37, 63);
        System.out.println("Random number 1 = " + rN1);
        System.out.println("Random number 2 = " + rN2);
        System.out.println(Calculator.divide(rN1, rN2));


    }
}

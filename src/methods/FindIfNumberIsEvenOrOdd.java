package methods;
import utilities.MathHelper;
import utilities.RandomNumberGenerator;
public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {


    /*
    Generate a random number between 17 and 33 (both included)
    First print "The number generated is = "
    Print "The number generated is EVEN" if the number is even
    Print "The number generated is ODD" if the number is odd
     */
int rN1 = (int)RandomNumberGenerator.getRandomNumber(17, 33);
        System.out.println("The number generated is = " + rN1);
        if(MathHelper.isEven(rN1)){
            System.out.println("The number generated is EVEN");
        }
        else{
            System.out.println("The number generated is ODD");
        }

    }
}


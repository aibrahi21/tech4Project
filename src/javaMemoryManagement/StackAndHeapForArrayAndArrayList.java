package javaMemoryManagement;
import java.util.*;


public class StackAndHeapForArrayAndArrayList {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Alex";
        names[1] = "Kaly";
        names[2] = "Abe";


        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList = null;
        System.gc();
        ArrayList<String> newL = new ArrayList(Arrays.asList(namesList));

        names[0] = "";

        System.out.println(Arrays.toString(names));


    }
}

package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        Vector<Boolean> booleans = new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        //Converting lists to Array
        System.out.println("\n-----First way--Manual Method");
        String[] namesArr = new String [names.size()];
        for (int i = 0; i < names.size(); i++){
            namesArr[i] = names.get(i);
        }
        System.out.println(Arrays.toString(namesArr));
        System.out.println("\n-----Second way--ToArray() Method");
        Object[] namesArr2 = names.toArray();
        System.out.println(Arrays.toString(namesArr2));

        //Can be done with every single other data type




    }
}

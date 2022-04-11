package collections.arrayLists;

import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */
        System.out.println("\n--------Task1--------\n");
        languages.remove("Python");
        System.out.println(languages);
/*
          Task -2
            Remove all elements that start with J
            Result:
            [C#, C++]
         for (String language : languages) {   //ConcurrentModificationException
               if (language.startsWith("J")) languages.remove(language);
            }



        for (int i = 0; i<languages.size(); i++){
            if(languages.get(i).startsWith("J")){
                languages.remove(languages.get(i));
                i--;
            }
        }

         */

        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);


    }
}
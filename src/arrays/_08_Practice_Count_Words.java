package arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        TASK-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
        */

        System.out.println("\n--------TASK-1--------\n");
        String s1 = "Today is Tuesday";

        int countSpace = 0;
        for(char c: s1.toCharArray()) {
            if (c == ' ') countSpace++;
        }

        System.out.println(countSpace+1);

        String[] words = s1.split(" ");
        System.out.println(words.length); //3

        /*
        TASK-2
        Assume you are given a String as below
        Please find how many words in the given string start with A or a

        String s2 = "Some countries I visited were Argentina, Belgium, and Malta";

        RESULT:
        2
        */
        String s2 = "Some countries I visited were Argentina, Belgium, and Malta";
        String[] words2 = s2.split(" ");
        int num_a = 0;
        for(String w: words2)
            if(w.substring(0,1).equalsIgnoreCase("a"))
                num_a++;
        System.out.println(num_a);

    }
}

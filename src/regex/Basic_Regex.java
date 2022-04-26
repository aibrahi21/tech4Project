package regex;

import java.util.regex.*;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love techGlobal");

        System.out.println(matcher.matches()); // returns true or false --> checks if the given string matches the given pattern

        while(matcher.find()) { // find the next matched pattern in the given string
            System.out.println(matcher.group() + " " + matcher.start() + " " + matcher.end()) ; // print out the next matched pattern in the given string + the index at of which the pattern is present + the index where the pattern ends
        }

    }
}

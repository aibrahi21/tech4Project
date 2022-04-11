package utilities;

public class CharacterHelper {
    /*public static void main(String[] args) {
        //testing purposes
        System.out.println("is space?" + isSpace('6'));
        System.out.println("is digit?" + isDigit('a'));
        System.out.println("is uppercase?" + isUppercase('a'));
        System.out.println("is lowercase?" + isLowercase('U'));
        System.out.println("is letter?" + isLetter('5'));
        System.out.println("is vowel?" + isVowel('w'));
        System.out.println("is consonant?" + isConsonant('A'));


    }
     */


//Task 1
    public static boolean isSpace(char character){
        return (character == 32);
    }
//Task 2
    public static boolean isDigit(char character){
        return (character >= 48 && character<= 57);
    }
//Task 3
    public static boolean isUppercase(char character){
        return (character >= 65 && character <=90);
    }
//Task 4
    public static boolean isLowercase(char character){
        return (character >= 97 && character <=112);
    }
//Task 5
    public static boolean isLetter(char character){
        return isUppercase(character) || isLowercase(character);
    }
//Task 6
    public static boolean isVowel(char character){
        //check if uppercase, check if one of 5 uppercase vowels
        if (isUppercase(character)){
            if(character == 65 || character == 69 || character == 73  || character == 79  ||character == 85)
                return true;
        }
        //check if lowercase, check if one of 5 lowercase vowels
        else if (isLowercase(character)){
            if(character == 97 || character == 101 || character == 105  || character == 111  || character == 117)
                return true;

        }
        return false;
    }
//Task 7
    public static boolean isConsonant(char character){
        return !isVowel(character);
    }


}


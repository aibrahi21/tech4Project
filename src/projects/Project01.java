package projects;

import java.sql.SQLOutput;

public class Project01 {
    public static void main(String[] args){
        //Task 1 Code
        String name = "Abdullah Ibrahim";
        //Task 2 Code
        char nameLetter1 = 'A';
        char nameLetter2 = 'b';
        char nameLetter3 = 'd';
        char nameLetter4 = 'u';
        char nameLetter5 = 'l';
        char nameLetter6 = 'l';
        char nameLetter7 = 'a';
        char nameLetter8 = 'h';
        //Task 3 Code
        String myFavAnime = "Kimetsu no Yaiba";
        String myFaveRamen = "DaiFuku Ramen";
        String myFaveLift = "Bench Press";
        //Task 4 Code
        int numberOfCarAccidents = 3;
        int numberOfInjuries = 2;
        int numberOfSiblings = 2;
        //Task 5 Code
        boolean amIAtSchoolToday;
        boolean onlineStudent = true;
        if (onlineStudent==true) {
            amIAtSchoolToday = false;
        }
        else {
            amIAtSchoolToday = true;
        }
        //Task 6 code
        boolean isWeatherNiceToday;
        boolean underOrEqual60F = true;
        if (underOrEqual60F==true){
            isWeatherNiceToday=false;
        }
        else
            isWeatherNiceToday=true;





        //Task 1 Print
        System.out.println(name +"\nThis is my name.");
        System.out.println("My name 1 is = " + name);



        //Task 2 Print
        System.out.println("Name letter 1 is = " + nameLetter1);
        System.out.println("Name letter 2 is = " + nameLetter2);
        System.out.println("Name letter 3 is = " + nameLetter3);
        System.out.println("Name letter 4 is = " + nameLetter4);
        System.out.println("Name letter 5 is = " + nameLetter5);
        System.out.println("Name letter 6 is = " + nameLetter6);
        System.out.println("Name letter 7 is = " + nameLetter7);
        System.out.println("Name letter 8 is = " + nameLetter8);


        //Task 3 Print
        System.out.println("My favorite Anime is = " + myFavAnime);
        System.out.println("My favorite lift is = "+ myFaveLift);
        System.out.println("My favorite ramen is = "+ myFaveRamen);


        //Task 4 Print
        System.out.println("My number of siblings is = " + numberOfSiblings);
        System.out.println("My mothers number of car accidents is = " + numberOfCarAccidents);
        System.out.println("My number of injuries is = " + numberOfInjuries);


        //Task 5 Print
        System.out.println("Am I at school today = " + amIAtSchoolToday);



        //Task 6 Print
        System.out.println("Weather is nice today = "+isWeatherNiceToday);




    }
}

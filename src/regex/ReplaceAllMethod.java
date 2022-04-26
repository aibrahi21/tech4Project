package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello world";
        String str2 = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println(str);
        System.out.println(str2);

        String str3 = "Hello123 world", str4;
        str4 = str3.replaceAll("[0-9]",".");
        System.out.println(str3);
        System.out.println(str4);


        String str5 = "abc 123 $#", str6;
        str6 = str5.replaceAll("[ -/]","");
        // or str5.replaceAll("[^A-za-z]","");
        System.out.println(str6);


    }
}

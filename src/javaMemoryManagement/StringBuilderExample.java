package javaMemoryManagement;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John"); //Johnathen
        sb.append("athen");

        System.out.println(sb); //Johnathen


        sb.append(123);
        System.out.println(sb);
        sb.insert(2, "$$$");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

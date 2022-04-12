package day08_IfStatements;

public class Cigarets {
    public static void main(String[] args) {

        byte age = 20;

        boolean c = age >= 18;

        if (c){
            System.out.println("is eligible");
        }
        if (!c){
            System.out.println("is not eligible");
        }
    }
}

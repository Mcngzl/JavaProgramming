package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n = 100;
        if (n>0){
        System.out.println("positive");
        }
        if (n<0) {
            System.out.println("Negative");
        }
        if (n==0){
        System.out.println("Zero");
        }

        System.out.println("------------------------------------------------------------------");
        boolean positive = n>0;
        boolean negative= n<0;


        if (positive){
            System.out.println("positive");
        }else if (negative){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }












    }
}

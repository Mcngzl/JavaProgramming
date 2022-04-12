package day08_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int number = 11;

        boolean a = number== 1,
                b = number == 2,
                c = number == 3,
                d = number == 4,
                e = number == 5,
                f = number == 6,
                g = number == 7,
                h = number == 8,
                i = number == 9,
                j = number == 10,
                k = number == 11,
                l = number == 12;

        if (a){
            System.out.println("january");
        }
        if (b){
            System.out.println("february");
        }
        if (c){
            System.out.println("march");
        }
        if (d){
            System.out.println("April");
        }
        if (e){
            System.out.println("May");
        }
        if (f){
            System.out.println("june");
        }
        if (g){
            System.out.println("July");
        }
        if (h){
            System.out.println("August");
        }
        if (i){
            System.out.println("September");
        }
        if (j){
            System.out.println("October");
        }
        if (k){
            System.out.println("Novamber");
        }
        if (l){
            System.out.println("December");
        }


    }
}
//task
//	1. write a program that can display the name of the month
//
//			number = 1 ~ 12
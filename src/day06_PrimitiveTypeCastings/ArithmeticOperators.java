package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12"+ 1);

        System.out.println(10+20);//addition
        System.out.println(50-20);// subtraction
        System.out.println(20*30);// multiplcation

        System.out.println(100 / 3);// 33
        System.out.println(10.0 / 4);// 2.5
        System.out.println(10/ 4.0);//2.5
        System.out.println(10d /4 );// 2.5
        /*
        integer/integer=integer
        decimal /integer===decimal
        inteer/decimal=====>decimal
        decimal/decimal====>decimal
         */

        int a = 100;
        double b= a/6; // 16  ????? 16.0
        System.out.println(b);

        double c = a/6d; // 16.6666
        System.out.println(c);
        //yada double c = (double)a/6 ====>> 16.666 olurr

        System.out.println(100d); // 100.0 olur






    }


}

package week02;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("10/3:"+ (10/3));
        System.out.println("10/3"+(10/3.0));


        //paranthesis comes first befpre concatination
        // java runs from top to bottom left to right

        int num1 =10;
        double num2 = 3.0;

        int result = (int) (num1/num2);// explicit casting

        System.out.println("result = " + result);








    }
}

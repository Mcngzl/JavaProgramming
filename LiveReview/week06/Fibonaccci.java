package week06;

import java.util.Scanner;

public class Fibonaccci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the term number for Fibonacci Series ? : ");
        int n = scanner.nextInt();
        int num1 = 0 , num2 = 1;
        int sum ;

        String series = ""+num1+" "+num2+" ";

        for( int i=2; i <= n ; i++){
            sum = num1 + num2;   // think of variables as buckets
            num1 = num2;
            num2 = sum;
            series += sum+" ";
        }

        System.out.println("series = " + series);
        System.out.println("final number in the squence is : "+ num2 );




    }
}

package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
int result = 0;
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);

        if (!(operator=='+' ||operator=='-')){
            System.err.println("Invalid Math Operator: "+operator);
            System.exit(0);
        }

        System.out.println("enter a number");
        int num2 = scan.nextInt();

        if (operator =='+'){
           result = num1+num2;
        }else {
            result = num1 - num2;
        }
        System.out.println("result = " + result);




    }
}

package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max =-2147483648;//reason is any user entered number will be greater than this
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num>max){//if the user entered number is greater than current max
                max =num;
            }


        }

        System.out.println("max = " + max);


    }
}
/*
write a program that ask the user to enter a number for 5 times.
return the maximum number
 */
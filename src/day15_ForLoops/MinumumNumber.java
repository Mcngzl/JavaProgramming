package day15_ForLoops;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int min =2147483647;// girecegi her rakam bundan dusuk olacak

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();//

            if (num<min){
                min=num;
            }
        }

        System.out.println("min = " + min);

    }
}
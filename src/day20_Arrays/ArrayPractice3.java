package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scacn =new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scacn.nextInt();

        if (length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int[]numbers =new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
            numbers[i]= scacn.nextInt();// each input provided during each execution
        }

        System.out.println(Arrays.toString(numbers));
        scacn.close();
    }
}
